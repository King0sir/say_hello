package com.future

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

/**
  * Created by kinakihiro on 2017/2/23.
  */
class Test001 {

}
object Test001{
  def main(args: Array[String]): Unit = {

    for{
      a <- go(1)
      b <- go(2) if(false)
      c <- go(3)
    }yield{
      true
    }

  }

  private def go(i:Int) = {
    println(i)
    Future(i+1)
  }
}
