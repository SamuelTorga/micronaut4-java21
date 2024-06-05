CREATE TABLE IF NOT EXISTS usuario
(
    id               SERIAL PRIMARY KEY,
    uuid             VARCHAR(36) NOT NULL,
    criado           TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    atualizado       TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    nome             TEXT        NOT NULL,
    email            VARCHAR(255),
    primeiro_nome    VARCHAR(255),
    sobrenome        VARCHAR(255),
    email_verificado BOOLEAN              DEFAULT FALSE
);