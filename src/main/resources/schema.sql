drop table if exists APP_USER;
drop table if exists Visualisaton_Data;

CREATE TABLE APP_USER (
	id LONG PRIMARY KEY AUTO_INCREMENT,
	firstname VARCHAR(50) NOT NULL,
	lastname VARCHAR(50) NOT NULL,
	username VARCHAR(50) NOT NULL,
	mobile VARCHAR(20) NOT NULL,
	email VARCHAR(40) NOT NULL,
	password VARCHAR(20) NOT NULL,
	refreshed DATE
);

CREATE TABLE Visualisaton_Data (
	id LONG PRIMARY KEY AUTO_INCREMENT,
	data_size LONG NOT NULL,
	color VARCHAR(10) NOT NULL
);
