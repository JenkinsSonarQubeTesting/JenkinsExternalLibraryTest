//import com.testingJavaImports.TestJava
import groovy.grape.Grape
//@groovy.lang.GrabConfig(systemClassLoader = true)
//@Grab(group='com.amazonaws', module='aws-java-sdk-s3', version='1.11.349')

//ClassLoader cl = new groovy.lang.GroovyClassLoader()
//Grape.grab(group='com.amazonaws', module='aws-java-sdk-s3', version='1.11.349', classLoader=cl)
//import com.amazonaws.services.s3.*

def String call(message){
  //AmazonS3Client s3 = new AmazonS3Client()
  this.class.classLoader.rootLoader.addURL(new URL("http://central.maven.org/maven2/com/amazonaws/aws-java-sdk-s3/1.11.351/aws-java-sdk-s3-1.11.351.jar"))
  def cls = Class.forName("com.amazonaws.services.s3.AmazonS3Client").newInstance()

  testText = message
  echo message
}
