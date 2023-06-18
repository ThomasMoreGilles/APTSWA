INSERT INTO USER (ID, USERNAME, PASSWORD, ROLE)
VALUES (nextval('user_seq'), 'gilles', '$2y$10$XG.P/r5pUWaUIE6zfgHAd.Xc9AxbThcn28jcBBIX4IH77FQH2oyOS', 'ROLE_USER' );

INSERT INTO USER (ID, USERNAME, PASSWORD, ROLE)
VALUES (nextval('user_seq'), 'admin', '$2y$10$XDHrTQGBDuh6pH9n0P.OI.VWUK1mm2gRIOdnp17peKCgELQCsHVry', 'ROLE_ADMIN' );


INSERT INTO Movie (ID, DIRECTOR, TITLE, DESCRIPTION, DURATION, YEAR, ARCHIVED)
VALUES  (nextval('movie_seq'),'Niki Caro', 'Mulan', 'A young Chinese maiden disguises herself as a male warrior in order to save her father.', 115, 2020, false),
        (nextval('movie_seq'),'Greta Gerwig', 'Little Women', 'Jo March reflects back and forth on her life, telling the beloved story of the March sisters - four young women each determined to live life on their own terms.', 135, 2019, false),
        (nextval('movie_seq'),'Martin Scorsese', 'The Irishman', 'An old man recalls his time painting houses for his friend, Jimmy Hoffa, through the 1950-70s.', 209, 2019, false),
        (nextval('movie_seq'), 'Todd Phillips', 'Joker', 'In Gotham City, mentally troubled comedian Arthur Fleck is disregarded and mistreated by society. He then embarks on a downward spiral of revolution and bloody crime. This path brings him face-to-face with his alter-ego: the Joker.', 122, 2019, false),
        (nextval('movie_seq'), 'Bong Joon Ho', 'Parasite', 'Greed and class discrimination threaten the newly formed symbiotic relationship between the wealthy Park family and the destitute Kim clan.', 132, 2019, false),
        (nextval('movie_seq'), 'James Mangold', 'Ford v Ferrari', 'American car designer Carroll Shelby and driver Ken Miles battle corporate interference and the laws of physics to build a revolutionary race car for Ford in order to defeat Ferrari at the 24 Hours of Le Mans in 1966.', 152, 2019, false),
        (nextval('movie_seq'), 'Quentin Tarantino', 'Once Upon a Time in Hollywood', 'A faded television actor and his stunt double strive to achieve fame and success in the final years of Hollywoods Golden Age in 1969 Los Angeles.', 161, 2019, false),
        (nextval('movie_seq'), 'Anthony Russo, Joe Russo', 'Avengers: Endgame', 'After the devastating events of Avengers: Infinity War, the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos actions and restore balance to the universe.', 181, 2019, false),
        (nextval('movie_seq'), 'Bong Joon Ho', 'Snowpiercer', 'In a future where a failed climate-change experiment has killed all life except for the lucky few who boarded the Snowpiercer, a train that travels around the globe, a class system emerges.', 126, 2013, false),
        (nextval('movie_seq'), 'Chloé Zhao', 'Nomadland', 'After losing everything in the Great Recession, a woman embarks on a journey through the American West, living as a van-dwelling modern-day nomad.', 107, 2020, false),
        (nextval('movie_seq'), 'Damien Chazelle', 'La La Land', 'While navigating their careers in Los Angeles, a pianist and an actress fall in love while attempting to reconcile their aspirations for the future.', 128, 2016, true),
        (nextval('movie_seq'), 'Taika Waititi', 'Jojo Rabbit', 'A young boy in Hitler army finds out his mother is hiding a Jewish girl in their home.', 108, 2019, false),
        (nextval('movie_seq'), 'Jordan Peele', 'Get Out', 'A young African American man visits his Caucasian girlfriends mysterious family estate.', 104, 2017, true),
        (nextval('movie_seq'), 'Sam Mendes', '1917', 'During World War I, two British soldiers are given an impossible mission: deliver a message deep in enemy territory that will stop 1,600 men from walking into a deadly trap.', 119, 2019, false),
        (nextval('movie_seq'), 'Christopher Nolan', 'Tenet', 'A secret agent embarks on a dangerous, time-bending mission to prevent the start of World War III.', 150, 2020, true),
        (nextval('movie_seq'), 'Greta Gerwig', 'Lady Bird', 'In 2002, an artistically inclined seventeen-year-old girl comes of age in Sacramento, California.', 94, 2017, false);