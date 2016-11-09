package org.test001

/**
  * Created by gop on 9/11/16.
  */
class Foo{}
object FooMaker{
  def apply: Foo= new Foo()
}

object Timer{
  var count = 0

  def currentCount(): Long = {
    count += 1
    count
  }

  def main(args: Array[String]): Unit = {
    for(i <- 1 to 10){
      println(Timer.currentCount())
    }
    Timer.currentCount()
  }
}
