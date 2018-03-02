-- begin WORKSHOP_CLIENT
create table WORKSHOP_CLIENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    PHONE_NUMBER varchar(50) not null,
    EMAIL varchar(20) not null,
    ORDER_ID varchar(36),
    ORDER_INPUT_OBJECT_ID varchar(36),
    --
    primary key (ID)
)^
-- end WORKSHOP_CLIENT
-- begin WORKSHOP_MECHANIC
create table WORKSHOP_MECHANIC (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USER_ID varchar(36) not null,
    HOURLY_RATE decimal(19, 2) not null,
    ORDER_ID varchar(36),
    --
    primary key (ID)
)^
-- end WORKSHOP_MECHANIC
-- begin WORKSHOP_SPARE_PART
create table WORKSHOP_SPARE_PART (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer not null,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE varchar(255) not null,
    DESCRIPTION longvarchar,
    PRICE decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end WORKSHOP_SPARE_PART
-- begin WORKSHOP_ORDER
create table WORKSHOP_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DESCRIPTION longvarchar,
    HOURS_SPENT integer,
    AMOUNT decimal(19, 2),
    PART1_ID varchar(36),
    PART2_ID varchar(36),
    PART3_ID varchar(36),
    STATUS integer,
    --
    primary key (ID)
)^
-- end WORKSHOP_ORDER
-- begin WORKSHOP_ORDER_INPUT_OBJECT
create table WORKSHOP_ORDER_INPUT_OBJECT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DESCRIPTION varchar(255),
    INVOICE_RECIPIENT_ID varchar(36),
    INVOICE_TOTAL double precision,
    INVOICE_BILLER varchar(255),
    MECHANICS_COUNT integer,
    CLIENT_COUNTS integer,
    HOURS_SPENT integer,
    AMOUNT decimal(19, 2),
    PART1_TITLE varchar(255),
    PART1_DESCRIPTION varchar(255),
    PART1_PRICE varchar(255),
    PART2_TITLE varchar(255),
    PART2_DESCRIPTION varchar(255),
    PART2_PRICE varchar(255),
    PART3_TITLE varchar(255),
    PART3_DESCRIPTION varchar(255),
    PART3_PRICE varchar(255),
    STATUS integer,
    --
    primary key (ID)
)^
-- end WORKSHOP_ORDER_INPUT_OBJECT
-- begin WORKSHOP_ORDER_INPUT_OBJECT_MECHANIC_LINK
create table WORKSHOP_ORDER_INPUT_OBJECT_MECHANIC_LINK (
    ORDER_INPUT_OBJECT_ID varchar(36) not null,
    MECHANIC_ID varchar(36) not null,
    primary key (ORDER_INPUT_OBJECT_ID, MECHANIC_ID)
)^
-- end WORKSHOP_ORDER_INPUT_OBJECT_MECHANIC_LINK
-- begin WORKSHOP_INVOICE
create table WORKSHOP_INVOICE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TOTAL double precision,
    CLIENT_ID varchar(36),
    ORDER_ID varchar(36),
    RECIPIENT varchar(255),
    BILLER varchar(255),
    --
    primary key (ID)
)^
-- end WORKSHOP_INVOICE
