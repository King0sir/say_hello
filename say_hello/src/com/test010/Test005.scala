package com.test010

/**
  * Created by kingsir on 16-11-6.
  */
object Test005 {

  def main(args: Array[String]) {
    val set = Set(1,2,3)
    println(set.getClass.getName)
    println(set)

    println(set.exists(_%2==0))
    println(set.drop(1))
  }
}
