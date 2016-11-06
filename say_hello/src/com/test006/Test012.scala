package com.test006

/**
  * Created by kingsir on 16-11-4.
  */
object Test012 {
  def main(args: Array[String]) {
    val str1:String = "Hello,"
    val str2:String = "Scala!"
    println("Str1+str2 = "+strcat(str1)(str2))
  }
  def strcat(s1:String)(s2:String) ={
    s1+s2
  }
}
