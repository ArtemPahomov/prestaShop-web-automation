# Prestashop-web-automation
Проект содержит автоматизированные тесты для сайта [demo.prestashop.com](https:/demo.prestashop.com)
Поскольку в ТЗ было не очень понятно - существовала ли корзина или по кнопке купить пользователь попадал сразу на страницу оформления заказа: кроме основной задачи мной были реализованы несколько дополнительных проверок(продолжить покупку/перейти в корзину) всплывающего pop-up при добавлении товара в корзину. А так же удаление товара из корзины.

## Содержание
- [Технологии](#технологии)
- [Сборка](#сборка)
- [Запуск тестов](#тестирование)
- [Allure Report](#отчет)

## Технологии
- Java 17
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
![Результаты тестов](https://drive.google.com/file/d/1s_TFAdmUhF7U44p6afkXBRLatenwsaJ7/view?usp=sharing)
![Результаты тестов](https://drive.google.com/file/d/1-e1_nPuhnN0li8daSnxWs3vJruukLkra/view?usp=sharing)
## Исполнитель
- Пахомов Артем — AQA Engineer Java