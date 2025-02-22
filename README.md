# Learning Spring Boot framework, creating a REST API
# Using annotations, such as @RestController to deal with HTTP requests and @RequestMapping to handle HTTP operations, and the base URL path
# The API layer is created with the @RestContoller annotation, in this case the UserController class
# The Data access layer using the @Repository annotation, in the UserRepository interface
# The table blueprint and its columns, using the @Entity,@Table,@Id,@Generated annotations, in the User class 
#UserApplication class is the main class where the project runs, using @SpringBootApplication annotation
#UserNotFoundException exception was created to handle user exception if user id not found
#application.properties file contains string connections to connect to database in this case using MySQL database. This file requires correct databaseName, username, and password created after downloading MYSQL, so the Spring Boot framework can connect to the existing database.
#Lastly, pom.xml file contains the projects dependencies written in XML format, when using Maven 
#The Spring Boot framework correctly connects to the database, and the localhost/8080//api/user works!


