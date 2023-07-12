# microservices-springboot-poject
this is a basic example on microservices using springboot 

to archieve this project we made use of springboot v.3.1.1 and jdk 17.
We created a config server that stores the location of every other service i.e it acts as a headmaster office of a school and stores information about every students.
- Later we created a discovery client service (Eureka sevice registry) that helps to register our different microservices. just like a school board where student come and see the available clubs
that are availble and join their clubs irrespectively. in simple terms registring to a club.
- Next we created a microservice that was called department. Here, our department service is just a common service like others that will be used to get Employees common to
a department.
- Nextly, we created a tracing service using Zipkin to trace all operations request that will be done by our microservices.
- We later created another microservice for employee. Here our employee is also just a common service like others, it will be used to perform crud operations to employee.
- lastly, we made use of an api gateway to filter our different request (Just like a gateman knowing which student belong to which class) and passed data to the requesting service pard.
