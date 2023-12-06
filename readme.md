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

## Streamlined AWS Deployment: Elastic Beanstalk, Managed Services, and CDN Integration

To avoid operational/Management overhead lets use PAAS services in AWS

### 1. Modernizing Deployment with AWS Elastic Beanstalk:

### Elastic Beanstalk Ease:
- Deploy the Spring Boot application effortlessly on AWS Elastic Beanstalk.
- Leverage Elastic Beanstalk's simplicity for environment creation and management.

### Artifact Deployment from S3:
- Store the Spring Boot application artifact in an S3 bucket.
- Configure Elastic Beanstalk to seamlessly retrieve the artifact from S3 during deployment.

### 2. Enhanced Backend Services with AWS Managed Offerings:

#### AWS MQ for Messaging Excellence:
- Utilize AWS MQ (Managed Apache ActiveMQ) for messaging.
- Set up an AWS MQ broker for a fully managed messaging solution.

#### ElastiCache for Efficient Caching:
- Leverage AWS ElastiCache for caching needs, replacing traditional Memcached.
- Create an ElastiCache cluster for seamless integration with the Spring Boot application.

#### RDS for MySQL Management:
- Opt for AWS RDS for MySQL to simplify database management.
- Migrate the MySQL database to RDS for a fully managed database service.

### 3. Auto Scaling with Elastic Beanstalk:

#### Built-in Auto Scaling Support:
- Harness Elastic Beanstalk's inherent support for Auto Scaling.
- Configure Auto Scaling settings within the Elastic Beanstalk environment for dynamic scaling based on demand.

### 4. DNS and CDN Optimization:

#### Route 53 for Effortless DNS Management:
- Utilize AWS Route 53 for streamlined DNS management.
- Configure Route 53 to map the application domain to the Elastic Beanstalk environment URL.

#### CloudFront for Accelerated Content Delivery:
- Implement AWS CloudFront to act as a Content Delivery Network (CDN).
- Enhance content delivery, reduce latency, and bolster security with CloudFront integration.

![Screenshot from 2023-12-06 16-53-39.png](assets/phototwo.png)

