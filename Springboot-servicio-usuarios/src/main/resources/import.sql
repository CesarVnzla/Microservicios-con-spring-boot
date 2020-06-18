INSERT INTO usuarios (username, pasword, enabled, nombre, apellido, email) VALUES ('cesar020', '$2a$10$3LggCgN0cY0Pc5DAYV9C1eGa9uoiGKVSNT2CXiwW9Kc5b0oZmzfeK', true, 'Cesar', 'Reinoso', 'cesar@gmail.com')
INSERT INTO usuarios (username, pasword, enabled, nombre, apellido, email) VALUES ('andrees', '$2a$10$q8iR6krqG6dFcZ1ovKVtqOo1QpyQTRA5SYtr8uu8csKlhFY9XwLmi', true, 'Andres', 'Reinoso', 'andres@yahoo.com')
INSERT INTO usuarios (username, pasword, enabled, nombre, apellido, email) VALUES ('josee01', '$2a$10$c2xaos1Ki5KXAxurEIal5.aHaLpQKjZlqMwLn0EkSyPK.e2Vbtxh2', true, 'Jose', 'Reinoso', 'jose@hotmail.com')


INSERT INTO roles (nombre) VALUES ('ROLE_USER')
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN')


INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1,1)
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2,2)
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2,1)																





