# hello_dropwizard

How to create a project of DropWizard 


**How to create a project of DropWizard**

1. Run the command
2. mvn archetype:generate
  -DarchetypeGroupId=io.dropwizard.archetypes
  -DarchetypeArtifactId=java-simple
  -DarchetypeVersion=2.0.0
  Please refer to the latest version then
 

How to start the hello_dropwizard application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/hello_drop-1.0-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`
1. Debug Application using :- 'java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -DlocalConfig=true -jar target/hello_drop-1.0-SNAPSHOT.jar server config.yml '

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`


**Must Check Condition **

1. Check if the server is set to default

2. Database Imformation:
  database name : data
  database table name : basic_data
  table contents : id int, name varchar(50)
  
3. Register Every Resource
