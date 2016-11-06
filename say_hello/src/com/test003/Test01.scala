package com.test003

/**
  * Created by kingsir on 16-11-3.
  */
object Test01 {
  def main(args: Array[String]) {
    var myVar : String = "Foo"
    myVar = "Too"
    val myVal : String = "Foo"
//    myVal = "abc";
    val (myVal1,val2) = Pair(10,"abc")
    val (myVar1: Int, myVar2: String) = Pair(40, "Foo")
  }
}
