alter table WORKSHOP_ORDER add constraint FK_WORKSHOP_ORDER_PART foreign key (PART_ID) references WORKSHOP_SPARE_PART(ID);
create index IDX_WORKSHOP_ORDER_PART on WORKSHOP_ORDER (PART_ID);
