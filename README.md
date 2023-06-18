# SimpleRestExample

Simple project to provide some base features of Spring Framework (with Spring Boot)

1. Creating Components (@RestController, @Service)
2. REST server with GET endpoint '/example'

When the application starts Spring scans classes in specified packages
and creates instances of classes marked as @Service, @Component, @RestController and etc.
Instance of class ExampleServiceImpl is created first. When instance of ExampleController class is created Spring injects 
ExampleServiceImpl object as the most suitable for argument of type ExampleService.

@RestController with annotation @RequestMapping allows to create endpoints which can be called by any http client (web application, Postman, browser).
After running the application you go to http://localhost:8080/example in your browser and get example string.

One important note: this application is actually Spring Boot application (main class marked @SpringBootApplication). 
Spring Boot provides embedded web server which runs with the application. With Spring Boot we can skip the step "Deploy application into Tomcat" 
and start working with the application immediately after running it.
Also @SpringBootApplication includes some helpful annotations (for example @ComponentScan which Spring uses to know which packages will be scanned for components search) which allows to reduce configuration