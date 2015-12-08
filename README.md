INSTALL MYSQL
brew install mysql

LOGIN AS ROOT
mysql -u root -p

CREATE USER
CREATE USER 'username'@'host' IDENTIFIED BY 'password';
example: CREATE USER 'student'@'localhost' IDENTIFIED BY 'student';

GRANT PERMISSIONS
GRANT ALL PRIVILEGES ON *.* TO 'student'@'localhost' WITH GRANT OPTION;

DOWNLOAD MYSQL WORKBENCH

DOWNLOAD MYSQL JDBC DRIVER

TUTORIAL FOUND AT https://www.youtube.com/watch?v=Q4T7jg0Lv4E
