package com.test003

/**
  * Created by kingsir on 16-11-3.
  */
class Outer {
  class Inner{
    private def f(){println("f")}
    class InnerMost{
      f()
    }
  }
//  (new Inner).f()
}
