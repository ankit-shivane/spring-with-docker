# spring-with-docker
demo for spring boot with docker

STEPS to build 

docker build -f Dockerfile -t sb-with-docker .



docker run -p 8081:8081 sb-with-docker


#########
1) To pull image from docker hub

docker pull ankitshivane/sb-with-docker

2) To Upload an docker image 
STPE 1:
docker login --username=yourhubusername --email=youremail@company.com
OR 
docker login

STEP 2:
Give a tag to the docker image

docker tag aajhb8793cf ankitshivane/sb-with-docker:firstimg


STEP 3:
Now push an image to docker hub 

docker push ankitshivane/sb-with-docker:firstimg

NOTE:
1) To run your application on toolbox use #docker-machine ip cmd this will give you a ip address and you can then hit to this IP:port 
because in toolbox its published on toolbox vm private ip address port mapping  refer below link for info
https://forums.docker.com/t/cant-connect-to-container-on-localhost-with-port-mapping/52716/5



