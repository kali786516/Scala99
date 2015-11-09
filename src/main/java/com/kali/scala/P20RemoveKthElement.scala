package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P20RemoveKthElement {

  def main (args: Array[String]): Unit =
  {

    val test=List(1,2,3,4,5,6,7,787,78)

    //test(3).toString().foreach(println)
    //4

    //test.zipWithIndex.filter(x => x._2 !=3).toString().foreach(println)

    def RemoveKthElement[A](l:List[A],n:Int):List[Any] =
    {
      List(l.zipWithIndex.filter(x => x._2 !=n).map(x => x._1),l(n))

    }

    RemoveKthElement(List(1,2,3,4),2).toString().foreach(println)

  }

}
