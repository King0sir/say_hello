## spring

### Guide

#### Building a RESTful Web Service

###### pom.xml

> *  parent : spring-boot-starter-parent
> * Dependencies : spring-boot-starter-web, spring-boot-starter-test
> * Java.version : 1.8
> * Build : plugins : spring-boot-maven-plugin
> * Repositories : https://repo.spring.io/libs-release

###### controller

> * `@RestController` 包含 `@Controller` 和`@ ResponseBody` 以及一个有 value 的值
> * `@RequestMapping(value = "/greeting", method = GET)`
> * 参数`@RequestParam(value="name", defaultValue="World") String name`
> * `@PathValiable` 取自路径的变量

###### Application.java

> * `@SpringBootApplication` 包含了
>
> * > `@configuration`
>   >
>   > `@EnableAutoConfiguration`
>   >
>   > `@EnableWebMVC`相当于建立了一个 DispatcherServlet
>   >
>   > `@ComponentScan` 组件,以及其他的 spring 控件的加载

###### 启动

> * mvn spring-boot:run
>
> * ```sh
>   mvn clean compile
>   java -jar target/gs-rest-service-0.1.0.jar
>   ```

### Scheduling Tasks

###### pom.xml

> -  parent : spring-boot-starter-parent
> - Dependencies : spring-boot-starter-web
> - Java.version : 1.8
> - Build : plugins : spring-boot-maven-plugin

###### ScheduledTasks

```java
@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
}
```

> * `@Scheduled` 可以设置时间配置

```java
@Scheduled(fixedDelay=5000)
@Scheduled(fixedRate=5000)
@Scheduled(initialDelay=1000, fixedRate=5000)
@Scheduled(cron="*/5 * * * * MON-FRI")
```

###### Application.java

```java
@SpringBootApplication
@EnableScheduling
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class);
        //避免了配置 web.xml
    }
}
```

> * `@EnableScheduling` 开启时间任务.如果没有此标签,时间任务不会开启

### Consuming a RESTful Web Service

###### pom.xml

> -  parent : spring-boot-starter-parent
> - Dependencies : spring-boot-starter , spring-web, jackson-databind
> - Java.version : 1.8
> - Build : plugins : spring-boot-maven-plugin

###### pojo.java

```java
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {}
// JsonIgnoreProperties 的作用是在 json 转化为对象的时候避免其中抛出的异常
```

###### Application

我们可以在代码中通过调用 `RestTemplate` 来匹配远程的数据类型

```java
    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
    }
```

当然 `RestTemplate` 也支持POST PUT DELETE 方法

### Accessing Relational Data using JDBC with Spring

###### pom.xml

> -  parent : spring-boot-starter-parent
> - Dependencies : spring-boot-starter-jdbc, mysql / h2
> - Java.version : 1.8
> - Build : plugins : spring-boot-maven-plugin

###### Application

```java
@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... strings) throws Exception {

        log.info("Creating tables");

        jdbcTemplate.execute("DROP TABLE customers IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE customers(" +
                "id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255))");

        // Split up the array of whole names into an array of first/last names
        List<Object[]> splitUpNames = Arrays.asList("John Woo", "Jeff Dean", "Josh Bloch", "Josh Long").stream()
                .map(name -> name.split(" "))
                .collect(Collectors.toList());

        // Use a Java 8 stream to print out each tuple of the list
        splitUpNames.forEach(name -> log.info(String.format("Inserting customer record for %s %s", name[0], name[1])));

        // Uses JdbcTemplate's batchUpdate operation to bulk load data
        jdbcTemplate.batchUpdate("INSERT INTO customers(first_name, last_name) VALUES (?,?)", splitUpNames);

        log.info("Querying for customer records where first_name = 'Josh':");
        jdbcTemplate.query(
                "SELECT id, first_name, last_name FROM customers WHERE first_name = ?", new Object[] { "Josh" },
                (rs, rowNum) -> new Customer(rs.getLong("id"), rs.getString("first_name"), rs.getString("last_name"))
        ).forEach(customer -> log.info(customer.toString()));
    }
}
```

### Uploading Files

###### pom.xml

> -  parent : spring-boot-starter-parent
> - Dependencies : spring-boot-starter-thymeleaf,spring-boot-starter-test
> - Java.version : 1.8
> - Build : plugins : spring-boot-maven-plugin

暂略

###### Test

```java
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class FileUploadTests {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private StorageService storageService;

    @Test
    public void shouldListAllFiles() throws Exception {
        given(this.storageService.loadAll())
                .willReturn(Stream.of(Paths.get("first.txt"), Paths.get("second.txt")));

        this.mvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(model().attribute("files",
                        Matchers.contains("http://localhost/files/first.txt", "http://localhost/files/second.txt")));
    }

    @Test
    public void shouldSaveUploadedFile() throws Exception {
        MockMultipartFile multipartFile =
                new MockMultipartFile("file", "test.txt", "text/plain", "Spring Framework".getBytes());
        this.mvc.perform(fileUpload("/").file(multipartFile))
                .andExpect(status().isFound())
                .andExpect(header().string("Location", "/"));

        then(this.storageService).should().store(multipartFile);
    }

    @Test
    public void should404WhenMissingFile() throws Exception {
        given(this.storageService.loadAsResource("test.txt"))
                .willThrow(StorageFileNotFoundException.class);

        this.mvc.perform(get("/files/test.txt"))
                .andExpect(status().isNotFound());
    }

}
```

