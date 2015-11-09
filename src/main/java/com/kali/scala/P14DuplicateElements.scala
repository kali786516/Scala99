package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P14DuplicateElements {

  def main (args: Array[String])
  {

    def duplicate[A](l:List[A]):List[A] =
    {
      l.flatMap { a => List(a,a)}
    }

    duplicate(List('a,'b,'c,'d)).toString().foreach(println)

  }

}
