alter table WORKSHOP_ORDER alter column MECHANIC_ID rename to MECHANIC_ID__UNUSED ;
alter table WORKSHOP_ORDER alter column MECHANIC_ID__UNUSED set null ;
drop index IDX_WORKSHOP_ORDER_MECHANIC ;
alter table WORKSHOP_ORDER drop constraint FK_WORKSHOP_ORDER_MECHANIC_ID ;
alter table WORKSHOP_ORDER alter column CLIENT_ID rename to CLIENT_ID__UNUSED ;
alter table WORKSHOP_ORDER alter column CLIENT_ID__UNUSED set null ;
drop index IDX_WORKSHOP_ORDER_CLIENT ;
alter table WORKSHOP_ORDER drop constraint FK_WORKSHOP_ORDER_CLIENT_ID ;
alter table WORKSHOP_ORDER add column PART_ID varchar(36) ;
