create table zip_code (id  bigserial not null, city varchar(255), dst int4, latitude varchar(255), longitude varchar(255), state varchar(255), timezone varchar(255), zip varchar(255), primary key (id));

COPY zip_code( zip,city,state,  latitude, longitude,  timezone,dst ) 
FROM 'D:\ZipCodes.csv' DELIMITER ',' CSV HEADER;
