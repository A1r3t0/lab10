# Лабораторная работа №10 по прикладному программированию
Испольнитель: Артюшин Артём

Группа: ФТ-220008

Программа написана на языке Java, в среде разработки Intellij IDEA. Запустить код можно в любой среде разработки для Java.

Код программы можно просмотреть в главной ветке: **lab10.java**

___Замечание: в программе нужно поменять путь до файла с конфигурацией на путь, который будет у вас!___

В моём случае путь: **/IdeaProjects/lab10/logs.config**


## Задание
### Компьютер загадывает число от 1 до N. У пользователя k попыток отгадать. После каждой неудачной попытки компьютер сообщает меньше или больше загаданное число. В конце игры текст с результатом (или «Вы угадали», или «Попытки закончились»).

___Описание работы___:

Для программы была написана конфигурация для логирования. 

Данная конфигурация позволяет вести логирование в файл с расширением .txt, старые логи не стираются в этом файле, а новые добавляются.

Программа получает на вход значение N, после этого автоматически генерирует случайное число от 1 до N, затем вводится количество попыток k. Запускается цикл от 0 до k (количество попыток), где пользователь с каждой попыткой вводит число, а программа подсказывает пользователю, угадал ли он загаданное число (следует завершение программы), загаданное число меньше или больше (если не израсходовано количество попыток, начинается следующая попытка), если количество попыток закончилось, то программа завершается. В программу включена проверка вводимых значений: 
1) если введенное число не типа (int), то программа ловит исключение;
2) если на вход пришло число типа (int) - целое число, то идет проверка того, что число натуральное (>=1), если число не натуральное, программа завершается.

__Тесты программ__:

**Тест 1:**

![img](https://github.com/A1r3t0/lab10/blob/main/Снимок%20экрана%202023-11-22%20в%2006.29.29.png)

![img](https://github.com/A1r3t0/lab10/blob/main/Снимок%20экрана%202023-11-22%20в%2006.29.43.png)

**Тест 2:**

![img](https://github.com/A1r3t0/lab10/blob/main/Снимок%20экрана%202023-11-22%20в%2006.30.27.png)

![img](https://github.com/A1r3t0/lab10/blob/main/Снимок%20экрана%202023-11-22%20в%2006.30.51.png)

**Тест 3:**

![img](https://github.com/A1r3t0/lab10/blob/main/Снимок%20экрана%202023-11-22%20в%2006.31.48.png)

![img](https://github.com/A1r3t0/lab10/blob/main/Снимок%20экрана%202023-11-22%20в%2006.31.59.png)

**Тест 4:**

![img](https://github.com/A1r3t0/lab10/blob/main/Снимок%20экрана%202023-11-22%20в%2006.33.32.png)

![img](https://github.com/A1r3t0/lab10/blob/main/Снимок%20экрана%202023-11-22%20в%2006.34.58.png)
