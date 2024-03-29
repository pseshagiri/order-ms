pipeline{
    agent any
    // environment {
      // DOCKERHUB_CREDENTIALS = credentials('dockerhublogin')
     //}
    // tools {
       //tool name: 'Maven-3-9.1', type: 'maven'
      // maven: 'Maven3'
    //}
        
    stages{
       stage("Git Check Out"){
          steps{
            git branch: 'main', credentialsId: 'ordermsgithubid', url: 'https://github.com/pseshagiri/order-ms.git'
          }
       }
       stage("Clean Build"){
           steps{
           //withMaven(globalMavenSettingsConfig: '--- Use system default settings or file path ---', jdk: '--- Use system default JDK ---', maven: 'Maven3', mavenSettingsConfig: '--- Use system default settings or file path ---') {
    			sh "/usr/bin/mvn clean install"
			//}
               
           }
        }
		 stage("Docker Image and Building"){
           steps{
            script {
              sh 'docker build -t 700258689816.dkr.ecr.ap-south-1.amazonaws.com/retails:orders-ms .'
            }
               
           }
        }
        //stage("Docker Hub Push"){
          //steps{
          //script{
           //withCredentials([usernameColonPassword(credentialsId: 'dockerhublogin', 
             //        variable: 'dockerhublogin')]) {    		
    		 //sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'  
    		  
			//}
		  //}	
		 //}	        
       // }
        
        //stage('Push') {
          // steps {
           //script{
             //sh 'docker push pseshagiri/microservices:order-ms-1.0'
            //} 
           //}
        //}       
       // stage("Kubernetus Deployment to mini kube"){
         //steps{
           /// script{
              // kubeconfig(credentialsId:'minikubeconfig',serverUrl:'http://192.168.49.1:8443') {
                // sh 'kubectl apply -f ./deployment.yaml'   
               //}                
              //}
           // }
          //}  // kubernetes 
          
          // stage('Pushing to ECR') {
    // steps{  
        // script {
              //  sh 'aws ecr get-login-password --region ap-south-1 | docker login --username AWS --password-stdin 700258689816.dkr.ecr.ap-south-1.amazonaws.com'
              //  sh 'docker push 700258689816.dkr.ecr.ap-south-1.amazonaws.com/retails:orders-ms'
        // }
       // }
     // }
          
           stage("Kubernetus Deployment to mini kube"){
           steps{
             script{
              // kubeconfig(credentialsId:'ekskubeconfig',serverUrl:'https://0F67688B4AA1E910144AE9D9D7518FDF.gr7.ap-south-1.eks.amazonaws.com') {
                 sh 'kubectl apply -f ./deployment.yaml'   
               //}                
              }
            }
          }  // eks kubernetes 
                                                   
        } //stages
        post{
          always{
            //script{
                sh 'docker logout'
            //}

          } 
        }

    }// pipelin//e

   
   
  
    

