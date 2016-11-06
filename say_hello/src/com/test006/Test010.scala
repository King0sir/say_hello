package com.test006

import java.util.Date

/**
  * Created by kingsir on 16-11-4.
  */
object Test010 {
  def main(args: Array[String]) {
    val date = new Date
    val logWithDateBound = log(date,_ :String)
    log(date,"message1")
    logWithDateBound("m1")
    Thread.sleep(1000)
    log(date,"message2")
    logWithDateBound("m2")
    Thread.sleep(1000)
    log(date,"message3")
    logWithDateBound("m3")
  }

  def log(date: Date,message:String) ={
    println(date +"----"+message)
  }
}
