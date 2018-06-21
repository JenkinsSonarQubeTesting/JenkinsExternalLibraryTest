//import com.testingJavaImports.TestJava
import groovy.grape.Grape
//@groovy.lang.GrabConfig(systemClassLoader = true)
//@Grab(group='com.amazonaws', module='aws-java-sdk-s3', version='1.11.349')

//Grape.grab(group='com.amazonaws', module='aws-java-sdk-s3', version='1.11.349')
import com.amazonaws.services.s3.*

def String call(message){
  ClassLoader cl = new groovy.lang.GroovyClassLoader()
  Grape.grab(group='com.amazonaws', module='aws-java-sdk-s3', version='1.11.349', classLoader=cl)

  AmazonS3Client s3 = new AmazonS3Client()
  testText = message
  echo message
}
