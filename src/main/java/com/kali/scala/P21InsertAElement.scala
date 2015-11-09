package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P21InsertAElement
{

  def main (args: Array[String]): Unit =
{

  def SplitList[A](l:List[A],n:Int,value:List[A]):(List[A]) =
  {
    l.take(n):::value:::l.takeRight(l.length-n)
  }

  SplitList(List(1,2,3,4,5),2,List(77)).toString().foreach(println)
}

}
