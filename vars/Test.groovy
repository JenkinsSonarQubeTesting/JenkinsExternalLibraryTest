@Grab(group='com.amazonaws', module='aws-java-sdk-s3', version='1.11.349')
import com.amazonaws.services.s3.*
//import com.testingJavaImports.testJava

def String call(message){
  testText = message
  echo message
}
def getS3Client(){
  return new AmazonS3Client()
}
def testJava(){
  //testJava jv = new testJava()
  //echo jv.testMethod()
}