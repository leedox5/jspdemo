DELIMITER //

FOR i IN 1..20
DO
    INSERT INTO user(
	    name,
	    email,
		city
	  ) VALUES (
	    CONCAT('USER-', i), 
		CONCAT('user-', i, '@gmail.com'),
		'SEOUL'
	  );
END FOR;
//

DELIMITER ;