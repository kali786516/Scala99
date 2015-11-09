package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P9PackLists {

  def main (args: Array[String]) {



    def pack(list: List[Char]) = {
      def checkNext(a: List[List[Char]], prev: Char, l: List[Char]): List[List[Char]] = l match {
        case Nil => a
        case h::tail if h == prev => checkNext((h::a.head)::a.tail,h,tail)
        case h::tail => checkNext(List(h)::a,h,tail)
      }
      checkNext(List(List[Char](list.last)), list.last, list.init.reverse)
    }

    pack(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')).toString().foreach(println)

  }


}
