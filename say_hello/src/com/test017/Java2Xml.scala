package com.test017

import java.io.File
import javax.xml.bind.{JAXBContext, Marshaller}


/**
  * Created by kinakihiro on 2017/2/6.
  */
object Java2Xml {

  def main(args: Array[String]): Unit = {
    val customer = new Customer()
    customer.setAge(1)
    customer.setId(2)
    customer.setName("kin")

    val book = new Book
    book.setId(2)
    book.setName("scala impatience")

    customer.setBook(book)

    val file = new File("src/com/test017/gene.xml")
    val jaxbContent : JAXBContext = JAXBContext.newInstance(new Customer().getClass)
    val marshaller = jaxbContent.createMarshaller()

    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true)
    marshaller.marshal(customer,file)

  }

}
