package com.test010

/**
  * Created by kingsir on 16-11-6.
  */
object Test008 {
  def main(args: Array[String]) {
    val site1 = Set("a","b","c")
    val site2 = Set("d","e")

    var site = site1 ++ site2
    println("site1 ++ site2 = "+site)

    site = site1.++(site2)
    println("site1.++(site2) = "+site)

  }
}
