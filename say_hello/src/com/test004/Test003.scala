package com.test004

/**
  * Created by kingsir on 16-11-3.
  */
object Test003 {
  def main(args: Array[String]) {
    var a = true;
    var b = false;

    println("a && b = " + (a&&b) );

    println("a || b = " + (a||b) );

    println("!(a && b) = " + !(a && b) );
  }
}
