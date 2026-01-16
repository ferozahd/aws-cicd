

# Deploy with using terminal 
create ec2 instance with pem then login by following connection 
ssh -i "tm.pem" ubuntu@ec2-13-222-125-138.compute-1.amazonaws.com

## Move jar local to remote instance 
scp -i tm.pem aws-cicd-app.jar ubuntu@ec2-13-222-125-138.compute-1.amazonaws.com:~

## Login again 
ssh -i "tm.pem" ubuntu@ec2-13-222-125-138.compute-1.amazonaws.com
look for java version 
java --version 
make sure correct java installed or  install correct java version 
run java file java -jar name_of_the_jar_file.jar

# Test the deployment 
ec2-13-222-125-138.compute-1.amazonaws.com:<PORT>/<path>
check security > security group if not accessible 
