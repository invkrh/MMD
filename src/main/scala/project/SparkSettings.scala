package project

import org.apache.spark.{SparkContext, SparkConf}

/**
 * Created with IntelliJ IDEA.
 * User: coderh
 * Date: 11/10/14
 * Time: 4:25 PM
 */
object SparkSettings {

  val sc = new SparkContext(
    new SparkConf()
      .setAppName("Finding_Similar_Sentence")
      .setMaster("local[8]")
      .set("spark.local.dir", "/tmp"))
}
