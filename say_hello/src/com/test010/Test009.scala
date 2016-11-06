package com.test010

/**
  * Created by kingsir on 16-11-6.
  */
object Test009 {
  def main(args: Array[String]) {
    val num = Set(5,6,9,20,30,45)

    // 查找集合中最大与最小元素
    println( "Set(5,6,9,20,30,45) 集合中的最小元素是 : " + num.min )
    println( "Set(5,6,9,20,30,45) 集合中的最大元素是 : " + num.max )
  }
}
