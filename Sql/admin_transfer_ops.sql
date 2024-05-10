create table if not exists admin_transfer_ops(
transfer_ops_code bigint not null,
routinetransfer_ops varchar(255) null,
remarks varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint admin_transfer_ops_pk primary key(transfer_ops_code));