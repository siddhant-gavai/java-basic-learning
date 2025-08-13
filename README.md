# Java Basics

I have learned the basics of Java including variables, operators, conditionals, loops, and created simple programs. Here is a summary:

## Topics Covered

- Introduction to Java
- Variables and Data Types
- Operators
- Conditional Statements (`if`, `else`, `switch`)
- Loops (`for`, `while`, `do-while`)
- Simple Programs:
  - Even/Odd Number Checker
  - Basic Calculator
  - Income Tax Calculator
- 🧮 Arrays – Single and multidimensional arrays
- 🧵 Strings – String operations and methods
- 🧰 Methods – Defining and using functions

## Example: For Loop

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Number: " + i);
}
```

## Example: Even/Odd Checker

```java
int number = 7;
if (number % 2 == 0) {
    System.out.println(number + " is even.");
} else {
    System.out.println(number + " is odd.");
}
```

## Example: Calculator

```java
double num1 = 10, num2 = 5;
char operator = '+';
double result;
switch (operator) {
    case '+': result = num1 + num2; break;
    case '-': result = num1 - num2; break;
    case '*': result = num1 * num2; break;
    case '/': result = num2 != 0 ? num1 / num2 : 0; break;
    default: result = 0;
}
System.out.println("Result: " + result);
```

## Next Steps

- Learn about arrays
- Explore functions/methods
- Understand object-oriented
