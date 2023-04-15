pipeline{
    agent any
     tools {
       //tool name: 'Maven-3-9.1', type: 'maven'
       maven: 'Maven3'
    }
        
    stages{
       stage("Git Check Out"){
          steps{
            git branch: 'main', credentialsId: 'ordermsgithubid', url: 'https://github.com/pseshagiri/order-ms.git'
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
        stage("Kubernetus Deployment to mini kube"){
         steps{
            script{
                sh 'kubectl apply -f ./deployment.yaml'
              }
            }

          }                                            
        } //stages
    }// pipeline

   
   
  
    

