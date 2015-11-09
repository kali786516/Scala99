package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P26NrecursiveList {

  def main (args: Array[String])
  {

    def p26_ncr_recursive[A](n: Int, ls: List[A]): List[List[A]] = {
      if (n==0) List(Nil)
      else ls match {
        case Nil => Nil
        case head :: tail => p26_ncr_recursive(n - 1, tail).map{head :: _ }::: p26_ncr_recursive(n, tail)
      }
    }

    p26_ncr_recursive(3,List(1,2,3,4,5)).toString().foreach(println)

  }

}
