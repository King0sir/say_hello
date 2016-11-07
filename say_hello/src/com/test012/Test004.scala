package com.test012

/**
  * Created by kingsir on 16-11-7.
  */
//class Point(val xc: Int, val yc: Int) {
//  var x: Int = xc
//  var y: Int = yc
//  def move(dx: Int, dy: Int) {
//    x = x + dx
//    y = y + dy
//  }
//}

object Test004 {
  def main(args: Array[String]) {
    val point = new Point(10, 20)
    printPoint

    def printPoint{
      println ("x 的坐标点 : " + point.x);
      println ("y 的坐标点 : " + point.y);
    }
  }
}
