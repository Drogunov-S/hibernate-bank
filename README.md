# Bank-card-service

### How to run
#### Pre-install
- Docker
- maven

#### To press run
```bash
mvn clean package -DskipTests
docker compose up
```

### Endpoints:  
[User without cards](http://localhost:8080/api/v1/user/1)  
__[ http://localhost:8080/api/v1/user/{id} ]__  
[User with cards](http://localhost:8080/api/v1/user/1?card=true)  
__[ http://localhost:8080/api/v1/user/{id}?card?(true\false) ]__  

- __id:__ digit from 1 to 30.
- __card:__ true,false or without.
