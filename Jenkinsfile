node {
stage('SCM Checkout'){
get 'https://github.com/ishanm120/JenkinsDemo'
}

stage('Compile Package'){
def mavnHome = tool name: 'Maven', type: 'maven'
sh "${mvnHome}/bin/mvn package"
}
}