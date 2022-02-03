DELETE FROM usr;
ALTER SEQUENCE usr_seq RESTART WITH 1;

INSERT INTO usr(id, email, password, enabled, registration_date) VALUES
    (1, 'alex@gmail.com', '$2a$12$GtbJqXDOcbJFN3AYu2A0n.BQndLAVMoz6wGtDY3nR1n8ugBTNd6Yi', true, '2021-01-01 12:00:00'),
    (2, 'brad@gmail.com', '$2a$12$GtbJqXDOcbJFN3AYu2A0n.BQndLAVMoz6wGtDY3nR1n8ugBTNd6Yi', true, '2021-01-01 12:00:00'),
    (3, 'jack@gmail.com', '$2a$12$GtbJqXDOcbJFN3AYu2A0n.BQndLAVMoz6wGtDY3nR1n8ugBTNd6Yi', true, '2021-01-01 12:00:00');

SELECT setval('usr_seq', max(id)) FROM usr;