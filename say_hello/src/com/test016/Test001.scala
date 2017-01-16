package com.test016

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

/**
  * Created by kinakihiro on 2017/1/13.
  */
object Test001 {
  def main(args: Array[String]): Unit = {
    Future{
      throw new Exception()
    }.recover{
      case e:Exception => println("except")
    }
  }
}

