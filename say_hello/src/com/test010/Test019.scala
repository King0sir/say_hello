package com.test010

/**
  * Created by kingsir on 16-11-6.
  */
object Test019 {
  def main(args: Array[String]) {
    val t = new Tuple2("www.google.com","www.baidu.com")
    println(t)
    println("swap = "+ t.swap)

    val t2 = (1,"tew",1.24,'c')
    println(t2)
  }
}
