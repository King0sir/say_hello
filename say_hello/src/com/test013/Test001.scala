package com.test013

/**
  * Created by gop on 9/11/16.
  */
object Test001 {
  def matchTest(x:Int):String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "else"
  }

  def main(args: Array[String]): Unit = {
    println(matchTest(3))
  }
}
