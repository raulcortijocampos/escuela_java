CREATE TABLE USERS (ID INTEGER DEFAULT AUTOINCREMENT: start 1 increment 1  NOT NULL GENERATED ALWAYS AS IDENTITY, EMAIL VARCHAR(255) NOT NULL, PASSWORD VARCHAR(50) NOT NULL, "NAME" VARCHAR(50) NOT NULL, AGE INTEGER NOT NULL, PRIMARY KEY (ID));