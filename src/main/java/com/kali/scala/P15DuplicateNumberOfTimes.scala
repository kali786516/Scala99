package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
object P15DuplicateNumberOfTimes
{

  def main (args: Array[String]): Unit =
{
  //duplicate n times .....

  def duplicatenelement[A](l:List[A],n:Int):List[A] =
  {
    l.flatMap { a => List.fill(n)(a)}
  }

  def duplicatenelement2[A](l:List[A],n:Int):List[A] =
  {
    l.flatMap(x => List.fill(n)(x))
  }


  //duplicatenelement(List(1,2,3,4),3).toString().foreach(println)
  //val test=List(1,2,34,5)


  val test=List(1,2,34)

  test.map(x => List.fill(2)(x)).toString().foreach(println)
}

}
