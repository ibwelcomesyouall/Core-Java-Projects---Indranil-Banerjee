use Indranil

create table Feedmaster (feed_id int,feed_name varchar(100),feed_path varchar(500),feed_SLA varchar(8))

select * from Feedmaster

delete from Feedmaster


insert into Feedmaster values(1,'GMIRATES','/home/u525202','400 AM')
insert into Feedmaster values(2,'RX430.TXT','/home/u525202','5:00 AM')
insert into Feedmaster values(3,'IR360_PCO.xml','/home/u525202','10:00 AM')
insert into Feedmaster values(8,'FRS98_DDMMYYYY.txt','\\wvs-jira\jd\jd\ku\lk','12:00 AM')

create table BusinessMaster	(BusinessUnit_ID int, BusinessUnit_Name varchar(100),BusinessUnit_SLA varchar(8))
create table SLAMaster (Function_ID int,Function_name varchar(100),Function_SLA varchar(8))
create table Configsetup(config_ID int,BusinessUnit_ID int,Function_ID int,feed_id int)
create table Table_check (chk_ID int, connection varchar(100),credential varchar(100),sql varchar(1000))
create table Feed_check (chk_ID int, connection varchar(100),credential varchar(100),feed_ID int)
create table process_check(chk_ID int, connection varchar(100),credential varchar(100),processname varchar(50),OperatingSystem varchar(10))
create table Log_check (chk_ID int, connection varchar(100),credential varchar(100),file_ID int, search_string varchar(1000),Is_string_date char,search_date_string varchar(20),Date_format varchar(20),output_String_or_line varchar(500),Output_pattern varchar(500))
create table Prg_config (Prg_ID int, Config_ID int, checkType varchar(50),chk_ID int, Status varchar(10),Isactive char)
create table Transaction_table (Unique_ID int, DateField date, Config_ID int, output_start varchar(50),output_End varchar(50),IS_SLA_MET varchar(20), Delayed_for varchar(50))

select * from Feedmaster
select * from BusinessMaster

create table Colline_Batch_Monitoring (Monitoring_Date varchar(11), Monitoring_Name varchar(100), Monitoring_Strategy varchar(1000), Monitoring_Result varchar(1000), Monitoring_Status varchar(10))
drop table Colline_Batch_Monitoring


select * from Colline_Batch_Monitoring

-- Monitoring Strategy ::::  Table Name%ID -- Table Name can be replaced with some identifier like FEED,PROCESS,LOG
-- Combination Monitoring Strategy ::::  Table Name%ID+Table Name%ID
insert into Colline_Batch_Monitoring values('04-Mar-2018','ABC::Related Feed Check','FEED:3','','Not Done')
insert into Colline_Batch_Monitoring values('04-Mar-2018','DEF::Related Feed Check and Log String check','FEED:8+LOG:4','','Not Done')
insert into Colline_Batch_Monitoring values('04-Mar-2018','GJJ::Related Feed Check and Process check','FEED:1+PROCESS:4','','Not Done')
insert into Colline_Batch_Monitoring values('04-Mar-2018','XYZ::Related Log String Check','LOG:4','','Not Done')
insert into Colline_Batch_Monitoring values('04-Mar-2018','DEF::Related Log String check and Process check','LOG:4+PROCESS:3','','Not Done')
insert into Colline_Batch_Monitoring values('04-Mar-2018','DEF::Related Process Check','PROCESS:2','','Not Done')
insert into Colline_Batch_Monitoring values('04-Mar-2018','DEF::Related Process Check and Log String check and Feed Check','PROCESS:9+LOG:4+FEED:2','','Not Done')

delete from Colline_Batch_Monitoring

select * from Colline_Batch_Monitoring where Monitoring_Date='04-Mar-2018' and Monitoring_Status='Not Done'

create table Feedmaster_Indranil (feed_id int,feed_name varchar(100),feed_path varchar(500),feed_SLA varchar(8),server_name varchar(50),username varchar(10),pass varchar(10))

select * from Feedmaster_Indranil

update Colline_Batch_Monitoring set Monitoring_Status='Not Done'
update Colline_Batch_Monitoring set Monitoring_Result=''




delete from Feedmaster_Indranil

insert into Feedmaster_Indranil values(1,'GMIRATES','/home/u525202','400 AM','isgruapp7n1.wellsfargo.com','u525202','Balon@123')
insert into Feedmaster_Indranil values(2,'RX430.TXT','/home/u525202','5:00 AM','isgruapp7n1.wellsfargo.com','u525202','Balon@123')
insert into Feedmaster_Indranil values(3,'IR360_PCO.xml','/home/u525202','10:00 AM','isgruapp7n1.wellsfargo.com','u525202','Balon@123')
insert into Feedmaster_Indranil values(8,'FRS98_DDMMYYYY.txt','\\wvs-jira\jd\jd\ku\lk','12:00 AM','isgruapp7n1.wellsfargo.com','u525202','Balon@123')

select * from Feedmaster_Indranil where feed_id=1