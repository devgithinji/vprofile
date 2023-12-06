### DEVOPS PROJECT

Tech stack
Spring Boot app
Rabbit MQ
Memcached
Mysql 

## Approach one 
running all the services in AWS cloud via EC2 instances 

Have the Spring boot app run in a EC2 instance in a separate Security group behind an autoscaling group

have the RabbitMQ, Memcached and Mysql running in EC2 instances under a same security group called backend

Here is brief illustration of the described architecture

![Screenshot from 2023-12-06 16-53-39.png](assets/photoone.png)
