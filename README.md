# vcapenv
Different ways to load VCAP_SERVICES values and properties from application.yaml

## Reads the specified subset of ENV variable "VCAP_SERVICES".
Note that in java, the properties are lower-case, underscores goto dots and compound keys goto "-" seperated
 
So, given from an OS shell:
```export VCAP_SERVICES='{"p-mysql": [{"credentials": {"username":"admin", "jdbcUrl": "jdbc:mysql://127.0.0.1:3306/albums?user=root"}, "name": "albums-mysql"}, {"credentials": {"jdbcUrl": "jdbc:mysql://127.0.0.1:3306/movies?user=root"}, "name": "movies-mysql"}]}'```
 
Or individually:
```export VCAP_SERVICES_ALBUMS_MYSQL_CREDENTIALS_USERNAME='admin'```
```export VCAP_SERVICES_ALBUMS_MYSQL_CREDENTIALS_JDBCURL='jdbc:mysql://127.0.0.1:3306/albums?user=root!'```

## Run using one of these methods:
- Set env and then "mvn spring-boot:run"
- VCAP_SERVICES='{}'... mvn spring-boot:run
- java -jar -Dspring.profiles.active=prod target/vcapenv-1.0-SNAPSHOT.jar
- Netbeans "Execute goal with modifiers...", Add > New Environment Variable, Env.VCAP_SERVICES={}. Note no single ticks around the {} value
