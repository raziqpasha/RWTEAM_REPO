1️ Project Title

Amazon Product Search Automation – Selenium WebDriver

2️ Project Description

This project automates a product search workflow on Amazon using Selenium WebDriver.
The script navigates to the Amazon homepage, searches for a product, selects the first
result, validates that the product page has loaded by checking for the 'Add to Cart' button,
and captures a screenshot of the product details page.

3️ Features

List what your automation covers:

Handles dynamic elements using WebDriverWait  
Searches for a product on Amazon  
Clicks the first product from the search results  
Validates presence of Add to Cart button  
Takes screenshot of the product details page  
Clean, reusable modular code

4️ Tools & Technologies Used
Java 8
Selenium WebDriver 4+
TestNG 
ChromeDriver
Maven

5 Project Folder Structure
project-folder/
├── src/
│   └── test/
│       └── java/
│           └── amazon/
│               ├── BaseTest.java
│               ├── AmazonTest.java
│               └── Utils.java
├── screenshots/
├── pom.xml
└── README.md

6️ How to Set Up the Project
1. Install Java (JDK 8 or higher)
2. Install Maven
3. Install Google Chrome Browser
4. Download ChromeDriver or let WebDriverManager handle it
5. Clone or download this project

7️ How to Run the Test

If using TestNG:

mvn clean test
OR

Run the test from IDE (IntelliJ):
Right-click → AmazonTest.java → Run

8️ Test Flow Explanation

Explain the logic very simply:

Open Amazon homepage.
Search for “laptop”.
Wait for search results to load (Explicit Wait).
Click on the first search result.
Validate that the 'Add to Cart' button is visible.
Capture a screenshot and save under /screenshots folder.

9️ Screenshot Location
You can find the screenshot of the product details page in:

screenshots.png

10 Dependencies (add in README)

Selenium Java
TestNG
ChromeDriver

1️1️ Known Issues

Amazon UI changes frequently, so locators may need to be updated.
Internet speed affects explicit wait timing.

1️2️ Author Information

Author: Raazik Pasha  
Role: QA Automation Engineer  