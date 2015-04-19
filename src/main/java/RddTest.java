import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import scala.Tuple2;


import java.util.Arrays;

;

/**
 * Created by sbenkhaoua on 18/04/15.
 */
public class RddTest {



    public static Object main(String[] args) throws Exception {

        return null;
    }

    public Object Mafonction(JavaSparkContext sc){
        String s= "a a a a b b c a";
        JavaPairRDD<String, Integer> lines = sc.parallelize(Arrays.asList(s.split(" "))).mapToPair(new PairFunction<String, String, Integer>() {
            @Override
            public Tuple2<String, Integer> call(String s) {
                return new Tuple2<String, Integer>(s, 1);
            }
        }).reduceByKey(new Function2<Integer, Integer, Integer>() {
            @Override
            public Integer call(Integer i1, Integer i2) {
                return i1 + i2;
            }
        });
        return lines.collect();
    }

}
