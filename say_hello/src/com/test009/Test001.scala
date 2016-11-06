package com.test009

/**
  * Created by kingsir on 16-11-5.
  */
object Test001 {
  var z :Array[String] = new Array[String](3);
  var z2  = new Array[String](3);

  z(0) = "baidu"
  z(1) = "ali"
  z(2) = "telent"

  def main(args: Array[String]) {
    var myList = Array(1.9,2.3,2.5,6.1);
    for(x <- myList){
      println(x)
    }

    var total = 0.0;
    for(i <- 0 to (myList.length -1)){
      total += myList(i);
    }
    println("total sum is :"+total);

    var max = myList(0);
    for(i <- 0 to (myList.length -1)){
      if(myList(i) > max){
        max = myList(i);
      }
    }
    println("max value is :"+max)
  }
}
