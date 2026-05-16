Лабораторна робота 7
Тема: Робота з колекціями в Java

Структура проєкту:
Lab_7
|-- .vscode
|   |-- settings.json
|-- src
|   |-- Main.java
|   |-- InputHelper.java
|   |-- Driver.java
|   |-- TaxiCar.java
|   |-- TaxiServiceHelper.java
|   |-- TaskTaxiService.java
|   |-- PhoneBook.java
|   |-- TaskPhoneBook.java
|-- bin
|-- lib

Запуск у VS Code:
1. Відкрити саме папку Lab_7.
2. Запускати через Run над методом main або через термінал.

Команди для запуску через термінал:
javac -encoding UTF-8 -d bin src\*.java
java -cp bin Main

У проєкті використано:
- ArrayList для автопарку таксі;
- HashMap для телефонної книги;
- багатофайлову структуру;
- try-catch у класі InputHelper для перевірки введення чисел.

Ввести в термінал для запуску
cd Lab_7
javac -encoding UTF-8 -d bin src\*.java
java -cp bin Main