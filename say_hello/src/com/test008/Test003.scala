package com.test008

/**
  * Created by kingsir on 16-11-5.
  */
object Test003 {
  def main(args: Array[String]) {
    var param = "www.douban.com"
    var param2 = "/123";
    var len = param.length();
    println("param`s lenth is "+len);

    println(param.concat(param2))
  }
}
