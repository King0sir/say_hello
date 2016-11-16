## package play.api.data.Forms&Form

[apidoc](https://www.playframework.com/documentation/2.5.x/api/scala/index.html#play.api.data.Form)

```scala
val userForm = Form(
  mapping(
    "name" -> of[String],
    "age" -> of[Int],
    "email" -> of[String]
  )(User.apply)(User.unapply)
)
```

其中包括一部分接口：

```scala
  /** 单例情形
   * {{{
   * Form(
   *   single(
   *     "email" -> email
   *   )
   * )
   * }}}
   */
  def single[A1](a1: (String, Mapping[A1])): Mapping[(A1)] = mapping(a1)((a1: A1) => (a1))((t: (A1)) => Some(t))
```



```scala
  /** tuple类型
   * {{{
   * Form(
   *   tuple(
   *     "email" -> email,
   *     "password" -> nonEmptyText
   *   )
   * )
   * }}}
   */
  def tuple[A1, A2](a1: (String, Mapping[A1]), a2: (String, Mapping[A2])): Mapping[(A1, A2)] = mapping(a1, a2)((a1: A1, a2: A2) => (a1, a2))((t: (A1, A2)) => Some(t))
```

以及对应的类型：

```scala
  val text: Mapping[String] = of[String]
  val char: Mapping[Char] = of[Char]
  val nonEmptyText: Mapping[String] = text verifying Constraints.nonEmpty
  val number: Mapping[Int] = number()
  val longNumber: Mapping[Long] = longNumber()
  val shortNumber: Mapping[Short] = shortNumber()
  val byteNumber: Mapping[Byte] = byteNumber()
  val bigDecimal: Mapping[BigDecimal] = of[BigDecimal]
  val date: Mapping[java.util.Date] = of[java.util.Date]
  val uuid: Mapping[java.util.UUID] = of[java.util.UUID]
  val sqlDate: Mapping[java.sql.Date] = of[java.sql.Date]
  val jodaDate: Mapping[org.joda.time.DateTime] = of[org.joda.time.DateTime]
  val jodaLocalDate: Mapping[org.joda.time.LocalDate] = of[org.joda.time.LocalDate]
  val email: Mapping[String] = of[String] verifying Constraints.emailAddress
  val boolean: Mapping[Boolean] = of[Boolean]
```

对应的数据mapping有对应的转译接口：

```scala
  /** 将form数据解析成对应的数据，并且传入参数_.1是做错误处理，_.2做正常数据处理
   *{{{
   *   anyForm.bindFromRequest().fold(
   *      f => redisplayForm(f),
   *      t => handleValidFormSubmission(t)
   *   )
   * }}}
   */
  def fold[R](hasErrors: Form[T] => R, success: T => R): R = value match {
    case Some(v) if errors.isEmpty => success(v)
    case _ => hasErrors(this)
  }
```

