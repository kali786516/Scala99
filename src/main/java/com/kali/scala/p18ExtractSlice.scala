package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object p18ExtractSlice {

  def main (args: Array[String]): Unit =
  {

    val test=List(1,2,3,4,5,6,7)

    val crap=List(test.zipWithIndex.filter(x => x._2 ==0),test.zipWithIndex.filter(x => x._2 == 4))

    //crap.toString().foreach(println)

   test.slice(0,4).toString().foreach(println)


  }

}
