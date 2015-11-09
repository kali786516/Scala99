package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P4NumberOfElements {

  def main (args: Array[String]): Unit =
  {

    val test=List(1,43,756,876,836,8342178,8785)

    //test.length.toString.foreach(println)

    def Length[A](l:List[A]):Int =
    {
      l.length
    }

    Length(List(1,3,4,5,67)).toString.foreach(println)


  }

}
