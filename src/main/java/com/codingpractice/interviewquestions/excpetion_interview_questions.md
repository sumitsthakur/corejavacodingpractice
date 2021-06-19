#  Exception Interview Questions

## Theory :

Q.


Q.


Q.


Q.



## Scenarios :

**Q. How can we handle multiple excpetion in catch block?**
 We can handle multiple exceptions in catch block after Java 7. 
 Syntax :  catch (Exception | Excpetion ex)
 	
**Q. What are the rules we have to follow for multi catch future.**
We can have n number of excpetions in multi catch blocks
If we have added base class excpetion in multi catch block then we can't add child class excpetion.
We can't assign exception object to new exception as it is final.

**Q. Can we assign a new excpetion to exception object which is catched in multi catch block? (ExceptionMultiCatchBlockRule1_3.java)**
No. exception object in multi catch block is final.
We can't assign it because when exception object is catched in multi catch block, 
complier is not sure which excpetion is going to be catched. 


