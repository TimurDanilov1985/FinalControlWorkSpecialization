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


