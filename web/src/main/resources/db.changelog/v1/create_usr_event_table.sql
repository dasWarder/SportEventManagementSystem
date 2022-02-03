DROP TABLE IF EXISTS usr_event;

CREATE TABLE usr_event(
    usr_id BIGINT NOT NULL,
    event_id BIGINT NOT NULL,
    FOREIGN KEY(usr_id) REFERENCES usr(id),
    FOREIGN KEY(event_id) REFERENCES event(id)
);