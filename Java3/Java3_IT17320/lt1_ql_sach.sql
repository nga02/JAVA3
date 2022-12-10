USE master;
GO

DROP DATABASE IF EXISTS ql_sach_lt1;
GO

CREATE DATABASE ql_sach_lt1;
GO

USE ql_sach_lt1;
GO

CREATE TABLE tac_gia (
    id INT IDENTITY PRIMARY KEY,
    ten NVARCHAR (255) NOT NULL,
    sdt NVARCHAR(255) NOT NULL,
    email NVARCHAR(255) NOT NULL
);

GO

CREATE TABLE sach (
    id INT IDENTITY PRIMARY KEY,
    ten NVARCHAR (255) NOT NULL,
    so_luong INT NOT NULL DEFAULT 0,
    don_gia FLOAT NOT NULL DEFAULT 0,
    tac_gia_id INT NOT NULL
);

GO

INSERT INTO tac_gia (ten, sdt, email) VALUES
('DungNA29', '0123456789', 'dungna29@fpt.edu.vn'),
('MinhDQ8', '0987654321', 'minhdq8@fpt.edu.vn');
GO

INSERT INTO sach(ten, so_luong, don_gia, tac_gia_id) VALUES
('Lap trinh Java 1', 100, 99000, 1),
('Quan tri CSDL voi SQL Server', 95, 199000, 1),
('Quan ly du an với phan mem Agile', 100, 250000, 2);

GO
