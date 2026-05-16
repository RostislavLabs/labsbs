Lab_8 - багатофайловий Java-проєкт для лабораторної роботи 8
Тема: Потоки вводу/виводу. Робота з файлами.

Структура:
- src - вихідні .java файли
- bin - скомпільовані .class файли
- lib - папка для бібліотек
- files - папка для txt-файлів програми
- .vscode/settings.json - налаштування VS Code, щоб .class створювались у bin

Компіляція з кореня проєкту Lab_8:
javac -encoding UTF-8 -d bin src\*.java

Запуск через меню:
java -cp bin Main

Запуск із параметрами командного рядка:
java -cp bin Main <fileName> <min> <max> <count>

Приклад:
java -cp bin Main numbers.txt 1 100 20

У програмі використано FileWriter та FileReader.
Якщо файл не існує, перед записом він створюється автоматично.
Для введення чисел використано try-catch: якщо ввести букву замість числа, програма попросить повторити введення.


Для запуску коду
cd Lab_8
javac -encoding UTF-8 -d bin src\*.java
java -cp bin Main