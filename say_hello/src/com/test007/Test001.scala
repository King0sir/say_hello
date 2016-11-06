package com.test007

/**
  * Created by kingsir on 16-11-4.
  */
object Test001 {
  val multiplier =(i:Int) => i*10

  var factor = 3
  val multiplier2 = (i:Int) => i*factor

  def main(args: Array[String]) {
    println( "muliplier2(1) value = " +  multiplier2(1) )
    println( "muliplier2(2) value = " +  multiplier2(2) )
  }
}
