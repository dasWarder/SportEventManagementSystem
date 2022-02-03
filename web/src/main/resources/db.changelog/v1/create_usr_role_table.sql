DROP TABLE IF EXISTS usr_role;

CREATE TABLE usr_role(
    usr_id BIGINT NOT NULL,
    role_id BIGINT NOT NULL,
    FOREIGN KEY(usr_id) REFERENCES usr(id),
    FOREIGN KEY(role_id) REFERENCES role(id)
);