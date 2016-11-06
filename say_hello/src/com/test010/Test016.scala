package com.test010

/**
  * Created by kingsir on 16-11-6.
  */
object Test016 {
  def main(args: Array[String]) {
    val t = (1,3.14,"abc")

    val t2 = new Tuple3(1,3.14,"abc")

    val t3 = (4,3,2,1)
    val sum = t3._1 + t3._2 + t3._3 + t3._4
    println("sum is : "+sum)
  }
}
