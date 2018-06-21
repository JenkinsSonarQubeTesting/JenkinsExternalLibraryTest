import com.testingJavaImports.TestJava

def String call(message){
  echo message
  testText = TestJava.testMethod()
  echo testText
}

def test(){
  testText = TestJava.testMethod()
  echo testText

}
