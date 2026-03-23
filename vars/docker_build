def call(String projectname, String imagetag, String dockerhubuser) {
    sh "docker build -t ${dockerhubuser}/${projectname}:${imagetag} ."
}
