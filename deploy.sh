#!/usr/bin/env bash

set -e

ssh -i $keyfile ubuntu@$WebServer mkdir -p /home/ubuntu/works/$NameSpace
ssh -i $keyfile ubuntu@$WebServer ls /home/ubuntu/works
scp -i $keyfile ./build/libs/demo-*.jar ubuntu@$WebServer:/home/ubuntu/works/$NameSpace/demo.jar
ssh -i $keyfile ubuntu@$WebServer ls /home/ubuntu/works/$NameSpace
ssh -i $keyfile ubuntu@$WebServer 'kill -9 $(lsof -t -i:'$port') 2>&1 &'
ssh -i $keyfile ubuntu@$WebServer 'nohup java -jar /home/ubuntu/works/'$NameSpace'/demo.jar > /home/ubuntu/works/'$NameSpace'/demo.log 2>&1 &'