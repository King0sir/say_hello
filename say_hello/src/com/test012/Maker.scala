package com.test012

/**
  * Created by kingsir on 16-11-7.
  */
class Maker private (val color:String){
  println("make "+this)
  override def toString(): String = "颜色标记："+ color
}
object Maker {
  private val makers:Map[String,Maker] = Map(
    "red" -> new Maker("red"),
    "blue" -> new Maker("blue"),
    "green" -> new Maker("green"))

  def apply(color:String) = {
    if(makers.contains(color)){
      makers(color)
    }else{
      null
    }
  }

  def getMaker(color:String): Unit ={
    if(makers.contains(color)){
      makers(color)
    }else{
      null
    }
  }

  def main(args: Array[String]) {
    println(Maker("red"))
    println(Maker getMaker "blue")
  }
}
