package com.test006

/**
  * Created by kingsir on 16-11-4.
  */
object Test005 {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 10){
      println(i+"的阶乘是："+factorial(i))
    }
  }

  def factorial(n:BigInt):BigInt={
    if(n<=1){
      return 1
    }else{
      return n*factorial(n-1)
    }
  }
}
