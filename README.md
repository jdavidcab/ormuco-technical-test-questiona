# Collinear

Collinear is a Java Restful microservice that accepts two lines (x1,x2) and (x3,x4) on the x-axis and returns whether they overlap.

## Documentation

The documentation was generated with Javadocs library and it is here in this repository. Folder below: 

```bash
/target/side/index.html
```

## Published

The service was published on AWS EC2 server over docker container. It was implemented with only POST method, url below:

```bash
http://ec2-54-67-7-50.us-west-1.compute.amazonaws.com:8080/collinear/isOverlapXAxis
```

Request:
```bash
{
    "pointX1":1,
    "pointX2":5,
    "pointX3":2,
    "pointX4":6
}
```
Response:
```bash
{
    "isOverlapXAxis": true
}
```

## Docker image
The docker image was published in dockerhub site. URL below:

```bash
https://hub.docker.com/repository/docker/jdavidcab/ormuco-technicaltest-questiona
```

## Test information
Your goal for this question is to write a program that accepts two lines (x1,x2) and (x3,x4) on the x-axis and returns whether they overlap. As an example, (1,5) and (2,6) overlaps but not (1,5) and (6,8).
