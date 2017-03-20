package com.test018

/**
  * Created by kinakihiro on 2017/3/16.
  */
class Test001 {

}
object Test001{
  def main(args: Array[String]): Unit = {
    val a : Option[String] = Some("")
    a match {
      case Some("a") => println("some a")
      case Some("") => println("some emptyString")
      case Some(_) => println("some")
      case None => println("none")
    }
  }
}
