package com.co2y.project.oracle_exportdata_springbatch;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class YJBZRowMapper implements RowMapper<YJBZTable> {

	
	public YJBZTable mapRow(ResultSet rs, int rowNum) throws SQLException {

		YJBZTable yjbz = new YJBZTable();
		yjbz.setHXJYLSH(rs.getString("HXJYLSH"));
		yjbz.setZJYLSH(rs.getString("ZJYLSH"));
		yjbz.setBCXH(rs.getString("BCXH"));
		yjbz.setJYRQ(rs.getString("JYRQ"));
		yjbz.setYXJGDM(rs.getString("YXJGDM"));
		yjbz.setNBJGH(rs.getString("NBJGH"));
		yjbz.setJRXKZH(rs.getString("JRXKZH"));
		yjbz.setMXKMBH(rs.getString("MXKMBH"));
		yjbz.setJYSJ(rs.getString("JYSJ"));
		yjbz.setJZRQ(rs.getString("JZRQ"));
		yjbz.setJZSJ(rs.getString("JZSJ"));
		yjbz.setJYJGMC(rs.getString("JYJGMC"));
		yjbz.setJYZH(rs.getString("JYZH"));
		yjbz.setJYHM(rs.getString("JYHM"));
		yjbz.setJYXTMC(rs.getString("JYXTMC"));
		yjbz.setDFXH(rs.getString("DFXH"));
		yjbz.setDFJGMC(rs.getString("DFJGMC"));
		yjbz.setDFZH(rs.getString("DFZH"));
		yjbz.setDFHM(rs.getString("DFHM"));
		yjbz.setJYJE(rs.getDouble("JYJE"));
		yjbz.setZHYE(rs.getDouble("ZHYE"));
		yjbz.setJDBZ(rs.getString("JDBZ"));
		yjbz.setXZBZ(rs.getString("XZBZ"));
		yjbz.setBZ(rs.getString("BZ"));
		yjbz.setYWLX(rs.getString("YWLX"));
		yjbz.setJYLX(rs.getString("JYLX"));
		yjbz.setJYQD(rs.getString("JYQD"));
		yjbz.setJYJZMC(rs.getString("JYJZMC"));
		yjbz.setJYJZH(rs.getString("JYJZH"));
		yjbz.setCZGYH(rs.getString("CZGYH"));
		yjbz.setGYLSH(rs.getString("GYLSH"));
		yjbz.setFHGYH(rs.getString("FHGYH"));
		yjbz.setZY(rs.getString("ZY"));
		yjbz.setZPZZL(rs.getString("ZPZZL"));
		yjbz.setZPZH(rs.getString("ZPZH"));
		yjbz.setFPZZL(rs.getString("FPZZL"));
		yjbz.setFPZH(rs.getString("FPZH"));
		yjbz.setCBMBZ(rs.getString("CBMBZ"));
		yjbz.setSJC(rs.getString("SJC"));
		yjbz.setZHBZ(rs.getString("ZHBZ"));
		yjbz.setKXHBZ(rs.getString("KXHBZ"));
		yjbz.setCJRQ(rs.getString("CJRQ"));
		yjbz.setNUM(rs.getInt("NUM"));
		return yjbz;
	}

}