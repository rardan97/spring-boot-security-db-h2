## Spring Security - Simple Security With H2 Database

## System Requirements

- Java openjdk : ( version "17.0.2")
- Spring Boot : (version 3.2.5)
- H2 Database Engine : (Version 2.2.224 (2023-09-17))
- Maven : (Apache Maven 3.9.3)
- Editor : (Intellij IDEA 2023.1.1 Community Edition)

## run project

1. clone project Spring Security - Simple Security With H2 Database
```
git clone https://github.com/rardan97/spring-boot-security-db-h2.git
```

2. open project with intellij IDEA then edit config database h2 in application.properties match your config db

   #### location : spring-boot-security-db-h2/src/main/resources/application.properties

```
spring.application.name=spring-boot-security-db-h2
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:test

```

3. open terminal input command
```
mvn clean install 
```
4. if success next input command
```
mvn spring-boot:run
```