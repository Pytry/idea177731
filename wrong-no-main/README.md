#### Setup:

Assumption: the war is NOT intended to 
work as a standalone executable, and 
has been configured to not be executable 
on purpose. 

1. "SpringBootServletInitializer" is being used. 
1. "packaging" is correctly set to "war".
1. "configure" method is overridden properly.
1. "main" method not provided.
1. "spring-boot-maven-plugin" IS included,
but should not be.

#### Expected Result:
 
Build fails with exception "repackage failed: Unable to find main class".
