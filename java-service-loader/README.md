### Java Service Loader

Java service loader is a mechanism for loading service providers at runtime. To hook the SPI, create a directory (META-INF/services) on the classpath. That directory contains a file with the fully qualified name of your abstract service class or interface.


**Example:** 

GreetingsService interface with one of its implementation GreetingsServiceImpl

Here, `com.service.GreetingsService` will be file name under META-INF/services directory and this files contains the details of its implementation i.e `com.service.impl.GreetingsServiceImpl`
