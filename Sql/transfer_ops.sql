create table if not exists transfer_ops(
transfer_ops_code bigint not null,
transfer_ops_name varchar(255) null,
transfer_ops_desc varchar(255) null,
remarks varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint transfer_ops_pk primary key(transfer_ops_code));