create table if not exists non_admin_transfer_ops(
transfer_ops_code bigint not null,
transfer_ops_region varchar(255) null,
transfer_ops_level varchar(255) null,
remarks varchar(255) null,
contact varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint non_admin_transfer_ops_pk primary key(transfer_ops_code));