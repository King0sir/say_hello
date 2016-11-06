package com.test010

/**
  * Created by kingsir on 16-11-5.
  */
object Test002 {
  def main(args: Array[String]) {
    val site1 = "a"::("b"::("c"::Nil))
    val site2 = "d"::("e"::Nil)

    var word = site1 ::: site2
    println("site1 + site2 = "+word)

    word = site1.:::(site2)
    println("site1.:::(site2) = "+word)

    word = List.concat(site1,site2)
    println("List.concat(site1,site2) = "+word)
  }
}
