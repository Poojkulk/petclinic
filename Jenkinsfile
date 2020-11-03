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
	  sh "${mvnHome}/bin/mvn -B clean install package"
	  echo "Build Successful"
	  }
          
    
  }  
