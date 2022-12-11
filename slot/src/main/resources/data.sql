INSERT INTO ADDRESS
(ID, CITY, LATITUDE, LONGITUDE) VALUES
(1, 'Berlin',  32.7007, 35.2973),
(2, 'Nazareth',  32.7017, 35.2953),
(3, 'Rome',  32.7007, 35.2973),
(4, 'Munich',  32.7007, 35.2973),
(5, 'Regensburg',  32.7017, 35.2953),
(6, 'Haifa',  32.7007, 35.2973);

INSERT INTO PARKING_LOT
(ID, NAME, ADDRESS_ID) VALUES
(1, 'Naz Parking by Majd', 1),
(2, 'mr parking by Mahmoud', 2),
(3, 'smart Park by Leo', 3),
(4, 'Naz Parking by Yamen', 1),
(5, 'mr parking by Mo', 2),
(6, 'smart Park by Faton', 3),
(7, 'Iksal Parking by Omar', 1),
(8, 'mr parking by Halim', 2),
(9, 'One time Park by Zak', 3);

INSERT INTO SLOT
(ID, SLOT_NUMBER ,PARKING_LOT_ID, TYPE, BOOKED) VALUES
(1, 1, 1, 'NORMAL', FALSE), (2, 2, 1, 'NORMAL', FALSE),
(3, 1, 2, 'NORMAL', FALSE), (4, 2, 2, 'NORMAL', FALSE),
(5, 1 ,3, 'NORMAL', FALSE), (6,2 ,3, 'NORMAL', FALSE),
(7, 1, 2, 'NORMAL', FALSE), (8, 2, 4, 'NORMAL', FALSE),
(9, 1, 4, 'NORMAL', FALSE), (10, 2, 5, 'NORMAL', FALSE),
(11, 1 ,5, 'NORMAL', FALSE), (12,2 ,5, 'NORMAL', FALSE),
(13, 1, 6, 'NORMAL', FALSE), (14, 2, 6, 'NORMAL', FALSE),
(15, 1, 7, 'NORMAL', FALSE), (16, 2, 6, 'NORMAL', FALSE),
(17, 1 ,8, 'NORMAL', FALSE), (18,2 ,7, 'NORMAL', FALSE),
(19, 1, 9, 'NORMAL', FALSE), (20, 2, 8, 'NORMAL', FALSE),
(21, 1, 8, 'NORMAL', FALSE), (22, 2, 8, 'NORMAL', FALSE),
(23, 1 ,5, 'NORMAL', FALSE), (24,2 ,6, 'NORMAL', FALSE);


