# 🚀 Selenium Advanced Framework

> A modular **Selenium UI Automation Framework** built with **Java**, **Selenium WebDriver**, **TestNG**, and **Maven**, demonstrating advanced automation concepts such as **Page Object Model (POM)**, **Page Factory**, **Data-Driven Testing**, and **Allure Reporting**.

![Java](https://img.shields.io/badge/Java-11+-blue?logo=openjdk)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-43B02A?logo=selenium&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build%20Tool-C71A36?logo=apachemaven&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-Framework-brightgreen)
![Page Object Model](https://img.shields.io/badge/Page%20Object%20Model-POM-blueviolet)
![Page Factory](https://img.shields.io/badge/Page%20Factory-Design%20Pattern-6A5ACD)
![Apache POI](https://img.shields.io/badge/Apache%20POI-Excel%20Support-blue)
![Allure](https://img.shields.io/badge/Allure-Reports-ff69b4)
![Log4j2](https://img.shields.io/badge/Log4j2-Logging-yellow)

---

# 🗂️ Overview

This repository contains a modular **Selenium UI Automation Framework** developed using **Java**, **Selenium WebDriver**, **TestNG**, and **Maven** to demonstrate modern UI automation architecture and framework design.

The project showcases multiple automation approaches including **Traditional Page Object Model (POM)**, **Improved POM**, **Page Factory**, **Data-Driven Testing**, reusable driver management, centralized utilities, retry mechanisms, TestNG listeners, logging, and interactive Allure reporting.

Designed with **reusability**, **maintainability**, and **scalability** in mind, this repository serves as a practical reference for implementing enterprise-style Selenium automation frameworks.

---

# ✨ Key Features

- ✅ Traditional Page Object Model (POM)
- ✅ Improved Page Object Model
- ✅ Selenium Page Factory
- ✅ Modular Framework Architecture
- ✅ Excel-Based Data-Driven Testing
- ✅ Centralized DriverManager
- ✅ Reusable Wait Utilities
- ✅ Retry Mechanism for Failed Tests
- ✅ Automatic Screenshot Capture
- ✅ TestNG Listeners
- ✅ Log4j2 Logging
- ✅ Interactive Allure Reporting

---

# 🛠️ Tech Stack

| Technology | Usage |
|------------|-------|
| **Java 11+** | Programming Language |
| **Selenium WebDriver** | Browser Automation |
| **TestNG** | Test Framework & Test Execution |
| **Maven** | Dependency & Build Management |
| **Page Object Model (POM)** | Design Pattern for Maintainable Test Automation |
| **Page Factory** | Page Object Initialization |
| **Apache POI** | Excel-Based Data-Driven Testing |
| **Log4j2** | Logging Framework |
| **Allure Reports** | Test Reporting & Visualization |
| **IntelliJ IDEA** | Development IDE |

---

# 🏗️ Project Structure

```text

Selenium_Advance_Framework/
│
├── .idea/                                                                           # IntelliJ project files
├── .mvn/                                                                            # Maven wrapper files
├── allure-results/                                                                  # Allure results (auto-generated)
├── failure_screenshots/                                                             # Screenshots captured on failures
├── logs/
│   └── test.log                                                                     # Execution logs
│
├── pom.xml                                                                          # Project dependencies & build configuration
├── .gitignore
│
├── testNG-xmls/                                                                     # TestNG suite files
│   ├── testng_appVWOLoginPage_01.xml
│   ├── testng_appVWOLoginPage_02.xml
│   ├── testng_appVWOLoginPage_03.xml
│   ├── testng_appVWOLoginPage_04.xml
│   ├── testng_appVWOLoginPage_DDT.xml
│   ├── testng_appVWOLoginPage_PF.xml
│   ├── testng_appVWOLoginPage_RetryListeners.xml
│   ├── testng_appVWOLoginPage_RetryListenersScreenshotListeners.xml
│   ├── testng_KatalonCURALoginPage_01.xml
│   ├── testng_KatalonCURALoginPage_PF.xml
│   ├── testng_OrangeHRMLoginPage_01.xml
│   └── testng_OrangeHRMLoginPage_PF.xml
│
├── src/
│   ├── main/
│   │   └── java/com.avinashsinha/
│   │       ├── base/
│   │       │   └── CommonToAllPage.java                                             # Base page class
│   │       │
│   │       ├── driver/
│   │       │   └── DriverManager.java                                               # WebDriver manager
│   │       │
│   │       ├── pages/
│   │       │   ├── pageFactory/
│   │       │   │   ├── appVWO/
│   │       │   │   │   ├── DashboardPage_PF.java
│   │       │   │   │   └── LoginPage_PF.java
│   │       │   │   │
│   │       │   │   ├── katalonCURA/
│   │       │   │   │   ├── BookingPage_PF.java
│   │       │   │   │   ├── LoginPage_PF.java
│   │       │   │   │   ├── MakeAppointmentPage_PF.java
│   │       │   │   │   └── SummaryPage_PF.java
│   │       │   │   │
│   │       │   │   └── orangeHRM/
│   │       │   │       ├── EmployeeListHomePage_PF.java
│   │       │   │       └── LoginPage_PF.java
│   │       │   │
│   │       │   └── pageObjectModel/
│   │       │       ├── appVWO/
│   │       │       │   ├── improved_POM/
│   │       │       │   │   ├── DashboardPage.java
│   │       │       │   │   └── LoginPage.java
│   │       │       │   │
│   │       │       │   └── normal_POM/
│   │       │       │       ├── DashboardPage.java
│   │       │       │       └── LoginPage.java
│   │       │       │
│   │       │       ├── katalonCURA/
│   │       │       │   ├── BookingPage.java
│   │       │       │   ├── LoginPage.java
│   │       │       │   ├── MakeAppointmentPage.java
│   │       │       │   └── SummaryPage.java
│   │       │       │
│   │       │       └── orangeHRM/
│   │       │           ├── EmployeeListHomePage.java
│   │       │           └── LoginPage.java
│   │       │
│   │       ├── utils/
│   │       │   ├── PropertiesReader.java                                            # Property reader utility
│   │       │   ├── UtilExcel.java                                                   # Excel helper
│   │       │   └── WaitHelpers.java                                                 # Explicit wait helpers
│   │       │
│   │       └── resources/
│   │           ├── data.properties                                                  # Framework configuration
│   │           ├── log4j2.xml                                                       # Logging configuration
│   │           └── TestData.xlsx                                                    # Excel test data
│   │
│   └── test/
│       └── java/com.avinashsinha/
│           ├── base/
│           │   └── CommonToAllTest.java                                             # Base test setup
│           │
│           ├── listeners/
│           │   ├── RetryAnalyzer.java
│           │   ├── RetryListeners.java
│           │   └── ScreenshotListeners.java
│           │
│           └── tests/
│               ├── pageFactory/
│               │   ├── appVWO/
│               │   │   └── TestAppVWOLoginPage_PF.java
│               │   │
│               │   ├── katalonCURA/
│               │   │   └── TestKatalonCURALoginPage_PF.java
│               │   │
│               │   └── orangeHRM/
│               │       └── TestOrangeHRMLoginPage_PF.java
│               │
│               └── pom/
│                   ├── appVWO/
│                   │   ├── DDT/
│                   │   │   └── TestAppVWOLoginPage_DDT.java
│                   │   ├── TestAppVWOLoginPage_01_NormalScript_POM.java
│                   │   ├── TestAppVWOLoginPage_02_PropertyReader_DriverManager_normalPOM.java
│                   │   ├── TestAppVWOLoginPage_03_PropertyReader_DriverManager_improvedPOM.java
│                   │   ├── TestAppVWOLoginPage_04_PropertyReader_DriverManager_CommonToAll_improvedPOM.java
│                   │   ├── TestAppVWOLoginPage_RetryListeners.java
│                   │   └── TestAppVWOLoginPage_RetryListeners_ScreenshotListeners.java
│                   │
│                   ├── katalonCURA/
│                   │   └── TestKatalonCURALoginPage_01.java
│                   │
│                   └── orangeHRM/
│                       └── TestOrangeHRMLoginPage_01.java
│
└── README.md

```

---

# 📦 Framework Components

| Component | Description |
|------------|-------------|
| **CommonToAllPage** | Base page class providing reusable Selenium actions and common page functionalities |
| **DriverManager** | Centralized WebDriver lifecycle management for browser initialization and cleanup |
| **Page Object Model (POM)** | Organizes page elements and actions for maintainable and reusable test automation |
| **Page Factory** | Initializes page objects using `@FindBy` annotations for improved readability |
| **CommonToAllTest** | Base test class handling common test setup and teardown |
| **WaitHelpers** | Utility methods for implementing explicit waits and synchronization |
| **PropertiesReader** | Reads and manages framework configuration from `data.properties` |
| **UtilExcel** | Utility class for Excel-based Data-Driven Testing using Apache POI |
| **RetryAnalyzer** | Automatically retries failed test cases to improve test stability |
| **RetryListeners** | Integrates retry logic with the TestNG execution lifecycle |
| **ScreenshotListeners** | Captures screenshots automatically when test execution fails |
| **Application Modules** | Independent automation modules for VWO, Katalon CURA, and OrangeHRM |
| **TestNG XML Suites** | Organized suite files for executing individual test scenarios and regression suites |
| **Allure Reports** | Generates interactive execution reports with logs and screenshots |
---

# 🌐 Applications Automated

| Application | Automation Coverage |
|-------------|---------------------|
| **appVWO** | Traditional POM, Improved POM, Page Factory, Retry Mechanism & Data-Driven Testing |
| **Katalon CURA Healthcare** | Login, Appointment Booking & Summary Workflow |
| **OrangeHRM** | Login Validation using POM & Page Factory |
---

# ✅ Automation Coverage

| Module | Test Scenario |
|---------|---------------|
| appVWO | Traditional Page Object Model |
| appVWO | Improved Page Object Model |
| appVWO | DriverManager Implementation |
| appVWO | Data-Driven Testing (Excel) |
| appVWO | Retry Mechanism |
| appVWO | Screenshot Listener |
| appVWO | Page Factory |
| Katalon CURA | Login & Appointment Workflow |
| OrangeHRM | Login Validation |
---

# ▶️ Running Tests

Execute any TestNG suite using Maven.

### Example

```bash
mvn clean test -DsuiteXmlFile=testNG-xmls/testng_appVWLoginPage_01.xml
```

### Available Test Suites

| Suite | XML File |
|--------|----------|
| AppVWO Login (Basic) | `testng_appVWLoginPage_01.xml` |
| AppVWO Login (Property Reader + DriverManager) | `testng_appVWLoginPage_02.xml` |
| AppVWO Login (Enhanced Framework) | `testng_appVWLoginPage_03.xml` |
| AppVWO Login (Advanced Framework) | `testng_appVWLoginPage_04.xml` |
| AppVWO Data-Driven Testing | `testng_appVWLoginPage_DDT.xml` |
| AppVWO Page Factory | `testng_appVWLoginPage_PF.xml` |
| AppVWO Retry Analyzer | `testng_appVWLoginPage_RetryListeners.xml` |
| AppVWO Retry + Screenshot Listener | `testng_appVWLoginPage_RetryListenersScreenshotListeners.xml` |
| Katalon CURA (POM) | `testng_KatalonCURALoginPage_01.xml` |
| Katalon CURA (Page Factory) | `testng_KatalonCURALoginPage_PF.xml` |
| OrangeHRM (POM) | `testng_OrangeHRMLoginPage_01.xml` |
| OrangeHRM (Page Factory) | `testng_OrangeHRMLoginPage_PF.xml` |
---

# 📊 Allure Reports

Generate the Allure report after executing the test suite:

```bash
allure serve allure-results
```

<p align="center">
<img width="1100" src="https://github.com/user-attachments/assets/1d4e888d-7939-4264-b60d-720acab27ec9" alt="Allure Report">
</p>

The command generates and opens an interactive **Allure dashboard**, providing execution summaries, detailed logs, screenshots, and test statistics.

---

# ⭐ Repository Highlights

- ✔ Enterprise-Style Selenium Automation Framework
- ✔ Traditional & Improved Page Object Model
- ✔ Selenium Page Factory Implementation
- ✔ DriverManager Design Pattern
- ✔ Excel-Based Data-Driven Testing
- ✔ TestNG Retry & Screenshot Listeners
- ✔ Externalized Configuration Management
- ✔ Reusable Utility Classes
- ✔ Interactive Allure Reporting

---

# 👨‍💻 Author

**Avinash Sinha**

If you found this repository useful, consider giving it a ⭐.

---

# 📄 License

This repository is intended for **educational** and **learning purposes**.
