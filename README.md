curl -X POST \
  http://localhost:8080/oauth/token \
  -H 'authorization: Basic ZGV2Z2xhbi1jbGllbnQ6ZGV2Z2xhbi1zZWNyZXQ=' \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/x-www-form-urlencoded' \
  -d 'username=Alex123&password=password&grant_type=password'
  
curl -X GET \
  'http://localhost:8080/users/user?access_token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MjcxNjkzNTcsInVzZXJfbmFtZSI6IkFsZXgxMjMiLCJhdXRob3JpdGllcyI6WyJST0xFX0FETUlOIl0sImp0aSI6IjVkNjYwYjUxLTcxNjktNDk4YS1iMzljLTMwMDg0NTU2ZGQ5NCIsImNsaWVudF9pZCI6ImRldmdsYW4tY2xpZW50Iiwic2NvcGUiOlsicmVhZCIsIndyaXRlIiwidHJ1c3QiXX0.CZZkYhCQnabsoT69kDGCBAz9jLFNZAx7wBF_Lju4S6Q' \
  -H 'cache-control: no-cache' \
  -H 'postman-token: e35c7b32-48ac-a191-f894-14fe86860a53'
  
INSERT INTO User (id, username, password, salary, age) VALUES (1, 'Alex123', '$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu', 3456, 33);
INSERT INTO User (id, username, password, salary, age) VALUES (2, 'Tom234', '$2a$04$PCIX2hYrve38M7eOcqAbCO9UqjYg7gfFNpKsinAxh99nms9e.8HwK', 7823, 23);
INSERT INTO User (id, username, password, salary, age) VALUES (3, 'Adam', '$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu', 4234, 45);