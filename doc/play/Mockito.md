### org.mockito.Mockito

```scala
val mockService = mock[Service]
```

在引入 mock 的时候我们可以传入第二个参数:

```scala
val mockService = mock[Service](RETURNS_SMART_NULLS)
```

可以对其Answer 进行设定;

```java
RETURNS_SMART_NULLS 返回 smart null 
     *   Foo mock = (Foo.class, RETURNS_SMART_NULLS);
     *
     *   //calling unstubbed method here:
     *   Stuff stuff = mock.getStuff();
     *
     *   //using object returned by unstubbed call:
     *   stuff.doSomething();
     *
     *   //Above doesn't yield NullPointerException this time!
     *   //Instead, SmartNullPointerException is thrown.
```

```scala
RETURNS_MOCKS 返回一切预期的 mock value
```

```java
RETURNS_DEEP_STUBS  返回多层级的结果
     *   Foo mock = mock(Foo.class, RETURNS_DEEP_STUBS);
     *
     *   // note that we're stubbing a chain of methods here: getBar().getName()
     *   when(mock.getBar().getName()).thenReturn("deep");
     *
     *   // note that we're chaining method calls: getBar().getName()
     *   assertEquals("deep", mock.getBar().getName());

     *   when(person.getAddress(anyString()).getStreet().getName()).thenReturn("deep");
     *   when(person.getAddress(anyString()).getStreet(Locale.ITALIAN).getName()).thenReturn("deep");
     *   when(person.getAddress(anyString()).getStreet(Locale.CHINESE).getName()).thenReturn("deep");
     *
     *   person.getAddress("the docks").getStreet().getName();
     *   person.getAddress("the docks").getStreet().getLongName();
     *   person.getAddress("the docks").getStreet(Locale.ITALIAN).getName();
     *   person.getAddress("the docks").getStreet(Locale.CHINESE).getName();
     *
     *   // note that we are actually referring to the very last mock in the stubbing chain.
     *   InOrder inOrder = inOrder(
     *       person.getAddress("the docks").getStreet(),
     *       person.getAddress("the docks").getStreet(Locale.CHINESE),
     *       person.getAddress("the docks").getStreet(Locale.ITALIAN)
     *   );
     *   inOrder.verify(person.getAddress("the docks").getStreet(), times(1)).getName();
     *   inOrder.verify(person.getAddress("the docks").getStreet()).getLongName();
     *   inOrder.verify(person.getAddress("the docks").getStreet(Locale.ITALIAN), atLeast(1)).getName();
     *   inOrder.verify(person.getAddress("the docks").getStreet(Locale.CHINESE)).getName();
```

```java
CALLS_REAL_METHODS  返回真实数据
     * Foo mock = mock(Foo.class, CALLS_REAL_METHODS);
     *
     * // this calls the real implementation of Foo.getSomething()
     * value = mock.getSomething();
     *
     * when(mock.getSomething()).thenReturn(fakeValue);
     *
     * // now fakeValue is returned
     * value = mock.getSomething();
```