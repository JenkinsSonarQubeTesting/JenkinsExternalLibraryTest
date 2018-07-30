def call(body){
  try{
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    List<String> files = config.fileNames.getValues()
    echo files.toString()
    echo files.getClass().toString()
    def pattern = ~"(.*)test(.*)"

    List<String> nonMatches = files.flatten().findAll{ !pattern.matcher(it).find() }
    if(nonMatches.isEmpty()){
      return true 
    }
    else{
      echo "${nonMatches.size()} file(s) don't match pattern:\n"
      nonMatches.each{echo it.toString()}
      return false
    }
  }catch(Exception e){
   echo e.getMessage() 
  }
}
