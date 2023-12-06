### DEVOPS PROJECT

Tech stack
Spring Boot app
Rabbit MQ
Memcached
Mysql 

## Lift and Shift approach
implemented via shell scripts to automate the installation of the various services in the EC2 instances

### Spring Boot Application

#### EC2 Instance
- Launch an EC2 instance for the Spring Boot app.
- Configure Java, Tomcat, and app dependencies.
- Place the instance in "spring-app-sg" security group.

#### Auto Scaling Group
- Set up Auto Scaling Group for scalability.
- Define scaling policies based on metrics.

#### Application Load Balancer (ALB)
- Create an ALB to distribute incoming traffic.
- Configure listeners, health checks, etc.

#### Target Group
- Associate a target group with instances running the Spring Boot app.
- Attach the target group to the ALB.

### Backend Services (RabbitMQ, Memcached, MySQL)

#### EC2 Instances
- Launch separate EC2 instances for each service.
- Install and configure RabbitMQ, Memcached, and MySQL.

#### Security Group ("backend-sg")
- Create a common security group for backend instances.
- Define inbound/outbound rules to allow necessary traffic.

### Routing and DNS with Route 53

#### Route 53
- Use Route 53 to manage domain and DNS settings.

#### Alias Record
- Create an alias record in Route 53 pointing to the ALB.
- Ensure correct domain configuration to route traffic to the ALB.


![Screenshot from 2023-12-06 16-53-39.png](assets/photoone.png)
