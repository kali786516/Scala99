package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P16DropNthElement {

  def main (args: Array[String]) {

    val test=List(1,43,756,876,836,8342178,8785,1,43,756,876)

    //test.zipWithIndex.filter(x => x._2!=0).toString().foreach(println)

    def FilternthElement[A](l:List[A],n: Int):List[A] =
    {
    l.zipWithIndex.filter(x => x._2!=n).map(x => x._1)
    }

    FilternthElement(List(1,2,3,4),2).toString().foreach(println)



  }

}
