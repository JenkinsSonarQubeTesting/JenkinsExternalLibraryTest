//import com.testingJavaImports.TestJava
@groovy.lang.GrabConfig(systemClassLoader = true)
@Grab(group='com.amazonaws', module='aws-java-sdk-s3', version='1.11.349')
import com.amazonaws.services.s3.*

def String call(message){
  testText = message
  echo message
}
