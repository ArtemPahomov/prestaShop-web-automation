# Prestashop-web-automation
The project includes automated tests for the website demo.prestashop.com. The job specification wasn't very clear -  it wasn't obvious whether the cart existed or the "buy" button took the user directly to the ordering page. That's why in addition to the main task, I implemented several extra checks: 
- continue shopping / go to cart (pop-up when adding an item to the cart)
- removing goods from the cart.

## Content
- [Technologies](#technologies)
- [Build](#build)
- [Running tests](#testing)
- [Allure Report](#report)

## Technologies
- Java 17
- Selenide
- Cucumber
- AssertJ
- Allure 

## How to use

### <Build>
To build the project, run the command: 
```sh
./gradlew build
```

### Testing
To run tests run the commands:
```sh
./gradlew clean
./gradlew executeTests
```
### Report
To generate Allure Report, run the commands:
```sh
./gradlew allureServe
```
[Allure report - successful run](https://github.com/ArtemPahomov/prestaShop-web-automation/tree/master/config/Allure1.jpg)

[Allure report - unsuccessful run](https://github.com/ArtemPahomov/prestaShop-web-automation/tree/master/config/Allure2.jpg)
## Executor
- Pahomov Artem — AQA Engineer Java