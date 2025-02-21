CREATE DATABASE IF NOT EXISTS geo_db;
USE geo_db;
CREATE TABLE t_region (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          country_code VARCHAR(2) NOT NULL,
                          province VARCHAR(50),
                          city VARCHAR(50),
                          UNIQUE KEY (country_code, province, city)
);

CREATE TABLE t_user_allowed_region (
                                       user_id VARCHAR(50),
                                       region_id INT,
                                       PRIMARY KEY (user_id, region_id)
);

INSERT INTO t_region (country_code, province, city) VALUES
                                                        ('CN', 'Guangdong', NULL),
                                                        ('CN', 'Zhejiang', 'Hangzhou');


INSERT INTO t_user_allowed_region VALUES
                                      ('user1', 1),
                                      ('user2', 1);
INSERT INTO t_user_allowed_region VALUES
                                      ('user3', 2),
                                      ('user4', 2);
