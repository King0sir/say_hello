package com.test015

import java.io.{File, PrintWriter}

/**
  * Created by gop on 9/11/16.
  */
object Test001 {
  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter(new File(("test.txt")))

    writer.write("kin")
    writer.close()
  }
}
