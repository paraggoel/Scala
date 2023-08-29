package com.tech.parag.session

import org.apache.spark.sql.SparkSession

object SparkSessionDemo {
  
  def sparkSession():SparkSession = {
    SparkSession.builder().appName("ScalaDemo").master("local").getOrCreate()
  }
}