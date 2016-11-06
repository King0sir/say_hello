package com.test010

/**
  * Created by kingsir on 16-11-6.
  */
object Test014 {
  def main(args: Array[String]) {
    val sites = Map("runoob" -> "http://www.runoob.com",
      "baidu" -> "http://www.baidu.com",
      "taobao" -> "http://www.taobao.com")

    sites.keys.foreach{
      i =>
        print("key = "+i)
        println(" value = "+sites(i))
    }
  }
}
