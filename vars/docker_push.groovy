def call(String project, String imagetag, String dockerhubuser) {
    withCredentials([usernamePassword(
        credentialsId: 'Docker_Hub_Cred',
        usernameVariable: 'dockerhubuser',
        passwordVariable: 'dockerhubpass'
    )]) {
        sh "docker login -u ${dockerhubuser} -p $dockerhubpass"
        sh "docker push ${dockerhubuser}/${project}:${imagetag}"
    }
}
