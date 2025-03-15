#!/bin/bash

# clean if needed
kill $(lsof -t -i:8080)
kill $(lsof -t -i:8081)
kill $(lsof -t -i:8082)

# start microservices
cd bookstore && mvn mn:run &
cd rating && mvn mn:run &
cd validator && mvn mn:run &
