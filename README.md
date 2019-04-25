# organizer

this app supports code in java and scala

this is an API which will be used by our organizer interface

# Developer Guide

Build command :  
mvn -U clean install

Run Command :  
mvn spring-boot:run

# install my sql and commands to make basic snapshot to run app

CREATE TABLE IF NOT EXISTS user (user_id int(5) NOT NULL AUTO_INCREMENT,password varchar(200) NOT NULL,email_id varchar(100) NOT NULL, contact varchar(20),PRIMARY KEY (user_id)) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

insert into user values('123','prshntmishra033@gmail.com','9899683318');
insert into user values('123','rahul.usit@gmail.com','1234567');

# sample DB snapshot

user_id | password | email_id | contact
10 | 123 | prshntmishra033@gmail.com | 9899683318
11 | 123 | rahul.usit@gmail.com | 1234567

# swagger UI link

http://localhost:8080/swagger-ui.html
