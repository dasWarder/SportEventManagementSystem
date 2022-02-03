DROP TABLE IF EXISTS profile;

CREATE TABLE profile(
    usr_id BIGINT NOT NULL PRIMARY KEY,
    first_name VARCHAR DEFAULT '',
    last_name VARCHAR DEFAULT '',
    age BIGINT,
    FOREIGN KEY(usr_id) REFERENCES usr(id)
);