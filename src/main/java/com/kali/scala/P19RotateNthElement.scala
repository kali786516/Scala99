package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P19RotateNthElement {

  def main (args: Array[String]) {

    val test=List(1,2,3,4,5,6,7,8,9,10)

    val crap=test.takeRight(2):::test.dropRight(2)

    //crap.toString().foreach(println)

    def RotateN[A](l:List[A],n:Int):List[A] =
    {
      l.takeRight(n):::l.dropRight(n)
    }

    RotateN(List(1,2,3,4,5,6,7,8),3).toString().foreach(println)

  }

}
