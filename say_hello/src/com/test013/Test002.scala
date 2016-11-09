package com.test013

/**
  * Created by gop on 9/11/16.
  */
object Test002 {
  def matchTest(x:Any):Any = x match {
    case 1 => "one"
    case "two" => 2
    case y:Int => "scala:Int"
    case _ => "many"
  }

  def main(args: Array[String]): Unit = {
    println(matchTest("two"))
    println(matchTest("test"))
    println(matchTest(1))
    println(matchTest(6))
  }
}
