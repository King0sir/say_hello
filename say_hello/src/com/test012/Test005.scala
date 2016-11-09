package com.test012

/**
  * Created by gop on 9/11/16.
  */
trait Equal{
  def isEqual(x:Any):Boolean
  def isNotEqual(x:Any):Boolean = !isEqual(x)
}

class Points(xc:Int ,yc:Int) extends Equal{
  var x : Int = xc
  var y : Int = yc

  override def isEqual(x: Any): Boolean =
    x.isInstanceOf[Points] &&
    x.asInstanceOf[Points].x == x
}
object Test005 {
  def main(args: Array[String]): Unit = {
    val p1 = new Points(1,2)
    val p2 = new Points(2,3)
    val p3 = new Points(3,4)

    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))

  }
}
