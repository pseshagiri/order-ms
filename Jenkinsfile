pipeline{
    agent any
   // tools {
       //tool name: 'Maven-3-9.1', type: 'maven'
     //  maven: 'Maven "3-9.1"'
    //}
        
    stages{
       stage("Git Check Out"){
          steps{
            git branch: 'main', credentialsId: 'githubUserDetails1', url: 'https://github.com/pseshagiri/order-ms.git'
          }
       }
       stage("Clean Build"){
           steps{
               sh "mvn clean install"
           }
        }
		 stage("Docker Image and Building"){
           steps{
            script {
              sh 'docker build -t pseshagiri/order-ms:1.0 .'
            }
               
           }
        }
 
    }

   
   
  
    
}
