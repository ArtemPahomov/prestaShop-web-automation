# Prestashop-web-automation
Проект содержит автоматизированные тесты для сайта [demo.prestashop.com](https:/demo.prestashop.com)

## Содержание
- [Технологии](#технологии)
- [Сборка](#сборка)
- [Запуск тестов](#тестирование)
- [Allure Report](#отчет)

## Технологии
- Java
- Selenide
- Cucumber
- AssertJ
- Allure 

## Использование

### Сборка
Чтобы выполнить сборку проекта, выполните команду: 
```sh
./gradlew build
```

### Тестирование
Для запуска тестов выполните команды:
```sh
./gradlew clean
./gradlew executeTests
```
### Отчет
Для генерации Allure Report выполните команды:
```sh
./gradlew allureServe
```
## Исполнитель
- Пахомов Артем — AQA Engineer Java