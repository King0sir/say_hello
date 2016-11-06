package com.test003

/**
  * Created by kingsir on 16-11-3.
  */
package p{
  class Super{
    protected  def f() {println("f")}
  }
  class sub extends Super{
    f()
  }
  class other{
//    (new Super).f();
  }
}
