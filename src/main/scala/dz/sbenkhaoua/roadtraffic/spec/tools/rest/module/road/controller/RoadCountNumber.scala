package dz.sbenkhaoua.roadtraffic.spec.tools.rest.module.road.controller

import com.datastax.spark.connector._
import com.typesafe.config.{Config, ConfigFactory}
import org.apache.spark.SparkContext
import spark.jobserver.{SparkJob, SparkJobValid, SparkJobValidation}

/**
  * Created by sbenkhaoua on 19/04/15.
  */
class RoadCountNumber extends SparkJob {
   def main(args: Array[String]) {
     val ctx = new SparkContext("local[4]", "RoadCountNumber")
     val config = ConfigFactory.parseString("")

     val results = runJob(ctx, config)
   }

   override def validate(sc: SparkContext, config: Config): SparkJobValidation = {
     SparkJobValid;
   }

   override def runJob(sc: SparkContext, config: Config): Any = {
     val q = sc.cassandraTable("roadtraffic", "road")
     return  q.count()
   }
 }