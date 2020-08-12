# docker-springboot-mongodb
This is a multi container docker implementation using spring boot and mongo db

Build the docker image
```
docker build -f Dockerfile -t lalajith1/docker-spring-mongodb .
```
Link the spring boot app to mongodb images

8080 is the docker container port for spring-boot app

8085 exposed port of host for spring boot app
```
docker run -d --name my-mongodb mongo #mongodb image running
```
```
docker run -d -p 8085:8080 --link my-mongodb:mongodb lalajith1/docker-spring-mongodb
```

You can access mongo db image using below commands

```
docker exec -it mongodb bash
mongo
show dbs
```

Build the docker image using compose
```
docker-compose build
```

Start the docker image using compose
```
docker-compose up
```

# Docker Hub 

lalajith1/docker-spring-mongodb

# Author

Ajithlal K

