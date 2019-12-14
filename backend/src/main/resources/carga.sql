#figurante
INSERT INTO `endereco` VALUES (1,'Itapevi','Sao Paulo'),(3,'Osasco','Sao Paulo');
INSERT INTO `figurante` VALUES (2,1.78,'305.809.118-11','contato@williansmartins.com','branco','M',37,'Willians Martins',80,'secreta',1),(4,1.6,'305.809.118-11','maria@williansmartins.com','india','F',37,'Maria da Penha',65,'nova',3);

#login
INSERT INTO `figurantes`.`login`
(
`ativo`,
`email`,
`nome`,
`senha`,
`tipo`)
VALUES
(1, 'maria@teste.com', 'Maria Martins', 'secreta1', 'FIGURANTE');
INSERT INTO `figurantes`.`login`
(
`ativo`,
`email`,
`nome`,
`senha`,
`tipo`)
VALUES
(0, 'joao@teste.com', 'Joao Martins', 'secreta2', 'CLIENTE');
