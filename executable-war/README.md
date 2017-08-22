#### Setup:

Assumption: the war is intended to
also work as a standalone executable. 

1. "SpringBootServletInitializer" is being used. 
1. "packaging" is correctly set to "war".
1. "configure" method is overridden properly.

#### Expected Result:
 
Build succeeds.
Artifact can be deployed as war or standalone.
Executing with IntelliJ SpringBoot runner works, 
but exits immediately instead of keeping the instance
running.
Using "mvn clean spring-boot:run" works. 