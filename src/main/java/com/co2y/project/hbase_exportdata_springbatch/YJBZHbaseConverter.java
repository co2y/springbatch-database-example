package com.co2y.project.hbase_exportdata_springbatch;

import org.apache.hadoop.hbase.client.Result;

import com.co2y.project.oracle_exportdata_springbatch.YJBZTable;

public class YJBZHbaseConverter implements IHbaseConverter<YJBZTable> {

	public YJBZHbaseConverter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public YJBZTable convert(Result r) {
		// TODO Auto-generated method stub
		YJBZTable yjbz = new YJBZTable();
		byte[] bCF = "cf".getBytes();
		byte[] bytes;
		bytes= r.getValue(bCF,"HXJYLSH".getBytes());
		yjbz.setHXJYLSH(bytes==null?null:bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"ZJYLSH".getBytes());
		yjbz.setZJYLSH(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"BCXH".getBytes());
		yjbz.setBCXH(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"JYRQ".getBytes());
		yjbz.setJYRQ(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"YXJGDM".getBytes());
		yjbz.setYXJGDM(bytes==null?null:new String(bytes));	
		bytes= r.getValue(bCF,"NBJGH".getBytes());
		yjbz.setNBJGH(bytes==null?null:new String(bytes));	
		bytes= r.getValue(bCF,"JRXKZH".getBytes());
		yjbz.setJRXKZH(bytes==null?null:new String(bytes));	
		bytes= r.getValue(bCF,"MXKMBH".getBytes());
		yjbz.setMXKMBH(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"JYSJ".getBytes());
		yjbz.setJYSJ(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"JZRQ".getBytes());
		yjbz.setJZRQ(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"JZSJ".getBytes());
		yjbz.setJZSJ(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"JYJGMC".getBytes());
		yjbz.setJYJGMC(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"JYZH".getBytes());
		yjbz.setJYZH(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"JYHM".getBytes());
		yjbz.setJYHM(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"JYXTMC".getBytes());
		yjbz.setJYXTMC(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"DFXH".getBytes());
		yjbz.setDFXH(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"DFJGMC".getBytes());
		yjbz.setDFJGMC(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"DFZH".getBytes());
		yjbz.setDFZH(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"DFHM".getBytes());
		yjbz.setDFHM(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"JYJE".getBytes());
		yjbz.setJYJE(bytes==null?null:Double.parseDouble(new String(bytes)));
		bytes= r.getValue(bCF,"ZHYE".getBytes());
		yjbz.setZHYE(bytes==null?null:Double.parseDouble(new String(bytes)));
		bytes= r.getValue(bCF,"JDBZ".getBytes());
		yjbz.setJDBZ(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"XZBZ".getBytes());
		yjbz.setXZBZ(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"BZ".getBytes());
		yjbz.setBZ(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"YWLX".getBytes());
		yjbz.setYWLX(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"JYLX".getBytes());
		yjbz.setJYLX(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"JYQD".getBytes());
		yjbz.setJYQD(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"JYJZMC".getBytes());
		yjbz.setJYJZMC(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"JYJZH".getBytes());
		yjbz.setJYJZH(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"CZGYH".getBytes());
		yjbz.setCZGYH(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"GYLSH".getBytes());
		yjbz.setGYLSH(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"FHGYH".getBytes());
		yjbz.setFHGYH(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"ZY".getBytes());
		yjbz.setZY(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"ZPZZL".getBytes());
		yjbz.setZPZZL(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"ZPZH".getBytes());
		yjbz.setZPZH(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"FPZZL".getBytes());
		yjbz.setFPZZL(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"FPZH".getBytes());
		yjbz.setFPZH(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"CBMBZ".getBytes());
		yjbz.setCBMBZ(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"SJC".getBytes());
		yjbz.setSJC(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"ZHBZ".getBytes());
		yjbz.setZHBZ(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"KXHBZ".getBytes());
		yjbz.setKXHBZ(bytes==null?null:new String(bytes));
		bytes= r.getValue(bCF,"CJRQ".getBytes());
		yjbz.setCJRQ(bytes==null?null:new String(bytes));

		return yjbz;
	}

}
