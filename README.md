# Overview
 This is the test web application to get to know about Spring Security ( Authentication and Authorization) 

### Goal
 - Login Form
 - User Info Registration
 - Logout Form

### Prerequisites:
* Project
  * Gradle - Kotlin
* Language
  * Kotlin
* Framework
  * Spring Boot 3.0.1
* Packaging
  * Jar
* Java
  * 17
* DB
  * H2
* Spring Boot Security
  * 6.0.1
  
### How to run
Build the application and access http://localhost:8080/ and the system will redirect to login form


### Note
* Validation
  * If spring boot is 3xx stick with jakatar validation
  * If spring boot is 2xx stick with javax validation
* Spring Security
    * ``WebSecurityConfigurerAdapter`` is deprecated in Spring Security 5.7.0 
    * Since I used latest spring security version, `HttpSecurity` is configured by creating a SecurityFilterChain bean.
      * Reference : https://spring.io/blog/2022/02/21/spring-security-without-the-websecurityconfigureradapter
