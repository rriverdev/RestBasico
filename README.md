# REST BASICO GET/POST

### Reference Documentation
For further reference, please consider the following sections:

* [Download and deploy the project in the working IDE](https://github.com/rriverdev/RestBasico.git)
* Project type: Springboot.
* For this practice, the application will start in the default port 8080.
* Below are some examples of testing using postman.


## TEST WITH POSTMAN: GET 

GET: http://localhost:8080/api/v1/employees/getOne
GET: http://localhost:8080/api/v1/employees/getAll

## TEST WITH POSTMAN: POST (return a double value)

POST: http://localhost:8080/api/v1/employees/processISR
HEADERS: 
    K:Content-Type V:application/json

Body json:    
 {
     "cantidadPrincipal" : 9000,
     "iva" : 1.45,
     "periodo" : 1,
     "dias365" : 365,
     "cien" : 100,
     "dos" : 2,
     "iSR" : null
 }

### Author
* rrivasp, Greetings!

### Reference Aditional

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.5/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.4.5/reference/htmlsingle/#using-boot-devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.5/reference/htmlsingle/#boot-features-developing-web-applications)

