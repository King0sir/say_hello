package com.test010

import scala.collection.mutable.Set
/**
  * Created by kingsir on 16-11-6.
  */
object Test006 {
  def main(args: Array[String]) {
    val mutableSet = Set(1,2,3)
    println(mutableSet.getClass.getName)

    mutableSet.add(4)
    mutableSet.remove(1)
    mutableSet += 5
    mutableSet -= 2
    println(mutableSet)

    val another = mutableSet.toSet
    println(another.getClass.getName)
    println(another)
  }
}
