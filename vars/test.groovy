import com.testingJavaImports.TestJava

def String call(message){
  @Grab(group='com.amazonaws', module='aws-java-sdk-s3', version='1.11.349')
  testText = TestJava.testMethod()
  echo testText
}
