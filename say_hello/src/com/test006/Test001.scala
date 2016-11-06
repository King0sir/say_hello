package com.test006

/**
  * Created by kingsir on 16-11-4.
  */
object Test001 {
  def addInt(a:Int ,b:Int) : Int = {
    var sum:Int = 0
    sum = a + b
    return sum
  }

  def main(args: Array[String]) {
    println("2+3="+addInt(2,3))
  }
}
