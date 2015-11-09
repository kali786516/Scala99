package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P32GCD {

   def main (args: Array[String]) {

     def gcd(a:Int,b:Int):Int =
     {
       if (b == 0) a else gcd(b,a%b)

     }

     print(gcd(36,63))

  }

}
