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
);
