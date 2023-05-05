# Hello-Docker
## Description
I have built two spring boot applications (hello-docker, hello-docker2).
## Network 
I have created a bridge network between the two applications and mysql database to be able to connect to it without hardcoding the database host name 
### hello-docker
Has one api: (/api/users) which displays all the users from mysql database
### hello-docker2
Has one api: (/api/users) which posts a new user to mysql database
