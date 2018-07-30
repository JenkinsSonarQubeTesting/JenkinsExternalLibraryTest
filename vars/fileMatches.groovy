def call(body){
  try{
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    List<String> files = config.fileNames.getStrings()
    echo 'Files:'
    files.each{echo it.toString()}
    def pattern = ~"Jenkins(.*)"

    List<String> nonMatches = files.findAll{ !pattern.matcher(it).find() }
    if(nonMatches.isEmpty()){
      return true 
    }
    else{
      echo "${nonMatches.size()} file(s) don't match pattern:\n"
      nonMatches.each{echo it}
      return false
    }
  }catch(Exception e){
   echo e.getMessage() 
  }
}
