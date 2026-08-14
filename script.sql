CREATE DATABASE cineflix;

USE cineflix;

CREATE TABLE usuario (
    login VARCHAR(50) PRIMARY KEY,
    nome VARCHAR(100),
    senha VARCHAR(50),
    tipo VARCHAR(20)
);

CREATE TABLE podcast (
    id INT PRIMARY KEY AUTO_INCREMENT,
    produtor VARCHAR(100),
    nomeEpisodio VARCHAR(100),
    numeroEpisodio INT,
    duracao VARCHAR(50),
    url VARCHAR(255)
);

INSERT INTO usuario VALUES
('admin', 'Administrador', '123', 'Administrador'),
('operador', 'Operador', '123', 'Operador'),
('usuario', 'Usuário', '123', 'Usuario');