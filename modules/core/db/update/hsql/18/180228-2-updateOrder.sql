alter table WORKSHOP_ORDER alter column PART_ID rename to PART_ID__UNUSED ;
drop index IDX_WORKSHOP_ORDER_PART ;
alter table WORKSHOP_ORDER drop constraint FK_WORKSHOP_ORDER_PART ;
alter table WORKSHOP_ORDER add column PART1_ID varchar(36) ;
alter table WORKSHOP_ORDER add column PART2_ID varchar(36) ;
alter table WORKSHOP_ORDER add column PART3_ID varchar(36) ;
