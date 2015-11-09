package com.kali.scala

/**
 * Created by kalit_000 on 07/11/2015.
 */
import org.apache.log4j.{Level, Logger}
import org.apache.spark.{SparkConf, SparkContext}

object P10WordCountList {
  def main (args: Array[String]) {

    Logger.getLogger("org").setLevel(Level.WARN)
    Logger.getLogger("akka").setLevel(Level.WARN)
    val conf = new SparkConf().setMaster("local[*]").setAppName("Last_element_of_a_List")
    val sc = new SparkContext(conf)


    val test=sc.parallelize(List(1,1,1,43,43,43,756,756,756))

    test.countByValue.toString().foreach(println)

  }

}
