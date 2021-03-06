package dz.sbenkhaoua.roadtraffic.spec.tools.rest.module.intersection.controller

import com.datastax.spark.connector._
import com.typesafe.config.{Config, ConfigFactory}
import org.apache.spark.SparkContext
import spark.jobserver.{SparkJob, SparkJobValid, SparkJobValidation}

/**
  * Created by sbenkhaoua on 19/04/15.
  */
class IntersectionCountNumber extends SparkJob {
   def main(args: Array[String]) {
     val ctx = new SparkContext("local[4]", "IntersectionCountNumber")
     val config = ConfigFactory.parseString("")

     val results = runJob(ctx, config)
   }

   override def validate(sc: SparkContext, config: Config): SparkJobValidation = {
     SparkJobValid;
   }

   override def runJob(sc: SparkContext, config: Config): Any = {
     val q = sc.cassandraTable("roadtraffic", "intersection")
     return  q.count()
   }
 }