package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P22ListRange
{

  def main (args: Array[String]): Unit =
{

  //val test=List(0 to 5)
  //test.toString().foreach(println)

  def RangeList[A](n1:Int,n2:Int):List[Any] =
  {
    List(n1 to n2)

  }

  RangeList(0,4).toString().replace("Range","").replace("(","").replace(")","").replace("List","").foreach(println)

}

}
