#### Setup:

Assumption: the artifact is intended to
also work as a standalone executable. 

1. "SpringBootServletInitializer" is being used. 
1. "configure" method is overridden properly. 
1. "packaging" is wrong (it should 
be "war" not "jar").

#### Expected Result:
 
The maven package goal will fail with the
error "javax.servlet.ServletException not found".