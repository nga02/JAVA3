USE FINALASS_FPOLY_NET_JAVA_SM22_BL2
GO

SELECT b.Ma AS 'MaBan',
	   b.Ten AS 'TenBan',NgaySinh,GioiTinh,
	   m.Ma AS 'MaQH',m.Ten AS 'TenMqh' FROM Ban b
	   JOIN MoiQuanHe m ON b.Id=m.Id
