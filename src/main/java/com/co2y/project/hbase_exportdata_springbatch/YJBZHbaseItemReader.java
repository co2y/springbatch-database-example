package com.co2y.project.hbase_exportdata_springbatch;

import org.apache.hadoop.hbase.client.HTableInterface;
import org.apache.hadoop.hbase.client.Scan;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;

import com.co2y.project.oracle_exportdata_springbatch.YJBZTable;

public class YJBZHbaseItemReader extends AbstractHbaseCursorItemReader<YJBZTable> {
	int startnum;
	int endnum;



	public YJBZHbaseItemReader() {
		setName(ClassUtils.getShortName(YJBZHbaseItemReader.class));
	}



	@Override
	protected void doOpen() throws Exception {
		// TODO Auto-generated method stub
		super.doOpen();
		Assert.notNull(startnum, "startnum must be specified");
		Assert.notNull(endnum, "endnum must be specified");
		String startstr = "" + startnum;
		int templength = startstr.length();
		for (int i = 0; i < 7 - templength; i++) {
			startstr = "0" + startstr;
		}
		String endstr = "" + endnum;
		templength = endstr.length();
		for (int i = 0; i < 7 - templength; i++) {
			endstr = "0" + endstr;
		}
		Scan scan = new Scan();
		scan.setStartRow(startstr.getBytes());
		scan.setStopRow(endstr.getBytes());

		HTableInterface table = this.connection.getTable("yjbz");
		rs = table.getScanner(scan);
		cursor = rs.iterator();
	}



	public int getStartnum() {
		return startnum;
	}



	public void setStartnum(int startnum) {
		this.startnum = startnum;
	}



	public int getEndnum() {
		return endnum;
	}



	public void setEndnum(int endnum) {
		this.endnum = endnum;
	}


	/*@Override
	protected void readResult() {
		// TODO Auto-generated method stub
		if (cursor.hasNext()){
			next = converter.convert(cursor.next());
		}
		next = null;
	}*/


}
