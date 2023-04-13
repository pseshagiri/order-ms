pipeline{
    agent any
    tools {
       maven 'Maven3'
      // tool name: 'Maven-3-9.1', type: 'maven'
    }
        
    stages{
       stage("Git Check Out"){
          steps{
            git branch: 'main', credentialsId: 'gitid', url: 'https://github.com/pseshagiri/order-ms.git'
          }
       }
       stage("Clean Build"){
           steps{
               sh "mvn clean install"
           }
        }

 
    }

   
   
  
    
}
