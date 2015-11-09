package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P33CoPrime {

  def main (args: Array[String]): Unit =
  {

    def iscoprime(a:Int,b:Int):Boolean= {
      def gcd(a: Int, b: Int): Int = {
        if (b == 0) a else gcd(b, a % b)
      }
      gcd(a,b) == 1
    }

    print(iscoprime(36,63))
    //print(iscoprime(35,64))


  }


}
