pipeline {
    agent any
    stages {
        stage ('Build Stage') {
            steps {
                configFileProvider([configFile(fileId: '121181fe-6db1-4085-90fa-e3f7cf3ccf80', variable: 'MyGlobalSettings')]) {
                    sh 'mvn -U -gs $MyGlobalSettings clean install -Dmaven.test.skip=true'
                }
            }
        }
        stage ('Install Stage') {
            steps {
                withMaven(maven : 'apache-maven-3.6.3') {
                    sh 'mvn clean install -Dmaven.test.skip=true'
                }
            }
        }
        stage('NonProd-Deliver Stage') {
          steps {
               sh 'scp -v -o StrictHostKeyChecking=no -i /var/lib/jenkins/secrets/nest-erc.pem target/*.jar ubuntu@10.1.4.14:~/Res${version}/lib/'
            }
        }
    }
}
