-- CREAT DATABASE studentmanagement

CREATE DATABASE studentmanagement CHARACTER SET utf8 COLLATE utf8_general_ci;

USE studentmanagement;

/* CRAETE TABLE */

CREATE TABLE student(
	id INT AUTO_INCREMENT,
    first_name VARCHAR(25) NOT NULL,
    last_name VARCHAR(25),
    gender SET('Male','FeMale') NOT NULL,
    age INT(100),
    telephone VARCHAR(10), CHECK (telephone REGEXP '[0-9]{10}'),
    scores int,
    CHECK(0<=scores AND scores<=100),
    PRIMARY KEY(id)
);

ALTER TABLE student
ALTER age SET DEFAULT 18;

/*DROP TABLE student;
TRUNCATE TABLE student;*/

/* INSERT DATA */

INSERT INTO student (first_name,last_name,gender,age,telephone,scores)
VALUES('Le','Trai','Male',20,9546123457,70);

INSERT INTO student (first_name,last_name,gender,telephone,scores)
VALUES('Tran','Tam','FeMale',null,60);

INSERT INTO student (first_name,last_name,gender,age,telephone,scores)
VALUES('David','Lee','Male',20,9234798740,90);

INSERT INTO student (first_name,last_name,gender,telephone,scores)
VALUES('Nguyen','Thu','FeMale',9123456871,50);

INSERT INTO student (first_name,last_name,gender,age,telephone,scores)
VALUES('Tran','Be','FeMale',21,9312345704,40);

INSERT INTO student (first_name,last_name,gender,age,telephone,scores)
VALUES('Le','Nguyet','FeMale',23,null,70);

INSERT INTO student (first_name,last_name,gender,telephone,scores)
VALUES('Vo','Nguyen','Male',9844568714,80);

INSERT INTO student (first_name,last_name,gender,age,telephone,scores)
VALUES('Tran','Ngam','Male',23,null,30);

INSERT INTO student (first_name,last_name,gender,age,telephone,scores)
VALUES('Nguyen','Atoni','Male',20,9234568744,70);

INSERT INTO student (first_name,last_name,gender,telephone,scores)
VALUES('Nguyen','Bac','Male',null,45);

INSERT INTO student (first_name,last_name,gender,telephone,scores)
VALUES('Tran','Binh','Male',9682316874,30);

INSERT INTO student (first_name,last_name,gender,age,telephone,scores)
VALUES('Ly','Nguyen','FeMale',22,9132316874,50);

INSERT INTO student (first_name,last_name,gender,age,telephone,scores)
VALUES('Dinh','Khoa','Male',21,null,60);

INSERT INTO student (first_name,last_name,gender,telephone,scores)
VALUES('Dinh','Tu','Male',9132316451,85);

INSERT INTO student (first_name,last_name,gender,age,telephone,scores)
VALUES('Do','Canh','Male',24,9132466874,60);

INSERT INTO student (first_name,last_name,gender,telephone,scores)
VALUES('Van','Thanh','Male',null,50);

INSERT INTO student (first_name,last_name,gender,age,telephone,scores)
VALUES('Vo','Ha','FeMale',20,9131450874,80);

INSERT INTO student (first_name,last_name,gender,age,telephone,scores)
VALUES('Ho','Kha','Male',21,9132466874,100);

INSERT INTO student (first_name,last_name,gender,telephone,scores)
VALUES('Nguyen','Yen','FeMale',9131236874,40);

INSERT INTO student (first_name,last_name,gender,age,telephone,scores)
VALUES('Le','Trong','Male',27,9212456874,70);

SELECT * FROM student;

/* 1 Print out the number of students */ 

SELECT COUNT(*) FROM student;

/* 2 Print out the number of male students */

SELECT COUNT(*) FROM student
WHERE gender = 'Male';

/* 3 Print out the list of female students */

SELECT * FROM student
WHERE gender = 'FeMale';

/* 4 Print out a list of students who have not updated their phone numbers */

SELECT * FROM student
WHERE telephone IS null;

/* 5 Print out the list of students over 18 years old */

SELECT * FROM student
WHERE age>18;

/* 6 Print out a list of good students(scores>80) */

SELECT * FROM student
WHERE scores>80;

/* 7 Print weak students list (scores <45) */

SELECT * FROM student
WHERE scores<45;

/* 8 Print out the student list with last_name or first_name = ‘nike’ */

SELECT * FROM student
WHERE first_name = 'nike' OR last_name = 'nike';