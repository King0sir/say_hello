package com.test009

import Array._

/**
  * Created by kingsir on 16-11-5.
  */
object Test003 {
  def main(args: Array[String]) {
    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)

    var myList3 =  concat( myList1, myList2)

    // 输出所有数组元素
    for ( x <- myList3 ) {
      println( x )
    }
  }

}
