package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P5ReverseList {

  def main (args: Array[String]) {

    val test=List(1,43,756,876,836,8342178,8785)

    test.reverse.toString().foreach(println)

   def reversekali[A](l:List[A])=
   {
     l.reverse
   }

   reversekali(List(1,4,5,67)).toString().foreach(println)

  }

}
