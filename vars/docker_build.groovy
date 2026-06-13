def call(String project_name,String Imagetag,String dockeruser){
  sh "docker build -t ${dockeruser}/${project_name}:${Imagetag} ."
}
