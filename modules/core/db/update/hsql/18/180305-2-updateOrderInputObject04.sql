alter table WORKSHOP_ORDER_INPUT_OBJECT alter column PART3_PRICE rename to PART3_PRICE__UNUSED ;
alter table WORKSHOP_ORDER_INPUT_OBJECT alter column PART3_DESCRIPTION rename to PART3_DESCRIPTION__UNUSED ;
alter table WORKSHOP_ORDER_INPUT_OBJECT alter column PART3_TITLE rename to PART3_TITLE__UNUSED ;
alter table WORKSHOP_ORDER_INPUT_OBJECT alter column PART2_PRICE rename to PART2_PRICE__UNUSED ;
alter table WORKSHOP_ORDER_INPUT_OBJECT alter column PART2_DESCRIPTION rename to PART2_DESCRIPTION__UNUSED ;
alter table WORKSHOP_ORDER_INPUT_OBJECT alter column PART2_TITLE rename to PART2_TITLE__UNUSED ;
alter table WORKSHOP_ORDER_INPUT_OBJECT alter column PART1_PRICE rename to PART1_PRICE__UNUSED ;
alter table WORKSHOP_ORDER_INPUT_OBJECT alter column PART1_DESCRIPTION rename to PART1_DESCRIPTION__UNUSED ;
alter table WORKSHOP_ORDER_INPUT_OBJECT alter column PART1_TITLE rename to PART1_TITLE__UNUSED ;
alter table WORKSHOP_ORDER_INPUT_OBJECT add column PART1_ID varchar(36) ;
alter table WORKSHOP_ORDER_INPUT_OBJECT add column PART2_ID varchar(36) ;
alter table WORKSHOP_ORDER_INPUT_OBJECT add column PART3_ID varchar(36) ;
