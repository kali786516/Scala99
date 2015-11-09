package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P8RemoveDuplicates {

  def main (args: Array[String]) {

    val test=List(1,43,756,876,836,8342178,8785,1,43,756,876)

    //test.distinct.toString().foreach(println)

    val test2=List(1,2,3)

     //test2.foldLeft(0)((m:Int,n:Int) => m+n).toString.foreach(println)

    def compress[A](l:List[A]):List[A] = l.foldLeft(List[A]()) {
      case (ls,e) if (ls.isEmpty || ls.last != e) => ls:::List(e)
      case (ls,e) => ls
    }

    compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)).toString().foreach(println)

  }
}
