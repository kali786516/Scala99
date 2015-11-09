package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P3KthElement {

  def main (args: Array[String]) {

    def kthelemtn[A](l:List[A],n:Int):A=
    {
      try l(n)

      catch {
        case e:IndexOutOfBoundsException => throw  new NoSuchElementException
      }

    }
    //
    kthelemtn(List(1,23,45,5,6),1).toString.foreach(println)



  }

}
