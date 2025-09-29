

# Shyamal's Java Library

[](https://opensource.org/licenses/Apache-2.0)
[](https://www.google.com/search?q=https://search.maven.org/artifact/io.github.shyamal005/shyamal-java-library)

A lightweight and easy-to-use Java utility library designed to simplify common console application tasks. This library provides convenient, static methods for printing to the console and capturing validated user input, preventing common runtime errors from invalid data.

This project was built to demonstrate a complete, professional software development lifecycle, from coding and testing to secure deployment on Maven Central.

-----

## Installation

This library is available on **Maven Central**. To use it in your project, add the following dependency to your `pom.xml` file:

```xml
<dependency>
    <groupId>io.github.shyamal005</groupId>
    <artifactId>shyamal-java-library</artifactId>
    <version>1.0.0</version>
</dependency>
```

-----

## How to Use

All methods in this library are `static`, so you can call them directly from the `Shyamal` class without creating an object instance.

### Printing to the Console

Use the `p()` method as a quick shortcut for `System.out.println()`. It is overloaded to accept various data types.

```java
import io.github.shyamal005.Shyamal;

public class PrintExample {
    public static void main(String[] args) {
        Shyamal.p("This is a string.");
        Shyamal.p(123);
        Shyamal.p(45.67);
    }
}
```

-----

### Getting Validated User Input

These methods prompt the user for a specific type of input and will not proceed until valid data is entered, preventing your application from crashing.

**Get an Integer:**

```java
int age = Shyamal.getInt("Please enter your age:");
Shyamal.p("You are " + age + " years old.");
```

If the user enters text instead of a number, the method will automatically ask them to try again.

**Get a String:**

```java
String name = Shyamal.getString("What is your name?");
Shyamal.p("Hello, " + name + "!");
```

**Get a Yes/No Answer:**
The `getYesNo()` method is useful for confirmation prompts and returns a `boolean` (`true` for "y", `false` for "n").

```java
boolean wantsToContinue = Shyamal.getYesNo("Do you want to proceed?");
if (wantsToContinue) {
    Shyamal.p("Continuing the process...");
} else {
    Shyamal.p("Exiting.");
}
```

-----

### Math Utilities

The library includes a few basic, convenient math functions.

```java
int num = 10;
int numSquared = Shyamal.square(num); // Returns 100
Shyamal.p("The square of " + num + " is " + numSquared + ".");

int largerNumber = Shyamal.max(15, 42); // Returns 42
Shyamal.p("The larger number is " + largerNumber + ".");
```

-----

## License

This project is licensed under the Apache License 2.0. See the [LICENSE](https://github.com/shyamal005/shyamal-java-library/edit/main/LICENSE) file for details.
