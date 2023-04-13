pipeline{
    agent any
    tools {
        maven: 'Maven-3-9.1'
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
