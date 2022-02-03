DELETE FROM organization;
ALTER SEQUENCE org_seq RESTART WITH 1;

INSERT INTO organization(id, name, adding_date) VALUES
    (1, 'Toronto University', '2021-02-02 12:00:00'),
    (2, 'Stanford University', '2021-03-03 12:00:00'),
    (3, 'Tartu University', '2021-04-04 12:00:00');

SELECT setval('org_seq', max(id)) FROM organization;