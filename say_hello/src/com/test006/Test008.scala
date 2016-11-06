package com.test006

/**
  * Created by kingsir on 16-11-4.
  */
object Test008 {
  def factorial(i:Int):Int={
    def fact(i:Int,accumulator:Int):Int={
      if(i<=1){
        return accumulator
      }else{
        return fact(i-1,i*accumulator)
      }
    }
    fact(i,1)
  }

  def main(args: Array[String]) {
    println(factorial(0))
    println(factorial(1))
    println(factorial(2))
    println(factorial(3))
  }
}
