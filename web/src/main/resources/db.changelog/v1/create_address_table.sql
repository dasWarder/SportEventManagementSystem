DROP TABLE IF EXISTS address;

CREATE TABLE address(
    organization_id BIGINT PRIMARY KEY NOT NULL,
    state VARCHAR DEFAULT '',
    city VARCHAR DEFAULT '',
    extra_info VARCHAR DEFAULT '',
    zip BIGINT,
    FOREIGN KEY(organization_id) REFERENCES organization(id)
);