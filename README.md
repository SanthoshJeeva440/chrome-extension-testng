Java Selenium With TestNG - Chrome Extension Automation
=======================================================

Introduction
------------
Selenium is an open-source, automated testing tool used to test web applications across various browsers. Selenium can test web applications against various browsers like Firefox, Chrome, Opera, and Safari, and these tests can be coded in several programming languages like Java, Python, Perl, PHP, and Ruby

Pre-Request Installation
------------------------
### 1. Java
### 2. Maven
### 3. Intellij IDE

Maven Life Cycle
----------------
### 1.Clean 
```
mvn clean
```
### 2.Install
```
mvn install
```
### 3.Test
```
mvn test
```
Maven Execution
---------------
### Execute Single Test Suite
```bash
mvn test -Dtest=TC_01
```
### Execute All Test Suite
```
mvn test
```
### Execute Single Test Suite Package
```
mvn test -Dsuite-xml=e2eTest.xml
```
### Environment Test
### QA
```
mvn test -Denv=qa
```

### DEV
```
mvn test -Denv=dev
```