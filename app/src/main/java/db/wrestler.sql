DROP TABLE IF EXISTS wrestlers;
DROP TABLE IF EXISTS subjects;


CREATE TABLE wrestlers (
       id INTEGER PRIMARY KEY NOT NULL,
       first_name VARCHAR (50),
       nick_name VARCHAR (50),
       last_name VARCHAR (50),
       telephone VARCHAR (25),
       email VARCHAR (50),
       member_since DATE DEFAULT "0000-00-00"
);


CREATE TABLE subjects (
	id INTEGER PRIMARY KEY NOT NULL,
	name VARCHAR (50),
	description TEXT,
	wrestler_id INTEGER REFERENCES wrestler(id)
);

