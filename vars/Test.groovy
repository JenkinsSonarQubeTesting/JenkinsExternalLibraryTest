@Grab(group='com.amazonaws', module='aws-java-sdk-s3', version='1.11.349')
import com.amazonaws.services.s3.*
import com.testingJavaImports.TestJava

def String call(message){
  testText = message
  echo message
}
def getS3Client(){
  return new AmazonS3Client()
}
def testJava(){
  TestJava jv = new TestJava()
  echo jv.testMethod()
}