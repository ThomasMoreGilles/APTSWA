INSERT INTO USER (ID, USERNAME, PASSWORD, ROLE)
VALUES (nextval('user_seq'), 'gilles', '$2y$10$XG.P/r5pUWaUIE6zfgHAd.Xc9AxbThcn28jcBBIX4IH77FQH2oyOS', 'ROLE_USER' );

INSERT INTO USER (ID, USERNAME, PASSWORD, ROLE)
VALUES (nextval('user_seq'), 'admin', '$2y$10$XDHrTQGBDuh6pH9n0P.OI.VWUK1mm2gRIOdnp17peKCgELQCsHVry', 'ROLE_ADMIN' );

INSERT INTO Movie (ID, AUTHOR, TITLE, DESCRIPTION, DURATION, YEAR)
VALUES (nextval('movie_seq'), 'JRR Tolkien', 'Lord Of The Rings', 'My precious', 579, 1959);
