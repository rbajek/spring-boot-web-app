node('maven') {
   stage('Checkout') {
	   git branch: 'openshift', url: 'https://github.com/rbajek/spring-boot-web-app.git'
   }
   stage('Build') {
	   sh "mvn clean package"
   }
   stage('Integration tests') {
	   sh "mvn verify -DskipUTs=true"
   }
   stage('Build Image') {
	   sh "oc start-build sample-java-app --from-file=target/spring-boot-web-app.jar --follow"
   }
   stage('Deploy') {
	   openshiftDeploy depCfg: 'sample-java-app'
	   openshiftVerifyDeployment depCfg: 'sample-java-app', replicaCount: 1, verifyReplicaCount: true
   }
 }