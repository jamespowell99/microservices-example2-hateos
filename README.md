**Spring Boot microservice example**

1. simple spring boot service to expose a REST interface for customers. uses HATEOS and exposes a HAL browser - see: http://localhost:8080
2. Also uses spring actuator - see links at http://localhost:8080/actuator for available endpoints
3. uses a custom health check module - TPSHealth. See TPSHealth value of http://localhost:8080/health
4. exposes some custom metrics - see the \*.customer.\* entries in http://localhost:8080/metrics
5. Swagger docs available here - http://localhost:8080/swagger-ui.html