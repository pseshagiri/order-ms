pipeline{
    agent any
    
     environment {
       DOCKERHUB_CREDENTIALS = credentials('dockerhublogin')
      }
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
	    stage("Sinar Qube Check"){
		steps{
		  sh "/usr/bin/mvn sonar:sonar"	
		}    
	    }
		 stage("Docker Image and Building"){
           steps{
            script {
            withCredentials([usernameColonPassword(credentialsId: 'dockerhublogin', 
                     variable:'dockerhublogin')]){
                         sh 'docker build -t pseshagiri/microservices:orders-ms-3.0 .'
                     }
            }
               
           }
        }
        //stage("Docker Hub Push"){
          //steps{
           //script{
            //withCredentials([usernameColonPassword(credentialsId: 'dockerhublogin', 
              //       variable:'dockerhublogin')]) {    		
    		  //sh ' sudo echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'  
    		  
			//}
		  //}	
		 //}	        
        //}
        
        stage('Push') {
           steps {
           script{
             withCredentials([usernameColonPassword(credentialsId: 'dockerhublogin', 
                     variable:'dockerhublogin')]){
            // sh 'docker login -u "pseshagiri" -p "mypassword" docker.io'
                docker.withRegistry( '', 'dockerhublogin' ) {
             	sh 'docker push pseshagiri/microservices:orders-ms-3.0'
               }
             }
            } 
           }
        }
               
       stage("Kubernetus Deployment to mini kube"){
        // steps{
           // script{            
              //kubeconfig(credentialsId:'minikubeconfig',serverUrl:'https://127.0.0.1:32769') {
		     // kubeconfig(credentialsId: 'kubeconfigfile', serverUrl: '') {
    				//sh 'kubectl apply -f ./deployment.yaml '
			//}
                    
               //}                
             // }
           // }
          }  // kubernetes 
          
          
                                                   
        } //stages
        post{
          always{
            //script{
                sh 'docker logout'
            //}

          } 
        }

    }// pipelin//e

   
   
  
    

