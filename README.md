## Задание 1

Используя команду cat в терминале операционной системы Linux, создать
два файла Домашние животные (заполнив файл собаками, кошками,
хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
ослы), а затем объединить их. Просмотреть содержимое созданного файла.
Переименовать файл, дав ему новое имя (Друзья человека).

![task 1](https://github.com/TimurDanilov1985/FinalControlWorkSpecialization/blob/master/images/task%201.jpg)

## Задание 2

Создать директорию, переместить файл туда.

![task 2](https://github.com/TimurDanilov1985/FinalControlWorkSpecialization/blob/master/images/task%202.jpg)

## Задание 3

Подключить дополнительный репозиторий MySQL. Установить любой пакет
из этого репозитория.

*Последовательность команд в терминале:*

timur@PC:~$ wget https://dev.mysql.com/get/mysql-apt-config_0.8.26-1_all.deb

timur@PC:~$ sudo dpkg -i mysql-apt-config_0.8.26-1_all.deb

timur@PC:~$ sudo apt-get update

timur@PC:~$ sudo apt-get install mysql-server

timur@PC:~$ sudo apt-get install mysqlclient

![task 3](https://github.com/TimurDanilov1985/FinalControlWorkSpecialization/blob/master/images/task%203.jpg)

## Задание 4

Установить и удалить deb-пакет с помощью dpkg.

## Задание 5

Выложить историю команд в терминале ubuntu

cat > pets

cat > pack_animals

cat pets pack_animals > new_file

mv new_file human_friends

mkdir animals

mv human_friends animals

sudo apt-get install mysql-server

sudo apt-get install mysqlclient

cd Загрузки/

sudo dpkg -i google-chrome-stable_current_amd64.deb

sudo dpkg -r google-chrome-stable

sudo apt-get autoremove

## Задание 6

Нарисовать диаграмму, в которой есть класс родительский класс, домашние
животные и вьючные животные, в составы которых в случае домашних
животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
войдут: Лошади, верблюды и ослы).

![task 6](https://github.com/TimurDanilov1985/FinalControlWorkSpecialization/blob/master/images/diagram.jpg)

## Задания 7 - 12

7. В подключенном MySQL репозитории создать базу данных “Друзья
человека”

8. Создать таблицы с иерархией из диаграммы в БД

9. Заполнить низкоуровневые таблицы именами(животных), командами
которые они выполняют и датами рождения

10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.

11. Создать новую таблицу “молодые животные” в которую попадут все
животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
до месяца подсчитать возраст животных в новой таблице

12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
прошлую принадлежность к старым таблицам.

timur@PC:~$ sudo mysql -u root

Welcome to the MySQL monitor.  Commands end with ; or \g.

Your MySQL connection id is 11

Server version: 8.0.36-0ubuntu0.22.04.1 (Ubuntu)

Copyright (c) 2000, 2024, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its

affiliates. Other names may be trademarks of their respective

owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> SHOW DATABASES;

+--------------------+

| Database           |

+--------------------+

| information_schema |

| mysql              |

| performance_schema |

| sys                |

+--------------------+

4 rows in set (0,00 sec)

mysql> DROP DATABASE IF EXISTS human_friends;

Query OK, 0 rows affected, 1 warning (0,01 sec)

mysql> CREATE DATABASE IF NOT EXISTS human_friends;

Query OK, 1 row affected (0,01 sec)

mysql> SHOW DATABASES;

+--------------------+

| Database           |

+--------------------+

| human_friends      |

| information_schema |

| mysql              |

| performance_schema |

| sys                |

+--------------------+

5 rows in set (0,00 sec)

mysql> USE human_friends;

Database changed

mysql> SHOW DATABASES;

+--------------------+

| Database           |

+--------------------+

| human_friends      |

| information_schema |

| mysql              |

| performance_schema |

| sys                |

+--------------------+

5 rows in set (0,00 sec)

mysql> SHOW DATABASE;

ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'DATABASE' at line 1

mysql> SHOW TABLES;

Empty set (0,00 sec)

mysql> CREATE TABLE animals (

    -> id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,

    -> type_of_animal VARCHAR(50)

    -> );

Query OK, 0 rows affected (0,03 sec)

mysql> SHOW TABLES;

+-------------------------+

| Tables_in_human_friends |

+-------------------------+

| animals                 |

+-------------------------+

1 row in set (0,00 sec)

mysql> CREATE TABLE dogs (

    -> id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,

    -> name VARCHAR(50) NOT NULL,

    -> instructions VARCHAR(100) DEFAULT NULL,

    -> date_of_birth DATE NOT NULL,

    -> animal_id INT NOT NULL,

    -> FOREIGN KEY (animal_id) REFERENCES animals (id) 

    -> );

Query OK, 0 rows affected (0,02 sec)

mysql> CREATE TABLE cats (

    ->   id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,

    ->   name VARCHAR(50) NOT NULL,

    ->   instructions VARCHAR(100) DEFAULT NULL,

    ->   date_of_birth DATE NOT NULL,

    ->   animal_id INT NOT NULL,

    ->   FOREIGN KEY (animal_id) REFERENCES animals (id)

    -> );

Query OK, 0 rows affected (0,02 sec)

mysql> CREATE TABLE hamsters (

    ->   id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,

    ->   name VARCHAR(50) NOT NULL,

    ->   instructions VARCHAR(100) DEFAULT NULL,

    ->   date_of_birth DATE NOT NULL,

    ->   animal_id INT NOT NULL,

    ->   FOREIGN KEY (animal_id) REFERENCES animals (id) 

    -> );

Query OK, 0 rows affected (0,03 sec)

mysql> CREATE TABLE horses (

    ->   id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,

    ->   name VARCHAR(50) NOT NULL,

    ->   instructions VARCHAR(100) DEFAULT NULL,

    ->   date_of_birth DATE NOT NULL,

    ->   animal_id INT NOT NULL,

    ->   FOREIGN KEY (animal_id) REFERENCES animals (id) 

    -> );

Query OK, 0 rows affected (0,02 sec)

mysql> CREATE TABLE donkeys (

    ->   id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,

    ->   name VARCHAR(50) NOT NULL,

    ->   instructions VARCHAR(100) DEFAULT NULL,

    ->   date_of_birth DATE NOT NULL,

    ->   animal_id INT NOT NULL,

    ->   FOREIGN KEY (animal_id) REFERENCES animals (id) 

    -> );

Query OK, 0 rows affected (0,04 sec)

mysql> CREATE TABLE camels (

    ->   id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,

    ->   name VARCHAR(50) NOT NULL,

    ->   instructions VARCHAR(100) DEFAULT NULL,

    ->   date_of_birth DATE NOT NULL,

    ->   animal_id INT NOT NULL,

    ->   FOREIGN KEY (animal_id) REFERENCES animals (id) 

    -> );

Query OK, 0 rows affected (0,03 sec)

mysql> INSERT INTO animals (type_of_animal) 

    -> VALUES

    -> ('pets'),

    -> ('pack animals');

Query OK, 2 rows affected (0,02 sec)

Records: 2  Duplicates: 0  Warnings: 0

mysql> INSERT INTO dogs (name, instructions, date_of_birth, animal_id) 

    -> VALUES

    -> ('Dzhera', 'sit', '2021-09-01', 1),

    -> ('Kaina', 'paw', '2020-02-12', 1),

    -> ('Spike', 'down', '2022-08-04', 1),

    -> ('Rokky', 'heel', '2019-07-09', 1);

Query OK, 4 rows affected (0,02 sec)

Records: 4  Duplicates: 0  Warnings: 0

mysql> INSERT INTO cats (name, instructions, date_of_birth, animal_id) 

    -> VALUES

    -> ('Ryzhik', 'kitty, kitty', '2023-11-26', 1),

    -> ('Barsik', 'kitty, kitty', '2023-06-15', 1),

    -> ('Zifirka', 'kitty, kitty', '2023-07-12', 1),

    -> ('Frikadelka', 'kitty, kitty', '2022-05-07', 1);

Query OK, 4 rows affected (0,00 sec)

Records: 4  Duplicates: 0  Warnings: 0

mysql> INSERT INTO hamsters (name, instructions, date_of_birth, animal_id) 

    -> VALUES

    -> ('Homa', DEFAULT, '2023-05-03', 1),

    -> ('Tishka', DEFAULT, '2023-04-16', 1),

    -> ('Myshka', DEFAULT, '2023-07-10', 1),

    -> ('Laska', DEFAULT, '2023-07-05', 1);

Query OK, 4 rows affected (0,02 sec)

Records: 4  Duplicates: 0  Warnings: 0

mysql> INSERT INTO donkeys (name, instructions, date_of_birth, animal_id) 

    -> VALUES

    -> ('Stiopa', 'go, stop', '2019-06-09', 2),

    -> ('Duska', 'go, stop', '2020-03-06', 2),

    -> ('Cheburek', 'go, stop', '2021-05-09', 2),

    -> ('Iakov', 'go, stop', '2022-08-05', 2);

Query OK, 4 rows affected (0,02 sec)

Records: 4  Duplicates: 0  Warnings: 0

mysql> INSERT INTO horses (name, instructions, date_of_birth, animal_id) 

    -> VALUES

    -> ('Viola', 'jamp', '2019-07-17', 2),

    -> ('Grom', 'run', '2018-12-03', 2),

    -> ('Zvezda', 'smile', '2017-05-01', 2),

    -> ('Pegas', 'forward', '2020-04-03', 2);

Query OK, 4 rows affected (0,02 sec)

Records: 4  Duplicates: 0  Warnings: 0

mysql> INSERT INTO camels (name, instructions, date_of_birth, animal_id) 

    -> VALUES

    -> ('Zembo', 'stop', '2018-06-18', 2),

    -> ('Chiksa', 'run', '2019-11-11', 2),

    -> ('Disko', 'go', '2020-09-23', 2),

    -> ('Amur', 'forward', '2022-07-05', 2);

Query OK, 4 rows affected (0,01 sec)

Records: 4  Duplicates: 0  Warnings: 0

mysql> CREATE TABLE horse_donkeys (

    ->   id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,

    ->   name VARCHAR(50) NOT NULL,

    ->   instructions VARCHAR(100) DEFAULT NULL,

    ->   date_of_birth DATE NOT NULL,

    ->   animal_id INT NOT NULL,

    ->   FOREIGN KEY (animal_id) REFERENCES animals (id) 

    ->  );

Query OK, 0 rows affected (0,02 sec)

mysql> INSERT INTO horse_donkeys (name, instructions, date_of_birth, animal_id)

    -> SELECT name, instructions, date_of_birth, animal_id

    -> FROM horses;

Query OK, 4 rows affected (0,01 sec)

Records: 4  Duplicates: 0  Warnings: 0

mysql> INSERT INTO horse_donkeys (name, instructions, date_of_birth, animal_id)

    -> SELECT name, instructions, date_of_birth, animal_id

    -> FROM donkeys;

Query OK, 4 rows affected (0,00 sec)

Records: 4  Duplicates: 0  Warnings: 0

mysql> CREATE TABLE young_animals (

    ->   id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,

    ->   name VARCHAR(50) NOT NULL,

    ->   instructions VARCHAR(100) DEFAULT NULL,

    ->   date_of_birth DATE NOT NULL,

    ->   age_month INT NOT NULL,

    ->   age_years INT NOT NULL,

    ->   class VARCHAR(50),

    ->   animal_id INT NOT NULL,

    ->   FOREIGN KEY (animal_id) REFERENCES animals (id)

    -> );

Query OK, 0 rows affected (0,04 sec)

mysql> CREATE TABLE all_animals (

    ->   id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,

    ->   name VARCHAR(50) NOT NULL,

    ->   instructions VARCHAR(100) DEFAULT NULL,

    ->   date_of_birth DATE NOT NULL,

    ->   class VARCHAR(50),

    ->   animal_id INT NOT NULL,

    ->   FOREIGN KEY (animal_id) REFERENCES animals (id)

    -> );

Query OK, 0 rows affected (0,05 sec)

mysql> INSERT INTO all_animals  (name, instructions, date_of_birth, animal_id, class)

    -> SELECT name, instructions, date_of_birth, animal_id, 'dog' AS class

    -> FROM dogs;

Query OK, 4 rows affected (0,02 sec)

Records: 4  Duplicates: 0  Warnings: 0

mysql> INSERT INTO all_animals  (name, instructions, date_of_birth, animal_id, class)

    -> SELECT name, instructions, date_of_birth, animal_id, 'cat' AS class

    -> FROM cats;

Query OK, 4 rows affected (0,01 sec)

Records: 4  Duplicates: 0  Warnings: 0

mysql> INSERT INTO all_animals  (name, instructions, date_of_birth, animal_id, class)

    -> SELECT name, instructions, date_of_birth, animal_id, 'hamster' AS class

    -> FROM hamsters;

Query OK, 4 rows affected (0,01 sec)

Records: 4  Duplicates: 0  Warnings: 0

mysql> INSERT INTO all_animals  (name, instructions, date_of_birth, animal_id, class)

    -> SELECT name, instructions, date_of_birth, animal_id, 'horse' AS class

    -> FROM horses;

Query OK, 4 rows affected (0,01 sec)

Records: 4  Duplicates: 0  Warnings: 0

mysql> INSERT INTO all_animals  (name, instructions, date_of_birth, animal_id, class)

    -> SELECT name, instructions, date_of_birth, animal_id, 'donkey' AS class

    -> FROM donkeys;

Query OK, 4 rows affected (0,01 sec)

Records: 4  Duplicates: 0  Warnings: 0

mysql> SELECT *

    -> FROM all_animals;

+----+------------+--------------+---------------+---------+-----------+

| id | name       | instructions | date_of_birth | class   | animal_id |

+----+------------+--------------+---------------+---------+-----------+

|  1 | Dzhera     | sit          | 2021-09-01    | dog     |         1 |

|  2 | Kaina      | paw          | 2020-02-12    | dog     |         1 |

|  3 | Spike      | down         | 2022-08-04    | dog     |         1 |

|  4 | Rokky      | heel         | 2019-07-09    | dog     |         1 |

|  8 | Ryzhik     | kitty, kitty | 2023-11-26    | cat     |         1 |

|  9 | Barsik     | kitty, kitty | 2023-06-15    | cat     |         1 |

| 10 | Zifirka    | kitty, kitty | 2023-07-12    | cat     |         1 |

| 11 | Frikadelka | kitty, kitty | 2022-05-07    | cat     |         1 |

| 15 | Homa       | NULL         | 2023-05-03    | hamster |         1 |

| 16 | Tishka     | NULL         | 2023-04-16    | hamster |         1 |

| 17 | Myshka     | NULL         | 2023-07-10    | hamster |         1 |

| 18 | Laska      | NULL         | 2023-07-05    | hamster |         1 |

| 22 | Viola      | jamp         | 2019-07-17    | horse   |         2 |

| 23 | Grom       | run          | 2018-12-03    | horse   |         2 |

| 24 | Zvezda     | smile        | 2017-05-01    | horse   |         2 |

| 25 | Pegas      | forward      | 2020-04-03    | horse   |         2 |

| 29 | Stiopa     | go, stop     | 2019-06-09    | donkey  |         2 |

| 30 | Duska      | go, stop     | 2020-03-06    | donkey  |         2 |

| 31 | Cheburek   | go, stop     | 2021-05-09    | donkey  |         2 |

| 32 | Iakov      | go, stop     | 2022-08-05    | donkey  |         2 |

+----+------------+--------------+---------------+---------+-----------+

20 rows in set (0,00 sec)

mysql> SELECT * FROM young_animals;

Empty set (0,01 sec)

mysql> INSERT INTO young_animals (name, instructions, date_of_birth, age_month, age_years, class, animal_id)

    -> SELECT name, instructions, date_of_birth, age_month, age_years, class, animal_id

    -> FROM

    -> (SELECT name, instructions, date_of_birth, TIMESTAMPDIFF(MONTH , date_of_birth, CURDATE()) AS age_month , TIMESTAMPDIFF(YEAR , date_of_birth, CURDATE()) AS age_years, class, animal_id

    -> FROM all_animals) AS tmp

    -> WHERE age_month > 12 AND age_month < 36;

Query OK, 5 rows affected (0,02 sec)

Records: 5  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM young_animals;

+----+------------+--------------+---------------+-----------+-----------+--------+-----------+

| id | name       | instructions | date_of_birth | age_month | age_years | class  | animal_id |

+----+------------+--------------+---------------+-----------+-----------+--------+-----------+

|  1 | Dzhera     | sit          | 2021-09-01    |        29 |         2 | dog    |         1 |

|  2 | Spike      | down         | 2022-08-04    |        17 |         1 | dog    |         1 |

|  3 | Frikadelka | kitty, kitty | 2022-05-07    |        20 |         1 | cat    |         1 |

|  4 | Cheburek   | go, stop     | 2021-05-09    |        32 |         2 | donkey |         2 |

|  5 | Iakov      | go, stop     | 2022-08-05    |        17 |         1 | donkey |         2 |

+----+------------+--------------+---------------+-----------+-----------+--------+-----------+

5 rows in set (0,00 sec)

mysql>

![task 7 - 12](https://github.com/TimurDanilov1985/FinalControlWorkSpecialization/blob/master/images/db.jpg)
![task 7 - 12](https://github.com/TimurDanilov1985/FinalControlWorkSpecialization/blob/master/images/db1.jpg)
