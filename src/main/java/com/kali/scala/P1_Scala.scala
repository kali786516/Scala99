package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */

import org.apache.log4j.{Level, Logger}
import org.apache.spark.{SparkConf, SparkContext}

object P1_Scala {

  def main (args: Array[String])
  {
    Logger.getLogger("org").setLevel(Level.WARN)
    Logger.getLogger("akka").setLevel(Level.WARN)
    val conf = new SparkConf().setMaster("local[*]").setAppName("Last_element_of_a_List")
    val sc = new SparkContext(conf)

   /*find last element*/

    val test=List(1,43,756,876,836,8342178,8785)
   //test.zipWithIndex.last._1.toString.foreach(println)

    def lastkali[A](l:List[A]):A =
    {
      l.last

    }

    lastkali(List(1,2,4,6,78,8)).toString.foreach(println)

  }



}
