DROP TABLE IF EXISTS character;

CREATE TABLE character (
        id_character BIGINT AUTO_INCREMENT NOT NULL,
        name VARCHAR(60) NOT NULL,
        race VARCHAR(40) NULL,
        age BIGINT NOT NULL,
        gender VARCHAR(10) NULL,
        primary_weapon VARCHAR(60) NULL,
        hp DOUBLE NULL,
        mp DOUBLE NULL,
        PRIMARY KEY (id_character));