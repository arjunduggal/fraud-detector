# Credit Card Fraud Detector
The Credit Card Fraud application analyses the transaction data over a time window and detects the fraud cards.

Technology Stack used:
* Java 11
* Spring Boot
* Apache Spark

# Getting Started

In order to run the application, you can use either of the below two options.
```
1. mvn -q spring-boot:run -Dspring-boot.run.arguments="--threshold=<threshold-value> --filename=<filename-value>"

```

```
2. java -jar <path>/fraud-detector-1.0.0-SNAPSHOT.jar  --threshold=<threshold-value> --filename=<filename-value>
```

The below arguments are mandatory and need to be passed in the above commands.
1. threshold - The threshold amount to be used for fraud detection
2. filename - The name of the csv file which holds the credit card transactions to be processed.

#### File Format

The csv file should comprise of a comma separated string of below elements, one per line. All the fields are mandatory.
A credit card transaction comprises the following elements.
* hashed credit card number
* timestamp - of format year-month-dayThour:minute:second
* amount - of format dollars.cents

Example:
```
10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T13:15:54, 10.00
```
#####Assumption
The combination of hashed credit card and timestamp will always be unique in the csv file, i.e. only single transaction can happen for a credit card at a time. 
**Note**: For future, a unique transaction ID can be added in the csv file and can be used to overcome this assumption.

A credit card will be identified as fraudulent if the sum of amounts for a unique hashed credit
card number over a 24-hour sliding window period exceeds the threshold amount passed in the arguments.

The application will print the fraudulent cards if any and will then exit.

#### File Location

The default location of the file has been set to be E:// drive. It can be changed either by
* Change property file-location in the application.properties
* Pass an additional argument 'file-location' at the time of running application.
```
--file-location=<path>
```

Note: The file-location property or argument needs a trailing slash.

####Fraud Window Settings
The fraud window time has been made configurable and can be updated in the application.properties if required in future.
```
fraud.detection.window=<value in defined chrono unit>
fraud.detection.chrono-unit=<Chrono unit enum value>
```
Please refer to https://docs.oracle.com/javase/8/docs/api/java/time/temporal/ChronoUnit.html for possible enum values of Chrono Unit.

## Application Prerequisites
- Java 11
- Maven

## Design


## Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.1/	maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.1/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.4.1/reference/htmlsingle/#using-boot-devtools)

