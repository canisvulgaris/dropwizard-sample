#!/bin/bash

# deploy
cd /home/ubuntu
#aws s3 cp s3://code-deploy-test-1/latest/my-app-1.0-SNAPSHOT.jar . --region us-east-1
#aws s3 cp s3://code-deploy-test-1/latest/app.yml . --region us-east-1

#run server
nohup java -jar my-app-1.0-SNAPSHOT.jar server app.yml &
