
insert into APP_USER (firstname, lastname, username, mobile, email, password, refreshed) values 
('admin', 'user', 'admin', '1010101010', 'admin@user.com', 'admin', sysdate),
('khaja', 'm', 'khajam', '1010101020', 'kpasha@deloitte.com', 'test1', sysdate),
('abhi', 'b', 'abhib', '1010101030', 'abhi@deloitte.com', 'test2', sysdate),
('sriram', 'p', 'sriramp', '1010101040', 'srpanigrahi@deloitte.com', 'test3', sysdate);


insert into Visualisaton_Data (data_size, color) values 
(12, '#ff4455'),
(21, '#ea2135'),
(32, '#bc4465'),
(41, '#fa2234'),
(70, '#ff4455');

commit;

select count(*) from app_user;

select count(*) from Visualisaton_Data;
