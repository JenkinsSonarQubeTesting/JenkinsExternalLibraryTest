@Grab(group='com.amazonaws', module='aws-java-sdk-s3', version='1.11.349')

import com.amazonaws.services.s3.*

class Test implements Serializable{
  def String call(message){
    testText = message
    echo message
  }
  def getS3Client(){
    return new AmazonS3Client()
  }
  def testEcho(text){
    echo text
  }
}
return this