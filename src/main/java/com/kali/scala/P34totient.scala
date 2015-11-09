package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P34totient {

  def main (args: Array[String])
  {

      def iscoprime(a: Int, b: Int): Boolean = {
        def gcd(a: Int, b: Int): Int = {
          if (b == 0) a else gcd(b, a % b)
        }
        gcd(a, b) == 1
      }

    def totient(n:Int,r:Int):Int= {
      (0 to r).filter(x => iscoprime(n, x)).length
    }
    //number of positive integers that are coprime of m
    print(totient(10,10))

  }

}
