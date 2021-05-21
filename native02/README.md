# 說明

run

```shell
mvn clean spring-boot:build-image
```

then

```shell
docker run --rm -p 8080:8080 native:0.0.1-SNAPSHOT
```
