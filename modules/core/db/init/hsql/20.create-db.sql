-- begin WORKSHOP_CLIENT
alter table WORKSHOP_CLIENT add constraint FK_WORKSHOP_CLIENT_ORDER foreign key (ORDER_ID) references WORKSHOP_ORDER(ID)^
alter table WORKSHOP_CLIENT add constraint FK_WORKSHOP_CLIENT_ORDER_INPUT_OBJECT foreign key (ORDER_INPUT_OBJECT_ID) references WORKSHOP_ORDER_INPUT_OBJECT(ID)^
create unique index IDX_WORKSHOP_CLIENT_UNIQ_EMAIL on WORKSHOP_CLIENT (EMAIL) ^
create index IDX_WORKSHOP_CLIENT_ORDER on WORKSHOP_CLIENT (ORDER_ID)^
create index IDX_WORKSHOP_CLIENT_ORDER_INPUT_OBJECT on WORKSHOP_CLIENT (ORDER_INPUT_OBJECT_ID)^
-- end WORKSHOP_CLIENT
-- begin WORKSHOP_MECHANIC
alter table WORKSHOP_MECHANIC add constraint FK_WORKSHOP_MECHANIC_USER foreign key (USER_ID) references SEC_USER(ID)^
alter table WORKSHOP_MECHANIC add constraint FK_WORKSHOP_MECHANIC_ORDER foreign key (ORDER_ID) references WORKSHOP_ORDER(ID)^
create index IDX_WORKSHOP_MECHANIC_USER on WORKSHOP_MECHANIC (USER_ID)^
create index IDX_WORKSHOP_MECHANIC_ORDER on WORKSHOP_MECHANIC (ORDER_ID)^
-- end WORKSHOP_MECHANIC
-- begin WORKSHOP_SPARE_PART
create unique index IDX_WORKSHOP_SPARE_PART_UNIQ_TITLE on WORKSHOP_SPARE_PART (TITLE) ^
-- end WORKSHOP_SPARE_PART
-- begin WORKSHOP_ORDER
alter table WORKSHOP_ORDER add constraint FK_WORKSHOP_ORDER_PART1 foreign key (PART1_ID) references WORKSHOP_SPARE_PART(ID)^
alter table WORKSHOP_ORDER add constraint FK_WORKSHOP_ORDER_PART2 foreign key (PART2_ID) references WORKSHOP_SPARE_PART(ID)^
alter table WORKSHOP_ORDER add constraint FK_WORKSHOP_ORDER_PART3 foreign key (PART3_ID) references WORKSHOP_SPARE_PART(ID)^
create index IDX_WORKSHOP_ORDER_PART1 on WORKSHOP_ORDER (PART1_ID)^
create index IDX_WORKSHOP_ORDER_PART2 on WORKSHOP_ORDER (PART2_ID)^
create index IDX_WORKSHOP_ORDER_PART3 on WORKSHOP_ORDER (PART3_ID)^
-- end WORKSHOP_ORDER
-- begin WORKSHOP_ORDER_INPUT_OBJECT_MECHANIC_LINK
alter table WORKSHOP_ORDER_INPUT_OBJECT_MECHANIC_LINK add constraint FK_ORDINPOBJMEC_ORDER_INPUT_OBJECT foreign key (ORDER_INPUT_OBJECT_ID) references WORKSHOP_ORDER_INPUT_OBJECT(ID)^
alter table WORKSHOP_ORDER_INPUT_OBJECT_MECHANIC_LINK add constraint FK_ORDINPOBJMEC_MECHANIC foreign key (MECHANIC_ID) references WORKSHOP_MECHANIC(ID)^
-- end WORKSHOP_ORDER_INPUT_OBJECT_MECHANIC_LINK
-- begin WORKSHOP_INVOICE
alter table WORKSHOP_INVOICE add constraint FK_WORKSHOP_INVOICE_CLIENT foreign key (CLIENT_ID) references WORKSHOP_CLIENT(ID)^
alter table WORKSHOP_INVOICE add constraint FK_WORKSHOP_INVOICE_ORDER foreign key (ORDER_ID) references WORKSHOP_ORDER(ID)^
create index IDX_WORKSHOP_INVOICE_CLIENT on WORKSHOP_INVOICE (CLIENT_ID)^
create index IDX_WORKSHOP_INVOICE_ORDER on WORKSHOP_INVOICE (ORDER_ID)^
-- end WORKSHOP_INVOICE
-- begin WORKSHOP_ORDER_INPUT_OBJECT
alter table WORKSHOP_ORDER_INPUT_OBJECT add constraint FK_WORKSHOP_ORDER_INPUT_OBJECT_INVOICE_RECIPIENT foreign key (INVOICE_RECIPIENT_ID) references WORKSHOP_CLIENT(ID)^
alter table WORKSHOP_ORDER_INPUT_OBJECT add constraint FK_WORKSHOP_ORDER_INPUT_OBJECT_PART1 foreign key (PART1_ID) references WORKSHOP_SPARE_PART(ID)^
alter table WORKSHOP_ORDER_INPUT_OBJECT add constraint FK_WORKSHOP_ORDER_INPUT_OBJECT_PART2 foreign key (PART2_ID) references WORKSHOP_SPARE_PART(ID)^
alter table WORKSHOP_ORDER_INPUT_OBJECT add constraint FK_WORKSHOP_ORDER_INPUT_OBJECT_PART3 foreign key (PART3_ID) references WORKSHOP_SPARE_PART(ID)^
create index IDX_WORKSHOP_ORDER_INPUT_OBJECT_INVOICE_RECIPIENT on WORKSHOP_ORDER_INPUT_OBJECT (INVOICE_RECIPIENT_ID)^
create index IDX_WORKSHOP_ORDER_INPUT_OBJECT_PART1 on WORKSHOP_ORDER_INPUT_OBJECT (PART1_ID)^
create index IDX_WORKSHOP_ORDER_INPUT_OBJECT_PART2 on WORKSHOP_ORDER_INPUT_OBJECT (PART2_ID)^
create index IDX_WORKSHOP_ORDER_INPUT_OBJECT_PART3 on WORKSHOP_ORDER_INPUT_OBJECT (PART3_ID)^
-- end WORKSHOP_ORDER_INPUT_OBJECT
