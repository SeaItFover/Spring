create table account
(
	id int auto_increment,
	name varchar(40) null,
	money float null,
	constraint account_pk
		primary key (id)
);
