package com.test014

/**
  * Created by gop on 9/11/16.
  */
object Test002 {
  def apply(x: Int) = x * 2

  def unapply(z: Int): Option[Int] = if (z % 2 == 0) {
    Some(z / 2)
  } else {
    None
  }

  def main(args: Array[String]): Unit = {
    val x = Test002(5)
    println(x)

    x match {
      case Test002(num) => println("x is double of "+num)
      case _ => println("unknow")
    }
  }
}
