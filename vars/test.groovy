//import com.testingJavaImports.TestJava
import groovy.grape.Grape
//@groovy.lang.GrabConfig(systemClassLoader = true)
//@Grab(group='com.amazonaws', module='aws-java-sdk-s3', version='1.11.349')

Grape.grab(group='com.amazonaws', module='aws-java-sdk-s3', version='1.11.349')
import com.amazonaws.services.s3.*

def String call(message){Grape.grab(group='com.amazonaws', module='aws-java-sdk-s3', version='1.11.349')
  testText = message
  echo message
}
