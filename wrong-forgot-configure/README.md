#### Setup:

Assumption: the war is intended to
also work as a standalone executable. 

1. "SpringBootServletInitializer" is being used. 
1. "packaging" is correctly set to "war".
1. "configure" method is not overridden properly.

#### Expected Result:
 
The maven package goal will fail with the
error "javax.servlet.ServletException not found".