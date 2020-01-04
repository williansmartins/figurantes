INSERT INTO endereco  VALUES (1,'Itapevi','Sao Paulo');
INSERT INTO endereco  VALUES (2,'Osasco','Sao Paulo');
INSERT INTO figurante VALUES (3,1.78,'305.809.118-11','contato@williansmartins.com','branco','M',37,'Willians Martins',80,'secreta',1);
INSERT INTO figurante VALUES (4,1.6,'305.809.118-11','maria@williansmartins.com','indigena','F',37,'Maria da Penha',65,'nova',2);

INSERT INTO login (ativo, email, nome, senha, tipo)
VALUES (1, 'maria@teste.com', 'Maria Martins', 'secreta1', 'FIGURANTE');
INSERT INTO login (ativo, email, nome, senha, tipo)
VALUES (0, 'joao@teste.com', 'Joao Martins', 'secreta2', 'CLIENTE');