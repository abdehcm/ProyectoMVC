DROP DATABASE IF EXISTS abdemotor;
CREATE DATABASE IF NOT EXISTS abdemotor;
USE abdemotor;

CREATE TABLE coche (
    id  INT AUTO_INCREMENT PRIMARY KEY,
    tipoVehiculo VARCHAR(50),
    marca VARCHAR(50),
    color VARCHAR(50)
);
/*USE abdemotor;
Select *
fROM coche;

DELETE FROM coche
WHERE marca = 'Lamborghini';

DELETE FROM coche;*/



INSERT INTO coche (tipoVehiculo, marca, color) VALUES 
    ('SUV', 'Mercedes', 'Gris metalizado'),
    ('SUV', 'Mercedes', 'Blanco'),
    ('SUV', 'Mercedes', 'Negro'),
    ('SUV', 'Mercedes', 'Rojo'),
    ('SUV', 'Audi', 'Gris metalizado'),
    ('SUV', 'Audi', 'Blanco'),
    ('SUV', 'Audi', 'Negro'),
    ('SUV', 'Audi', 'Plata'),
    ('SUV', 'Lamborghini', 'Gris metalizado'),
    ('SUV', 'Lamborghini', 'Blanco'),
    ('SUV', 'Ferrari', 'Rojo'),
    ('Sedán', 'Mercedes', 'Gris metalizado'),
    ('Sedán', 'Mercedes', 'Blanco'),
    ('Sedán', 'Mercedes', 'Negro'),
    ('Sedán', 'Audi', 'Rojo'),
    ('Sedán', 'Audi', 'Plata'),
    ('Sedán', 'Audi', 'Gris metalizado'),
    ('Sedán', 'Lamborghini', 'Rojo'),
    ('Sedán', 'Ferrari', 'Blanco'),
    ('Deportivo', 'Lamborghini', 'Negro'),
    ('Deportivo', 'Lamborghini', 'Rojo'),
    ('Deportivo', 'Ferrari', 'Blanco'),
    ('Deportivo', 'Ferrari', 'Gris metalizado');
    