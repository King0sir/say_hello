package com.test006

/**
  * Created by kingsir on 16-11-4.
  */
object Test009 {
  var inc = (x:Int) => x+1
  def add2 = new Function1[Int,Int]{
    def apply(x:Int):Int = x+1
  }
  var x = inc(7) - 1
  var mul = (x:Int,y:Int) => x*y

  var usrDir = () => {System.getProperty("user.dir")}

  def main(args: Array[String]) {
    println(x)
    println(mul(2,5))
    println(usrDir())

    println( "multiplier(1) value = " +  multiplier(1) )
    println( "multiplier(2) value = " +  multiplier(2) )
  }

  var factor  = 3
  var multiplier = (i:Int) => i*factor
}
