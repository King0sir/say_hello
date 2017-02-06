package com.test016

/**
  * Created by kinakihiro on 2017/1/17.
  * Option 对象在使用的时候是否可以直接match
  */
object Test002 {

  def main(args: Array[String]): Unit = {
    val int = getIntOp(true)
    int match {
      case Some(num) => println(num)
      case None => println("none")
    }
    println(int)
  }

  def getIntOp(flag:Boolean) = {
    if(flag)
      Some(1)
    else
      None
  }

}
