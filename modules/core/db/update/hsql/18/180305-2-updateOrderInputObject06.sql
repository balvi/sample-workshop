alter table WORKSHOP_ORDER_INPUT_OBJECT add constraint FK_WORKSHOP_ORDER_INPUT_OBJECT_PART2 foreign key (PART2_ID) references WORKSHOP_SPARE_PART(ID);
create index IDX_WORKSHOP_ORDER_INPUT_OBJECT_PART2 on WORKSHOP_ORDER_INPUT_OBJECT (PART2_ID);
