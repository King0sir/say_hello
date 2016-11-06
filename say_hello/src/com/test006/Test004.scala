package com.test006

/**
  * Created by kingsir on 16-11-4.
  */
object Test004 {
  def main(args: Array[String]) {
    printStrings("ruby","scala","python")
  }
  def printStrings(args:String*) = {
    var i : Int = 0
    for(arg <- args){
      println("Arg value["+i+"] = "+arg)
      i += 1
    }
  }
}
