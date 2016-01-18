package com.co2y.project.mongodb_exportdata_springbatch;
import org.bson.Document;


public interface IMongoConverter<T> {
	public T convert(Document d);
}
