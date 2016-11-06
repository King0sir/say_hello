package com.test008

/**
  * Created by kingsir on 16-11-5.
  */
object Test002 {
  def main(args: Array[String]) {
    val buff = new StringBuilder
    buff += 'a'
    buff ++= "abcde"
    println("buff is : "+buff.toString())
  }
}
