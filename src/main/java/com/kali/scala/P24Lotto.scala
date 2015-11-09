package com.kali.scala

import java.util.Random

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P24Lotto {

  def main (args: Array[String]): Unit =
  {

    val r=scala.util.Random

   //Seq.fill(3)(r.nextInt(49)).toString().foreach(println)

    def RandomNumbers[A](n:Int):Seq[Int]=
    {
      val r=scala.util.Random

      Seq.fill(n)(r.nextInt(49))
    }

    RandomNumbers(2).toString().foreach(println)

  }

}
