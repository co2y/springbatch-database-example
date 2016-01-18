package com.co2y.project.mongodb_exportdata_springbatch;


import org.bson.Document;

import com.co2y.project.oracle_exportdata_springbatch.YJBZTable;

public class YJBZConverter implements IMongoConverter<YJBZTable> {

	public YJBZConverter() {
		// TODO Auto-generated constructor stub
	}

	public YJBZTable convert(Document d) {
		// TODO Auto-generated method stub
		YJBZTable yjbz = new YJBZTable();
		yjbz.setHXJYLSH(d.getString("HXJYLSH"));
		yjbz.setZJYLSH(d.getString("ZJYLSH"));
		yjbz.setBCXH(d.getString("BCXH"));
		yjbz.setJYRQ(d.getString("JYRQ"));
		yjbz.setYXJGDM(d.getString("YXJGDM"));
		yjbz.setNBJGH(d.getString("NBJGH"));
		yjbz.setJRXKZH(d.getString("JRXKZH"));
		yjbz.setMXKMBH(d.getString("MXKMBH"));
		yjbz.setJYSJ(d.getString("JYSJ"));
		yjbz.setJZRQ(d.getString("JZRQ"));
		yjbz.setJZSJ(d.getString("JZSJ"));
		yjbz.setJYJGMC(d.getString("JYJGMC"));
		yjbz.setJYZH(d.getString("JYZH"));
		yjbz.setJYHM(d.getString("JYHM"));
		yjbz.setJYXTMC(d.getString("JYXTMC"));
		yjbz.setDFXH(d.getString("DFXH"));
		yjbz.setDFJGMC(d.getString("DFJGMC"));
		yjbz.setDFZH(d.getString("DFZH"));
		yjbz.setDFHM(d.getString("DFHM"));
		yjbz.setJYJE(d.getDouble("JYJE"));
		yjbz.setZHYE(d.getDouble("ZHYE"));
		yjbz.setJDBZ(d.getString("JDBZ"));
		yjbz.setXZBZ(d.getString("XZBZ"));
		yjbz.setBZ(d.getString("BZ"));
		yjbz.setYWLX(d.getString("YWLX"));
		yjbz.setJYLX(d.getString("JYLX"));
		yjbz.setJYQD(d.getString("JYQD"));
		yjbz.setJYJZMC(d.getString("JYJZMC"));
		yjbz.setJYJZH(d.getString("JYJZH"));
		yjbz.setCZGYH(d.getString("CZGYH"));
		yjbz.setGYLSH(d.getString("GYLSH"));
		yjbz.setFHGYH(d.getString("FHGYH"));
		yjbz.setZY(d.getString("ZY"));
		yjbz.setZPZZL(d.getString("ZPZZL"));
		yjbz.setZPZH(d.getString("ZPZH"));
		yjbz.setFPZZL(d.getString("FPZZL"));
		yjbz.setFPZH(d.getString("FPZH"));
		yjbz.setCBMBZ(d.getString("CBMBZ"));
		yjbz.setSJC(d.getString("SJC"));
		yjbz.setZHBZ(d.getString("ZHBZ"));
		yjbz.setKXHBZ(d.getString("KXHBZ"));
		yjbz.setCJRQ(d.getString("CJRQ"));
		yjbz.setNUM(d.getInteger("NUM"));
		return yjbz;
	}

}
