def newGit(repo)
{
git 'https://github.com/intelliqittrainings/maven.git'
}

def newMaven()
{
sh 'mvn package'
}


