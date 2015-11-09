package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P36PrimeFactors {

  def main (args: Array[String]) {

    def isprime(a: Int, b: Int): Int = {
      def gcd(a: Int, b: Int): Int = {
        if (b == 0) a else gcd(b, a % b)
      }
      gcd(a, b)
    }

    def test(a:Int,b:Int):List[Int] = {
      if (isprime(a, b) %2 != 0) List(isprime(a, b)) else List(0)
    }

    def totient2(n:Int,r:Int):Seq[List[Int]]= {
      (0 to r).map(x => test(n, x))
    }

    print(totient2(315,19).groupBy(_+ "0" ).mapValues(_.length).toList)


  }

}
