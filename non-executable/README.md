#### Setup:

Assumption: the war is NOT intended to 
work as a standalone executable, and has been
configured to not be executable on purpose. 

1. "SpringBootServletInitializer" is being used. 
1. "packaging" is correctly set to "war".
1. "configure" method is overridden properly.
1. "main" method not provided.
1. "spring-boot-maven-plugin" not included.

#### Expected Result:
 
Build succeeds.
Artifact is NOT executable with "java -jar".
Artifact can be deployed as a war in tomcat but 
on startup the console receives a message "Error during artifact deployment. See server log for details.", 
but no other errors are found.

