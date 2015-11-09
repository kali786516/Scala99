package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P6Pallindrome {

  def main (args: Array[String]) {

    val test=List(1,2,3,2,1)

    //@scala.annotation.tailrec

    def ispallindrome[A](l:List[A]):Boolean =
    {
      l == l.reverse
    }

    //ispallindrome(List(1,2,3,4,5)).toString.foreach(println)

    ispallindrome(List(1,2,3,2,1)).toString.foreach(println)

    //isPalindrome(List(1,2,3,2,1)).toString.foreach(println)

   // isPalindrome(List(1,2,3,4,5)).toString.foreach(println)
  }

}
