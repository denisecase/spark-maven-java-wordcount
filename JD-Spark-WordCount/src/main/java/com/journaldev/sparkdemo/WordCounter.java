package com.journaldev.sparkdemo;

// imports
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple2;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class WordCounter {

  private static void wordCount(String fileName) {

    // define a spark configuration


    // define a spark context


    // use textFile() to read data into RDD


    // use Java API to flatMap text into an RDD of strings (words)


    // use Java API to map each word to an output pair


    // save results to a folder (RDDs are complex)
    

  }

  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Please provide a single argument (text file name).");
      System.exit(0);
    }
    // call wordCount with the first argument
    wordCount(args[0]);
  }
}
