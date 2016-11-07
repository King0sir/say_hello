package com.test012

/**
  * Created by kingsir on 16-11-7.
  */
class Person{
  var name = ""
  override def toString = getClass.getName + "[name="+name+"]"
}
class Employee extends Person{
  var salary = 0.0
  override def toString = super.toString + "[salary="+salary+"]"
}
object Test003 {
  def main(args: Array[String]) {
    var fred = new Employee
    fred.name = "Fred"
    fred.salary = 50000
    println(fred)

  }
}
