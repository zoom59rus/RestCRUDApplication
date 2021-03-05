[![Build Status](https://travis-ci.org/zoom59rus/HibernateCRUDApplication.svg?branch=master)](https://travis-ci.org/zoom59rus/HibernateCRUDApplication)
# Module_2_3
# Реализовать REST API приложение

## Постанока задачи
Необходимо реализовать REST API приложение, которое взаимодействует с файловым хранилищем AWS S3 и предоставляет возможность получать доступ к файлам и истории загрузок. Сущности:      
1.  User  
2.  Event  
3.  File  
4.  FileStatus (enum ACTIVE, DELETED)  
User -> List<File> files + List<Events>  

В качестве хранилища данных необходимо использовать реляционную базу данных.

## Требования  
1.  Придерживаться подхода MVC;  
2.  Инициализация БД должна быть реализована с помощью Flyway;  
3.  Для взаимодействия с БД - Hibernate, конфигурирование через аннотации;
4.  Репозиторий должен иметь бейдж сборки travis(https://travis-ci.com/);  
4.  Для сборки  проекта использовать Maven;  
5.  Взаимодействие с пользователем необходимо реализовать с помощью Postman (https://www.getpostman.com/);  
6.  Рабочее приложение должно быть развернуто на heroku.com;  
7.  Взаимодействие с AWS через AWS SDK.  

Технологии: Java, MySQL, Hibernate, HTTP, Servlets, Maven, Flyway.   

## Результат 
Результатом выполнения задания должен быть репозиторий на github, с использованием Travis (https://travis-ci.org/) и отображением статуса сборки проекта.  

## Инструкция по запуску  