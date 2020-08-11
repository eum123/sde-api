drop table category if exists;

create table category (category_no integer not null, category_name varchar(255), parent_no integer, depth integer not null, primary key (category_no));