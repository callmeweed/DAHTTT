use quizztestdb;

create table user (
	user_id int not null auto_increment,
    name varchar(50) not null,
    gender varchar(2) not null,
    date_of_birth datetime not null,
    role varchar(50),
    phone_number varchar(20) not null unique,
    email varchar(50) not null unique,
    address varchar(100),
    username varchar(50) not null unique,
    password varchar(256) not null,
    created_at datetime not null,
    updated_at datetime,
    constraint pk_user primary key (user_id)
);

create table exam (
	exam_id int not null auto_increment,
    exam_name varchar(256) not null,
    exam_type varchar(20) not null,
    user_id_created int not null,
    constraint pk_exam primary key (exam_id),
    constraint fk_user foreign key (user_created) references user(user_id)
);

create table question (
	question_id int not null auto_increment,
    exam_id int,
    question_number int,
    content longtext,
    data_type varchar(20),
    true_answer int,
    constraint pk_question primary key (question_id),
    constraint fk_exam_question foreign key (exam_id) references exam(exam_id)
);

create table answer (
	answer_id int not null auto_increment,
	question_id int,
    answernumber int,
    content longtext,
    constraint pk_answer primary key (answer_id),
    constraint fk_answer_question foreign key (question_id) references question(question_id)
);

show tables;