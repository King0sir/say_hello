package com.test009

import Array._

/**
  * Created by kingsir on 16-11-5.
  */
object Test002 {

  def main(args: Array[String]) {
    var myMatrix = ofDim[Int](3,3)

    for(i <- 0 to 2){
      for(j <- 0 to 2){
        myMatrix(i)(j) = j;
      }
    }

    for(i <- 0 to 2){
      for(j <- 0 to 2){
        print(" "+myMatrix(i)(j))
      }
      println()
    }
  }
}
