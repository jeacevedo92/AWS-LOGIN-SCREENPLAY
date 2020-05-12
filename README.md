# AWS Login Automation

In this repository, you will find the test automation for login on the AWS page

## Tools
This automation is built in JAVA language with the framework screenplay, the Serenity library is used for the report, cucumber for writing test scenarios, and Gradle is used as Java package manager

## Requirements


to run this automation you need

* Gradle 6.0
* java version "1.8.0_231"

## Config

You must configure the driver for your operating system in the serenity.properties file as follows


```bash
Mac:
webdriver.chrome.driver=src/test/resources/driver/chromedriver

Windows:
webdriver.chrome.driver=src/test/resources/driver/chromedriver.exe

Linux:
webdriver.chrome.driver=src/test/resources/driver/chromedriver_linux
```

## Usage

```bash
git clone https://github.com/jeacevedo92/Test-Challenge-Cucumber-Java.git
cd Test-Challenge-Cucumber-Java/
gradle cleanTest aggregate test --tests "co.com.cafeto.screenplay.runners.AwsLogin"
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.



## Report

After the execution you can find the serenity report in the following directory 

```bash
Test-Challenge-Cucumber-Java/target/site/serenity
```


## License
[MIT](https://choosealicense.com/licenses/mit/)