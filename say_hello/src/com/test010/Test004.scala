package com.test010

/**
  * Created by kingsir on 16-11-5.
  * List.tabulate() 方法是通过给定的函数来创建列表。
  * 方法的第一个参数为元素的数量，可以是二维的，第二个参数为指定的函数，我们通过指定的函数计算结果并返回值插入到列表中，起始值为 0，实例如下：
  *
  * List.reverse 用于将列表的顺序反转，实例如下：
  */
object Test004 {
  def main(args: Array[String]) {
    val squares = List.tabulate(6)(n=>n*n)
    println("squares = "+squares)

    val mul = List.tabulate(4,5)(_*_)
    println("mul = "+mul)

    println("reverse squares = "+squares.reverse)
    println("reverse mul = "+ mul.reverse)
  }
}
