package com.co2y.project.hbase_exportdata_springbatch;

import org.apache.hadoop.hbase.client.Result;

public interface IHbaseConverter<T> {
	public T convert(Result r);
}
