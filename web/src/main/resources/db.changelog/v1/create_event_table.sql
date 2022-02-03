DROP TABLE IF EXISTS event;
DROP SEQUENCE IF EXISTS event_seq;

CREATE SEQUENCE event_seq START WITH 1;

CREATE TABLE event (
    id BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('event_seq'),
    sport_name VARCHAR NOT NULL DEFAULT '',
    location VARCHAR NOT NULL DEFAULT '',
    date TIMESTAMP NOT NULL,
    first_place_prize VARCHAR DEFAULT '',
    second_place_prize VARCHAR DEFAULT '',
    third_place_prize VARCHAR DEFAULT '',
    organization_id BIGINT NOT NULL,
    FOREIGN KEY(organization_id) REFERENCES organization(id)
);