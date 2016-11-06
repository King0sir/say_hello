package com.test010

/**
  * Created by kingsir on 16-11-6.
  */
object Test015 {
  def main(args: Array[String]) {
    val sites = Map("runoob" -> "http://www.runoob.com",
      "baidu" -> "http://www.baidu.com",
      "taobao" -> "http://www.taobao.com")
    if(sites.contains("runoob")){
      println("runoob key exist  value is : "+sites("runoob"))
    }
  }
}
