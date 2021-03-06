DROP TABLE IF EXISTS organization;
DROP SEQUENCE IF EXISTS org_seq;

CREATE SEQUENCE org_seq START WITH 1;

CREATE TABLE organization(
    id BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('org_seq'),
    name VARCHAR NOT NULL,
    adding_date TIMESTAMP NOT NULL
);