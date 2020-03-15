## Problem #1

### Write a function that detects if two strings are anagram
1. Solution of this problem is added in Problem1.kt file using Kotlin language.

2. Some test cases for this problem is also added in Problem1UnitTest.kt

## Problem #2

### Explain the design pattern used in following:

```
interface Vehicle {
    int set_num_of_wheels()
    int set_num_of_passengers()
    boolean has_gas()
}
```
### a) Explain how you can use the pattern to create car and plane class?
The design pattern that is used in above is **Abstract Factory Design Pattern**. This pattern is of the most used design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

![Image of UML]
(https://i.imgur.com/m689TE4.jpg)

The whole implementation is added into **AbstractFactoryDesignPattern** folder and Unit Testing code is also attached into the test package for the functions I have implemented.

### b) Use a different design pattern for this solution.
I have used **Builder Design Pattern** for this solution which is included into **BuilderDesignPattern** folder and Unit Testing code is also attached.

## Problem #3

### Write a video player application with ‘Play’, ‘Forward’ , ‘Rewind’ functionalities.
A simple video player application is implemented using Android's VideoView and MediaController which is added into **Problem #3** folder.

### Explain the design pattern you will use to develop these three functionalities
I will use **Oberserver Design Pattern** and **MVVM Architectural pattern** to develop these three functionalities.

As this is a videoplayer app so any type of inturptation like device rotation, incoming phone calls, battery low etc. could be smoothly handled by observing from the view which can save this app from memory leakage and lifcycle issues.
