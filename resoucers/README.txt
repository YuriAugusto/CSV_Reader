# CSVReader_CRUD
# Leitor de arquivos CSV com integração com Database

# Abaixo estão listados as instruções para criação de banco de dados e também tabela.

CREATE DATABASE bancocsv; # cria o database

CREATE TABLE pessoas( 
id int (4) AUTO_INCREMENT,
nome VARCHAR(50),
idade int(3),
sexo VARCHAR(1),
PRIMARY KEY(id)
);# cria a tabela para salvar os dados
# é necessário fazer a alteração do caminho do CSV na String de conexão e também será preciso alterar as credenciais de acesso de acordo com o seu banco