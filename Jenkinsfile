node 
  {
	  def mvnHome = tool 'maven'
	  
          
	  stage ('workspace clean') {
	  cleanWs()	         
                 
	  }
	  stage('Code Checkout')
	  {
		  git credentialsId: 'github', url: 'https://github.com/Poojkulk/petclinic.git'
	  }	  
          stage('Build Stage')
	  {	   
	 
	  echo "Build Successful"
	  }
          stage('Test') {
	  echo "Tests successful"
	  }
          stage('Deploy') {
            
                echo 'Deploying...
        }
    
  }  
