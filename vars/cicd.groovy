def newGit(repo)
{
git 'https://github.com/intelliqittrainings/maven.git'
}

def newMaven()
{
sh 'mvn package'
}
def new Deploy(jobname,ipaddress,context)
{
sh  "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ipaddress}:/var/lib/tomcat9/webapps/${context}.war"
}


