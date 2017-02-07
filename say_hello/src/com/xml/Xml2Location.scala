package com.xml

import java.io.File
import javax.xml.bind.JAXBContext

/**
  * Created by kinakihiro on 2017/2/6.
  */
object Xml2Location {

  def main(args: Array[String]): Unit = {
    val file = new File("src/com/xml/LocListZh.xml")

    val jaxbContent : JAXBContext = JAXBContext.newInstance(classOf[Location])
    val jaxbUnmarshaller = jaxbContent.createUnmarshaller()
    val location = jaxbUnmarshaller.unmarshal(file)
    println(location)
  }
}
