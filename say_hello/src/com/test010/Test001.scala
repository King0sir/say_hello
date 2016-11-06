package com.test010

/**
  * Created by kingsir on 16-11-5.
  */
object Test001 {
  val site: List[String] = List("baidu","ali","tenlent")
  val nums : List[Int] = List(1,2,3,4)
  val empty: List[Nothing] = List();
  val dim:List[List[Int]] = List(
    List(1,0,0),List(0,1,0),List(0,0,1)
  )

  val site2 = "baidu"::("ali"::("tenlent"::Nil))
  val nums2 = 1::(2::(3::(4::Nil)))
  val empty2 = Nil
  val dim2 = (1::(0::(0::Nil)))::(0::1::0::Nil)::(0::0::1::Nil)::Nil

  def main(args: Array[String]) {
    println("head of site = "+site.head)
    println("head of site2 = "+site2.head)
    println("head of site = "+site.tail)
    println("head of site2 = "+site2.tail)

    var key = 1::(2::(3::(4::Nil)))
    var key2 = 1::2::3::4::Nil
    println(key)
    println(key2)

    println("is site empty?"+site.isEmpty)
    println("is empty empty?"+empty.isEmpty)
  }
}
