package com.test011

/**
  * Created by kingsir on 16-11-7.
  */
object Test001 {
  def main(args: Array[String]) {
    val it = Iterator("baidu","ali","tengxun","google")

    while (it.hasNext){
      println(it.next())
    }

    val ita = Iterator(20,40,2,50,69, 90)
    val itb = Iterator(20,40,2,50,69, 90)

    println("max is :"+ita.max)
    println("min is :"+itb.min)
    println("size is :"+ita.size)
    println("length is "+itb.length)

    val itc = Iterator(20,40,2,50,69, 90)
    val itd = Iterator(20,40,2,50,69, 90)

    itc.next()
    itd.next()
    println("ita.size 的值: " + itc.size )
    println("itb.length 的值: " + itd.length )
  }
}
