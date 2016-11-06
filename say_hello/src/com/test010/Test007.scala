package com.test010

/**
  * Created by kingsir on 16-11-6.
  */
object Test007 {
  def main(args: Array[String]) {
    val site = Set("a","b","c")
    val nums:Set[Int] = Set()

    println("first character : "+site.head)
    println("last character : "+site.tail)
    println("is site empty : "+site.isEmpty)
    println("is nums empty : "+nums.isEmpty)
  }
}
