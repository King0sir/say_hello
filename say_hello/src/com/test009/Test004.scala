package com.test009
import Array._
/**
  * Created by kingsir on 16-11-5.
  */
object Test004 {
  def main(args: Array[String]) {
    var myList1 = range(10,20,2)
    var myList2 = range(10,20)
    for ( x <- myList1 ) {
      print( " " + x )
    }
    println()
    for ( x <- myList2 ) {
      print( " " + x )
    }
  }
}
