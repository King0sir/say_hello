package com.test015

import scala.io.Source

/**
  * Created by gop on 9/11/16.
  */
object Test003 {
  def main(args: Array[String]): Unit = {
    println("file message is :")
    Source.fromFile("test.txt").foreach{
      print
    }
  }
}
