pipeline{
    agent any
    environment {
        maven:Maven3
    }
    
    stages{
       stage("Git Check Out"){
          steps{
            git branch: "main" credentialsId:"GitHubUserName" uri: 
          }
       }
       stage("Clean Build"){
           steps{
               sh "maven clean install"
           }

       }

 
    }

   
   
  
    
}
