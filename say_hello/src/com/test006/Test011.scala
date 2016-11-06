package com.test006

/**
  * Created by kingsir on 16-11-4.
  */
object Test011 {
  def add(x:Int,y:Int)=x+y
  def add2(x:Int)(y:Int) = x+y
  def add3(x:Int)=(y:Int) => x+y
  val result = add3(1)
  val sum = result(2)


}
