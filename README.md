# tutorial-microservices-admin-dashboard

<b>Spring boot Admin</b>

This is for Monitoring the Microservies performance, statistics like memory useage, endpoints triggering etc <br>
spring-boot-starter-security ( for credentials) <br>
spring-boot-admin-server (for identifying the microservices) <br>
spring-boot-admin-server-ui ( for User interface) <br>
spring-boot-starter-mail ( email configuartion if you want alert to be notified if any service is down) <br>

<b> Eureka Server<b> <br>
for Microservice Registry and Discovery <br>
  
  <b> User Service </b> <br>
  spring-boot-starter-actuator (for fetching the microservice metrics) <br>
  spring-cloud-starter-netflix-eureka-client ( for registering into Eureka) <br>
  spring-boot-admin-starter-client ( for registering into Admin server) <br>
  Microservice for testing weather registered in Sping boot admin <br>
