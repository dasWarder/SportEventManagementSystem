DELETE FROM event;
ALTER SEQUENCE event_seq RESTART WITH 1;

INSERT INTO event(id, sport_name, location, date, first_place_prize, second_place_prize, third_place_prize, organization_id) VALUES
    (1, 'Football', 'Toronto University football stadium', '2021-05-05 12:00:00', '500$', '300$', '100$', 1),
    (2, 'Basketball', 'Toronto University block A, basketball stadium', '2021-06-06 12:00:00', '500$', '300$', '150$', 1),
    (3, 'Swimming', 'Tartu University swimming pool, Karu 17', '2021-07-07 12:00:00', '1st place champion cup', null, null, 3),
    (4, 'Kudo', 'Standford, Sand Hill Rd, Mosher Way gym', '2021-08-08 12:00:00', 'A cup', 'A cup', 'A cup', 2);

SELECT setval('event_seq', max(id)) FROM event;