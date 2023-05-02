-- table for carriages info
create table carriages
(
    id            serial,
    number        varchar,
    type          varchar,
    tare_weight   float,
    load_capacity float
);

create unique index carriages_id_uindex
    on carriages (id);

alter table carriages
    add constraint carriages_pk
        primary key (id);

--table for cargo type codes and descriptions
create table cargo_types
(
    id          serial,
    code        varchar,
    description varchar
);

create unique index cargo_types_id_uindex
    on cargo_types (id);

alter table cargo_types
    add constraint cargo_types_pk
        primary key (id);

--stations
create table stations
(
    id   serial,
    name varchar
);

create unique index stations_id_uindex
    on stations (id);

alter table stations
    add constraint stations_pk
        primary key (id);

--station runways
create table station_runways
(
    id          serial,
    station_id  int,
    runway_id   int,
    description varchar
);

create unique index station_runways_id_uindex
    on station_runways (id);

alter table station_runways
    add constraint station_runways_pk
        primary key (id);

-- train
create table train_formation
(
    id          serial,
    description varchar
);

create unique index train_formation_id_uindex
    on train_formation (id);

alter table train_formation
    add constraint train_formation_pk
        primary key (id);

-- train car
create table train_car
(
    id           serial,
    train_id     int,
    car_id       int,
    cargo_type   int,
    cargo_weight float
);

create unique index train_car_id_uindex
    on train_car (id);

alter table train_car
    add constraint train_car_pk
        primary key (id);

