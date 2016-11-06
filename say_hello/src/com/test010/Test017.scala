package com.test010

/**
  * Created by kingsir on 16-11-6.
  */
object Test017 {
  def main(args: Array[String]) {
    val t = (4,3,2,1)
    t.productIterator.foreach{i => println("value = "+i)}
  }
}
