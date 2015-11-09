package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P2LastButOneElement {

  def main (args: Array[String]): Unit =
  {

    val test=List(1,43,756,876,836,8342178,8785)

    val crap=test.zipWithIndex.last._2
    val test2=crap-1

    //test.zipWithIndex.filter(x => x._2==test2).map(x => x._1).toString().foreach(println)

    def LastButOne[A](l:List[A]):A =
    {
      //init is a scala function which returns last but one element ...
      l.init.last
    }

    LastButOne(List(1,43,756,876,836,8342178,8785)).toString.foreach(println)

  }

}
