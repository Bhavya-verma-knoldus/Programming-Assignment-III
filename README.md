# 3 Programs in Scala

## What is Scala?

Scala is a general-purpose programming language providing support for both object-oriented programming and functional programming. The language has a strong static type system. Designed to be concise, many of Scala's design decisions are aimed to address criticisms of Java.

## 1st Program
### Find last element of list with its index value
In this program, I have implemented the getLastElement() method which finds out the last element of the list along with its index value. I have used tail recursion which is an optimised version of recursion in which no stack call is made which does not lead to stack overflow error even in case of a very large list.

## 2nd Program
### Print the table of each element in the List
In this program, I have implemented printTable() method which prints the table of all the elements which are present in the list.

## 3rd Program
### Implement Stack and Queue using Lists.
In this program, I have implemented the following methods of stacks and queues:-
#### Stack methods:-
* Push
* Pop
* isEmpty
* Peek

#### Queue methods:-
* Add
* Remove
* isEmpty
* Peek

## Commands
* sbt compile - To compile the code
* sbt test - To execute unit test cases
* sbt scalastyleGenerateConfig - To generate scalastyle config file
* sbt scalastyle - To execute scalastyle plugin for API
* sbt test:scalastyle - To execute scalastyle plugin for test cases