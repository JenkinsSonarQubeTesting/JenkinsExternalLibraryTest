@Grab(group='com.amazonaws', module='aws-java-sdk-s3', version='1.11.349')

import com.amazonaws.services.s3.*

def String call(message){
  testText = message
  echo message
}
def AmazonS3Client getS3Client(){
  return new AmazonS3Client()
}
def testEcho(text){
  echo text
}
