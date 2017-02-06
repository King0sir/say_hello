package com.test017

import java.io.{File, PrintWriter, Writer}
import javax.xml.bind.JAXBContext

/**
  * Created by kinakihiro on 2017/2/6.
  */
object Xml2Java {

  def main(args: Array[String]): Unit = {
    val file = new File("src/com/test017/test.xml")

    val jaxbContent : JAXBContext = JAXBContext.newInstance(new Customer().getClass)
    val jaxbUnmarshaller = jaxbContent.createUnmarshaller()
    val customer = jaxbUnmarshaller.unmarshal(file)
    println(customer)
  }
}
