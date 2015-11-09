package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P17SplitListNElements {

  def main (args: Array[String])
  {
    val test=List(1,43,756,876,836,8342178,8785,1,43,756,876)

    //test.take(2).toString().foreach(println)

    //test.takeRight(test.length-2).toString().foreach(println)


    def SplitList[A](l:List[A],n:Int):(List[A],List[A]) =
    {
      (l.take(n),l.takeRight(l.length-n))
    }

    SplitList(List(1,2,3,4,5,6,7,8),2).toString().foreach(println)
  }

}
