pipeline{
    agent any
    tools {
        maven: 'Maven3'
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
