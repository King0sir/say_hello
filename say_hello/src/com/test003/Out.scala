package com.test003

/**
  * Created by kingsir on 16-11-3.
  */
class Out {
  class Inn{
    def f(){println("a")}
    class InnMost{
      f()
    }
  }
  (new Inn).f()
}
