package com.test013

/**
  * Created by gop on 9/11/16.
  */
object Test003 {
  def main(args: Array[String]): Unit = {
    val kin = new Person("kin",21)
    val ming = new Person("ming",22)
    val hao = new Person("hao",23)

    for(person <- List(kin,ming,hao)){
      person match {
        case Person("kin",21) => println("hello kin");
        case Person("ming",22) => println("hello ming");
        case Person(name,age) => println("who are you")
      }
    }
  }

  case class Person(name:String,age:Int)
}
