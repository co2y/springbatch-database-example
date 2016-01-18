package com.co2y.project.mongodb_exportdata_springbatch;


import org.bson.Document;
import org.springframework.util.ClassUtils;

import com.co2y.project.oracle_exportdata_springbatch.YJBZTable;



public class YJBZItemReader extends AbstractMongoDBCursorItemReader<YJBZTable> {
	protected YJBZConverter converter;
	protected int fromId;
	protected int toId;
	
	
	
	
	public YJBZItemReader() {
		setName(ClassUtils.getShortName(YJBZItemReader.class));
	}


	@Override
	protected void doOpen() throws Exception {
		// TODO Auto-generated method stub
		super.doOpen();
	    query = new Document();
	    query.put("NUM", new Document("$gte", fromId).append("$lt", toId));
	    cursor = collection.find(query).projection(createProject()).iterator();
	}



	protected void readCursor() {
		// TODO Auto-generated method stub
		if (cursor.hasNext())
			next = converter.convert(cursor.next());
		else
			next = null;
	}
	

	public YJBZConverter getConverter() {
		return converter;
	}


	public void setConverter(YJBZConverter converter) {
		this.converter = converter;
	}


	public int getFromId() {
		return fromId;
	}


	public void setFromId(int fromId) {
		this.fromId = fromId;
	}


	public int getToId() {
		return toId;
	}


	public void setToId(int toId) {
		this.toId = toId;
	}
	
	

}
