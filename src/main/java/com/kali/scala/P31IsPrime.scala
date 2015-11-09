package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P31IsPrime {

  def main (args: Array[String]): Unit =
  {

    val test=List(1,2,3,4,5,6)

    //test.filter(x => x%2 !=0).toString().foreach(println)

    def isPrime[A](n:Int):Boolean=
    {
       n%2 != 0
    }

     //test.map(x => x%2 !=0).toString().foreach(println)

    isPrime(4).toString.foreach(println)


  }


}
