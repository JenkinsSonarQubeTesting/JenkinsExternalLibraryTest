def call(body){
  def config = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = config
  body()

  List<String> files = config.fileNames.getValues()
  def pattern = ~"Jenkins(.*)|(.*)test(.*)"

  List<String> nonMatches = files.flatten().findAll{ !pattern.matcher(it).find() }
  if(nonMatches.isEmpty()){
    return true 
  }
  else{
    echo "${nonMatches.size()} file(s) don't match pattern:\n"
    nonMatches.each{echo it}
    return false
  }
}
