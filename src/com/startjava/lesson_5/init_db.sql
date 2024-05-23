\c robots;

DROP TABLE IF EXISTS jaegers;

CREATE TABLE jaegers (
    PRIMARY KEY (id),
    id         SERIAL,
    model_name VARCHAR(255)  NOT NULL,
    mark       VARCHAR(10)   NOT NULL,
    height     DECIMAL(5, 2) NOT NULL,
    weight     DECIMAL(7, 2) NOT NULL,
    status     VARCHAR(50)   NOT NULL,
    origin     VARCHAR(255)  NOT NULL,
    launch     DATE          NOT NULL,
    kaiju_kill INT           NOT NULL DEFAULT 0
);

\ir populate.sql

\ir queries.sql