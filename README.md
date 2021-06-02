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
2. Start application with `java -jar target/hello_drop-1.0-SNAPSHOT.jar server config.yml`
3. To check that your application is running enter url `http://localhost:8080`

For running application directly through IntelliJe Idea :- 
1. Add server config.yml in program arguments
2. If there are any initilizers in project then add them in VM Options



Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`


