package com.test008

/**
  * Created by kingsir on 16-11-5.
  */
object Test004 {
  def main(args: Array[String]) {
    var floatVar = 123.45f
    var intVar = 1234
    var stringVar = "kin"
    var fs = printf("浮点型变量为 " +
      "%f, 整型变量为 %d, 字符串为 " +
      " %s", floatVar, intVar, stringVar)
    println(fs)
    fs = printf("hello")
    println(fs.asInstanceOf[AnyRef].getClass().getSimpleName())

  }
}
