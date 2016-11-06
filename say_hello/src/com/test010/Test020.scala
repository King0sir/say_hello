package com.test010

/**
  * Created by kingsir on 16-11-6.
  */
object Test020 {
  def main(args: Array[String]) {
    val myMap :Map[String,String] = Map("key1"->"value1")
    val value1 : Option[String] = myMap.get("key1")
    val value2 : Option[String] = myMap.get("key2")

    println(value1);println(value2)
  }
}
