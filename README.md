# 🚀 Selenium Advanced Framework

> A modular **Selenium UI Automation Framework** built using **Java**, **Selenium WebDriver**, **TestNG**, **Maven**, **Page Object Model (POM)**, **Page Factory**, **Apache POI**, **AssertJ**, **Allure Reports**, and **Log4j2** to demonstrate modern Selenium framework design patterns and enterprise UI automation practices.

<p align="center">

![Java](https://img.shields.io/badge/Java-11+-blue?logo=openjdk)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-43B02A?logo=selenium&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build%20Tool-C71A36?logo=apachemaven&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-Framework-brightgreen)
![AssertJ](https://img.shields.io/badge/AssertJ-Assertions-orange)
![Apache POI](https://img.shields.io/badge/Apache%20POI-Excel-blue)
![Allure](https://img.shields.io/badge/Allure-Reports-ff69b4)
![Log4j2](https://img.shields.io/badge/Log4j2-Logging-yellow)

</p>

---

# 🗂️ Overview

This repository contains a modular **Selenium Advanced Framework** developed to demonstrate multiple Selenium automation architectures using **Java**, **Selenium WebDriver**, **TestNG**, and **Maven**.

The framework showcases **Traditional Page Object Model (POM)**, **Improved POM**, **Page Factory**, **Data-Driven Testing**, reusable driver management, centralized utilities, TestNG listeners, retry mechanisms, logging, and rich Allure reporting.

It serves as a comprehensive reference for building scalable, reusable, and maintainable Selenium automation frameworks.

---

# ✨ Features

- ✅ Traditional Page Object Model (POM)
- ✅ Improved Page Object Model
- ✅ Page Factory Implementation
- ✅ Modular Framework Design
- ✅ Data-Driven Testing (Excel)
- ✅ DriverManager Pattern
- ✅ Centralized Utilities
- ✅ Retry Mechanism
- ✅ Screenshot Capture on Failure
- ✅ TestNG Listeners
- ✅ Log4j2 Logging
- ✅ Allure Reporting

---

# 🛠️ Tech Stack

| Technology | Usage |
|------------|-------|
| Java 11+ | Programming Language |
| Selenium WebDriver | UI Automation |
| Maven | Dependency & Build Management |
| TestNG | Test Framework |
| AssertJ | Fluent Assertions |
| Apache POI | Excel Data-Driven Testing |
| Log4j2 | Logging |
| Allure Reports | Test Reporting |
| IntelliJ IDEA | Development IDE |

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
│   │   ├── java/com.avinashsinha/
│   │   │   ├── base/
│   │   │   │   └── CommonToAllPage.java                                             # Base page class
│   │   │   │
│   │   │   ├── driver/
│   │   │   │   └── DriverManager.java                                               # WebDriver manager
│   │   │   │
│   │   │   ├── pages/
│   │   │   │   ├── pageFactory/
│   │   │   │   │   ├── appVWO/
│   │   │   │   │   │   ├── DashboardPage_PF.java
│   │   │   │   │   │   └── LoginPage_PF.java
│   │   │   │   │   │
│   │   │   │   │   ├── katalonCURA/
│   │   │   │   │   │   ├── BookingPage_PF.java
│   │   │   │   │   │   ├── LoginPage_PF.java
│   │   │   │   │   │   ├── MakeAppointmentPage_PF.java
│   │   │   │   │   │   └── SummaryPage_PF.java
│   │   │   │   │   │
│   │   │   │   │   └── orangeHRM/
│   │   │   │   │       ├── EmployeeListHomePage_PF.java
│   │   │   │   │       └── LoginPage_PF.java
│   │   │   │   │
│   │   │   │   └── pageObjectModel/
│   │   │   │       ├── appVWO/
│   │   │   │       │   ├── improved_POM/
│   │   │   │       │   │   ├── DashboardPage.java
│   │   │   │       │   │   └── LoginPage.java
│   │   │   │       │   │
│   │   │   │       │   └── normal_POM/
│   │   │   │       │       ├── DashboardPage.java
│   │   │   │       │       └── LoginPage.java
│   │   │   │       │
│   │   │   │       ├── katalonCURA/
│   │   │   │       │   ├── BookingPage.java
│   │   │   │       │   ├── LoginPage.java
│   │   │   │       │   ├── MakeAppointmentPage.java
│   │   │   │       │   └── SummaryPage.java
│   │   │   │       │
│   │   │   │       └── orangeHRM/
│   │   │   │           ├── EmployeeListHomePage.java
│   │   │   │           └── LoginPage.java
│   │   │   │
│   │   │   ├── utils/
│   │   │       ├── PropertiesReader.java                                            # Property reader utility
│   │   │       ├── UtilExcel.java                                                   # Excel helper
│   │   │       └── WaitHelpers.java                                                 # Explicit wait helpers
│   │   │   │
│   │   │   └── resources/
│   │   │       ├── data.properties                                                  # Framework configuration
│   │   │       ├── log4j2.xml                                                       # Logging configuration
│   │   │       └── TestData.xlsx                                                    # Excel test data
│   │
│   └── test/
│       ├── java/com.avinashsinha/
│       │   ├── base/
│       │   │   └── CommonToAllTest.java                                             # Base test setup
│       │   │
│       │   ├── listeners/
│       │   │   ├── RetryAnalyzer.java
│       │   │   ├── RetryListeners.java
│       │   │   └── ScreenshotListeners.java
│       │   │
│       │   └── tests/
│       │       ├── pageFactory/
│       │       │   ├── appVWO/
│       │       │   │   └── TestAppVWOLoginPage_PF.java
│       │       │   │
│       │       │   ├── katalonCURA/
│       │       │   │   └── TestKatalonCURALoginPage_PF.java
│       │       │   │
│       │       │   └── orangeHRM/
│       │       │       └── TestOrangeHRMLoginPage_PF.java
│       │       │
│       │       └── pom/
│       │           ├── appVWO/
│       │           │   ├── DDT/
│       │           │   │   └── TestAppVWOLoginPage_DDT.java
│       │           │   ├── TestAppVWOLoginPage_01_NormalScript_POM.java
│       │           │   ├── TestAppVWOLoginPage_02_PropertyReader_DriverManager_normalPOM.java
│       │           │   ├── TestAppVWOLoginPage_03_PropertyReader_DriverManager_improvedPOM.java
│       │           │   ├── TestAppVWOLoginPage_04_PropertyReader_DriverManager_CommonToAll_improvedPOM.java
│       │           │   ├── TestAppVWOLoginPage_RetryListeners.java
│       │           │   └── TestAppVWOLoginPage_RetryListeners_ScreenshotListeners.java
│       │           │
│       │           ├── katalonCURA/
│       │           │   └── TestKatalonCURALoginPage_01.java
│       │           │
│       │           └── orangeHRM/
│       │               └── TestOrangeHRMLoginPage_01.java
│
└── README.md
```

---

# 📦 Framework Components

| Component | Description |
|------------|-------------|
| **CommonToAllPage** | Common page actions shared across all page objects |
| **DriverManager** | Centralized WebDriver lifecycle management |
| **CommonToAllTest** | Base test setup and configuration |
| **Page Object Model** | Traditional Selenium Page Object implementation |
| **Page Factory** | Selenium PageFactory implementation |
| **WaitHelpers** | Explicit wait utilities |
| **UtilExcel** | Excel-based Data-Driven Testing |
| **RetryAnalyzer** | Automatic retry of failed test cases |
| **ScreenshotListeners** | Captures screenshots on test failures |
| **PropertiesReader** | Externalized framework configuration |

---

# 🌐 Applications Automated

| Application | Framework Coverage |
|-------------|--------------------|
| **appVWO** | Traditional POM, Improved POM, Page Factory & Data-Driven Testing |
| **Katalon CURA Healthcare** | Login and Appointment Workflow |
| **OrangeHRM** | Login Automation using POM & Page Factory |

---

# ✅ Test Coverage

| Module | Test Scenario |
|----------|---------------|
| appVWO | Traditional Page Object Model |
| appVWO | Improved Page Object Model |
| appVWO | DriverManager Integration |
| appVWO | Data-Driven Testing (Excel) |
| appVWO | Retry Listener Implementation |
| appVWO | Screenshot Listener Implementation |
| appVWO | Page Factory Implementation |
| Katalon CURA | Login Workflow |
| OrangeHRM | Login Workflow |

---

# ▶️ Running Tests

Execute any TestNG suite using Maven.

### Example

```bash
mvn clean test -DsuiteXmlFile=testNG-xmls/testng_appVWOLoginPage_PF.xml
```

### Available Test Suites

| Suite | XML File |
|--------|----------|
| appVWO - Normal POM | `testng_appVWOLoginPage_01.xml` |
| appVWO - DriverManager | `testng_appVWOLoginPage_02.xml` |
| appVWO - Improved POM | `testng_appVWOLoginPage_03.xml` |
| appVWO - Common Base | `testng_appVWOLoginPage_04.xml` |
| appVWO - Data Driven | `testng_appVWOLoginPage_DDT.xml` |
| appVWO - Page Factory | `testng_appVWOLoginPage_PF.xml` |
| appVWO - Retry Listener | `testng_appVWOLoginPage_RetryListeners.xml` |
| appVWO - Retry + Screenshot | `testng_appVWOLoginPage_RetryListenersScreenshotListeners.xml` |
| Katalon CURA | `testng_KatalonCURALoginPage_PF.xml` |
| OrangeHRM | `testng_OrangeHRMLoginPage_PF.xml` |

---

# 📊 Allure Reports

Generate the report using:

```bash
allure serve allure-results
```

<p align="center">
<img width="1100" src="https://github.com/user-attachments/assets/1d4e888d-7939-4264-b60d-720acab27ec9" alt="Allure Report">
</p>

The command launches an interactive Allure dashboard in your default browser.

---

# 👨‍💻 Author

**Avinash Sinha**

If you found this repository helpful, consider giving it a ⭐ on GitHub.

---

# 📄 License

This project is intended for **educational** and **learning purposes**.
