Create database QLPB
go

use QLPB
go

create table PHONGBAN
(
	ID uniqueidentifier ,
	TenPB nvarchar(50) 	
	primary key(ID)	
)

go

create table NHANVIEN
(
	ID uniqueidentifier,
	MaNV nvarchar(10),
	HoTen nvarchar(40),
	gioiTinh bit,
	IDPB uniqueidentifier,	
	CMND nvarchar(15),
	DienThoai nvarchar(13),
	email nvarchar(30),	
	luong money ,
	queQuan nvarchar(50),
	chuyenMon nvarchar(50),
	TrinhDo nvarchar(50)
	primary key(ID),
	foreign key(IDPB) references PHONGBAN(ID),

)
go

--1. Van Phong
insert into PHONGBAN (ID, TenPB)
values (N'de5a941e-95ee-4361-89f1-b545d2199979',N'Hành chính ')
insert into PHONGBAN (ID, TenPB)
values (N'de5a941e-95ee-4361-89f1-b545d2199980',N'Đào tạo')
insert into PHONGBAN (ID, TenPB)
values (N'de5a941e-95ee-4361-89f1-b545d2199981',N'Công tác sinh viên')
go
--2. NHANVIEN
insert into NhanVien(ID,MaNV,HoTen,GioiTinh,IDPB,CMND,DienThoai,email,luong,queQuan, chuyenMon, TrinhDo)
values(NEWID(),'NV001',N'Lê Xuân Lý',1,N'de5a941e-95ee-4361-89f1-b545d2199979','017428788','0978678765','Dat@gmail.com',1000,N'Hà Nội',N'Điện, nước',N'Đại học');
insert into NhanVien(ID,MaNV,HoTen,GioiTinh,IDPB,CMND,DienThoai,email,luong,queQuan, chuyenMon, TrinhDo)
values(NEWID(),'NV002',N'Trần Thanh Hà',0,N'de5a941e-95ee-4361-89f1-b545d2199979','013328788','0933678765','Ha@gmail.com',1500,N'Bắc Giang',N'Khảo Thí',N'Đại học');
insert into NhanVien(ID,MaNV,HoTen,GioiTinh,IDPB,CMND,DienThoai,email,luong,queQuan, chuyenMon, TrinhDo)
values(NEWID(),'NV003',N'Lê Minh Đăng',1,N'de5a941e-95ee-4361-89f1-b545d2199981','013328777','0983678768','Dang@gmail.com',1000,N'Bắc Giang',N'Đào tạo',N'Thạc Sỹ');
insert into NhanVien(ID,MaNV,HoTen,GioiTinh,IDPB,CMND,DienThoai,email,luong,queQuan, chuyenMon, TrinhDo)
values(NEWID(),'NV004',N'Lê Minh Trí',1,N'de5a941e-95ee-4361-89f1-b545d2199981','017428766','0978678722','Tri@gmail.com',1200,N'Nam Định',N'Dịch vụ',N'Đại học');

select * from PHONGBAN
select * from NHANVIEN