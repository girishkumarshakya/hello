package com

import com.address.Address
import org.springframework.context.support.ClassPathXmlApplicationContext

fun main(){
    val context = ClassPathXmlApplicationContext("config.xml")
    val helloMessage = context.getBean("ms",HelloMessage::class)
    System.out.println(helloMessage)
    val address = context.getBean("address", Address::class)
    System.out.println(address)
}