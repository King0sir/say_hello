package com.test006

/**
  * Created by kingsir on 16-11-4.
  */
object Test006 {
  def addInt(a:Int = 7,b:Int = 12):Int={
    var sum :Int = 0;
    sum = a+b
    return sum
  }

  def main(args: Array[String]) {
    println(addInt())
  }
}
