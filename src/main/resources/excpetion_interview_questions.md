#  Exception Interview Questions  

## Theory :  

**Q. What Is an Exception?**  
An exception is an abnormal event that occurs during the execution of a program and disrupts the normal flow of the program's instructions.

**Q.What Is the Purpose of the Throw and Throws Keywords? **  
The throws keyword is used to specify that a method may raise an exception during its execution. It enforces explicit exception handling when calling a method:
Eg. public void simpleMethod() throws Exception 

The throw keyword allows us to throw an exception object to interrupt the normal flow of the program. This is most commonly used when a program fails to satisfy a given condition:
Eg. throw new IOException();

**Q. Explain the keywords used in Java Exceptions?**  
throw: Sometimes we explicitly want to create an exception object and then throw it to halt the normal processing of the program. The throw keyword is used to throw exceptions to the runtime to handle it.

throws: When we are throwing any checked exception in a method and not handling it, then we need to use the throws keyword in the method signature to let the caller program know the exceptions that might be thrown by the method. The caller method might handle these exceptions or propagate them to its caller method using the throws keyword. We can provide multiple exceptions in the throws clause and it can be used with the main() method also.

try-catch: We use try-catch block for exception handling in our code. try is the start of the block and catch is at the end of the try block to handle the exceptions. We can have multiple catch blocks with a try and try-catch blocks can be nested also. catch block requires a parameter that should be of type Exception.

finally: The finally block is optional and can be used only with a try-catch block. Since exception halts the process of execution, we might have some resources open that will not get closed, so we can use the finally block. The finally block gets executed always, whether an exception occurs or not.


**Q. What Is the Difference Between a Checked and an Unchecked Exception?**    
Checked Exceptions should be handled in the code using try-catch block or else the method should use the throws keyword to let the caller know about the checked exceptions that might be thrown from the method. Unchecked Exceptions are not required to be handled in the program or to mention them in the throws clause of the method.
Exception is the superclass of all checked exceptions whereas RuntimeException is the superclass of all unchecked exceptions. Note that RuntimeException is the child class of Exception.
Checked exceptions are error scenarios that require to be handled in the code, or else you will get compile time error. For example, if you use FileReader to read a file, it throws FileNotFoundException and we must catch it in the try-catch block or throw it again to the caller method. Unchecked exceptions are mostly caused by poor programming, for example, NullPointerException when invoking a method on an object reference without making sure that it’s not null. For example, I can write a method to remove all the vowels from the string. It’s the caller’s responsibility to make sure not to pass a null string. I might change the method to handle these scenarios but ideally, the caller should take care of this.

**Q. Explain Java Exception Hierarchy?**   
Java Exceptions are hierarchical and inheritance is used to categorize different types of exceptions. Throwable is the parent class of Java Exceptions Hierarchy and it has two child objects – Error and Exception. Exceptions are further divided into checked exceptions and runtime exceptions.

Errors are exceptional scenarios that are out of the scope of application and it’s not possible to anticipate and recover from them, for example, hardware failure, JVM crash, or out-of-memory error.

Checked Exceptions are exceptional scenarios that we can anticipate in a program and try to recover from it, for example, FileNotFoundException. We should catch this exception and provide a useful message to the user and log it properly for debugging purposes. Exception is the parent class of all Checked Exceptions.

Runtime Exceptions are caused by bad programming, for example, trying to retrieve an element from the Array. We should check the length of the array first before trying to retrieve the element otherwise it might throw ArrayIndexOutOfBoundException at runtime. RuntimeException is the parent class of all runtime exceptions.


**Q. What Is the Difference Between an Exception and Error?**   
An exception is an event that represents a condition from which is possible to recover, whereas error represents an external situation usually impossible to recover from.

All errors thrown by the JVM are instances of Error or one of its subclasses, the more common ones include but are not limited to:
Eg. OutOfMemoryError – thrown when the JVM cannot allocate more objects because it is out memory, and the garbage collector was unable to make more available
StackOverflowError – occurs when the stack space for a thread has run out, typically because an application recurses too deeply

**Q.  What Is a Stacktrace and How Does It Relate to an Exception?**   
A stack trace provides the names of the classes and methods that were called, from the start of the application to the point an exception occurred.

It's a very useful debugging tool since it enables us to determine exactly where the exception was thrown in the application and the original causes that led to it.

**Q. What is OutOfMemoryError in Java?**   
OutOfMemoryError in Java is a subclass of java.lang.VirtualMachineError and it’s thrown by JVM when it ran out of heap memory. We can fix this error by providing more memory to run the java application through java options.

$>java MyProgram -Xms1024m -Xmx1024m -XX:PermSize=64M -XX:MaxPermSize=256m

**Q. What are different scenarios causing “Exception in thread main”?**   
Some of the common main thread exception scenarios are:

Exception in thread main java.lang.UnsupportedClassVersionError: This exception comes when your java class is compiled from another JDK version and you are trying to run it from another java version.

Exception in thread main java.lang.NoClassDefFoundError: There are two variants of this exception. The first one is where you provide the class full name with .class extension. The second scenario is when Class is not found.

Exception in thread main java.lang.NoSuchMethodError: main: This exception comes when you are trying to run a class that doesn’t have the main method.

Exception in thread “main” java.lang.ArithmeticException: Whenever an exception is thrown from the main method, it prints the exception in the console. The first part explains that an exception is thrown from the main method, the second part prints the exception class name and then after a colon, it prints the exception message.

## Scenarios :

**Q. How can we handle multiple excpetion in catch block?**  
 We can handle multiple exceptions in catch block after Java 7. 
 Syntax :  catch (Exception | Excpetion ex)
 	
**Q. What are the rules we have to follow for multi catch future.**  
We can have n number of excpetions in multi catch blocks  
If we have added base class excpetion in multi catch block then we can't add child class excpetion.  
We can't assign exception object to new exception as it is final.  

**Q. Can we assign a new excpetion to exception object which is catched in multi catch block?   (ExceptionMultiCatchBlockRule1_3.java)**  
No. exception object in multi catch block is final.  
We can't assign it because when exception object is catched in multi catch block,   
complier is not sure which excpetion is going to be catched.  

**Q.  Can You Throw Any Exception Inside a Lambda Expression's Body?**
When using a standard functional interface already provided by Java, you can only throw unchecked exceptions because standard functional interfaces do not have a “throws” clause in method signatures:

However, if you are using a custom functional interface, throwing checked exceptions is possible:
```java
@FunctionalInterface
public static interface CheckedFunction<T> {
    void apply(T t) throws Exception;
}
```

**Q. What Are the Rules We Need to Follow When Overriding a Method That Throws an Exception?**
When the parent class method doesn't throw any exceptions, the child class method can't throw any checked exception, but it may throw any unchecked.
When the parent class method throws one or more checked exceptions, the child class method can throw any unchecked exception; all, none or a subset of the declared checked exceptions, and even a greater number of these as long as they have the same scope or narrower.
When the parent class method has a throws clause with an unchecked exception, the child class method can throw none or any number of unchecked exceptions, even though they are not related. 

## References  
https://javahungry.blogspot.com/2019/09/programs-on-exception-handling-in-java.html
https://www.baeldung.com/java-exceptions-interview-questions
