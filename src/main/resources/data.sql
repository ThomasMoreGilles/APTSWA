INSERT INTO USER (ID, USERNAME, PASSWORD, ROLE)
VALUES (nextval('user_seq'), 'gilles', '$2y$10$XG.P/r5pUWaUIE6zfgHAd.Xc9AxbThcn28jcBBIX4IH77FQH2oyOS', 'ROLE_USER' );

INSERT INTO USER (ID, USERNAME, PASSWORD, ROLE)
VALUES (nextval('user_seq'), 'admin', '$2y$10$XDHrTQGBDuh6pH9n0P.OI.VWUK1mm2gRIOdnp17peKCgELQCsHVry', 'ROLE_ADMIN' );


INSERT INTO Movie (ID, DIRECTOR, TITLE, DESCRIPTION, DURATION, YEAR)
VALUES (nextval('movie_seq'), 'Niki Caro', 'Mulan ', 'A young Chinese maiden disguises herself as a male warrior in order to save her father.', 115, 2020);

INSERT INTO Movie (ID, DIRECTOR, TITLE, DESCRIPTION, DURATION, YEAR)
VALUES (nextval('movie_seq'), 'Greta Gerwig', 'Little Women', 'Jo March reflects back and forth on her life, telling the beloved story of the March sisters - four young women each determined to live life on their own terms.', 135, 2019);

INSERT INTO Movie (ID, DIRECTOR, TITLE, DESCRIPTION, DURATION, YEAR)
VALUES (nextval('movie_seq'), 'Martin Scorsese', 'The Irishman', 'An old man recalls his time painting houses for his friend, Jimmy Hoffa, through the 1950-70s.', 209, 2019);

INSERT INTO Movie (ID, DIRECTOR, TITLE, DESCRIPTION, DURATION, YEAR)
VALUES (nextval('movie_seq'), 'Todd Phillips', 'Joker', 'In Gotham City, mentally troubled comedian Arthur Fleck is disregarded and mistreated by society. He then embarks on a downward spiral of revolution and bloody crime. This path brings him face-to-face with his alter-ego: the Joker.', 122, 2019);

INSERT INTO Movie (ID, DIRECTOR, TITLE, DESCRIPTION, DURATION, YEAR)
VALUES (nextval('movie_seq'), 'Bong Joon Ho', 'Parasite', 'Greed and class discrimination threaten the newly formed symbiotic relationship between the wealthy Park family and the destitute Kim clan.', 132, 2019);

INSERT INTO Movie (ID, DIRECTOR, TITLE, DESCRIPTION, DURATION, YEAR)
VALUES (nextval('movie_seq'), 'James Mangold', 'Ford v Ferrari', 'American car designer Carroll Shelby and driver Ken Miles battle corporate interference and the laws of physics to build a revolutionary race car for Ford in order to defeat Ferrari at the 24 Hours of Le Mans in 1966.', 152, 2019);

INSERT INTO Movie (ID, DIRECTOR, TITLE, DESCRIPTION, DURATION, YEAR)
VALUES (nextval('movie_seq'), 'Quentin Tarantino', 'Once Upon a Time in Hollywood', 'A faded television actor and his stunt double strive to achieve fame and success in the final years of Hollywoods Golden Age in 1969 Los Angeles.', 161, 2019);

INSERT INTO Movie (ID, DIRECTOR, TITLE, DESCRIPTION, DURATION, YEAR)
VALUES (nextval('movie_seq'), 'Anthony Russo, Joe Russo', 'Avengers: Endgame', 'After the devastating events of Avengers: Infinity War, the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos actions and restore balance to the universe.', 181, 2019);
