package com.test006

/**
  * Created by kingsir on 16-11-4.
  */
object Test002 {
  def main(args: Array[String]): Unit = {
    delayed(time)
  }

  def time() = {
    println("获取时间")
    System.nanoTime()
  }

  def delayed(t:()=>Long) = {
    println("在delayed方法内")
    println("参数："+t())
    println("abc")
    println("参数："+t())
    t();t();t();t();t()
  }
}
