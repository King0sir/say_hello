package com.test006

/**
  * Created by kingsir on 16-11-4.
  */
object Test007 {

  def main(args: Array[String]) {
    println(apply(layout,10))
  }

  def apply(f:Int => String,v:Int) = f(v)

  def layout[A](x:A)="["+x.toString+"]"
}
