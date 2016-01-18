package com.co2y.project.hbase_exportdata_springbatch;

import java.util.Iterator;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HConnection;
import org.apache.hadoop.hbase.client.HConnectionManager;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.springframework.batch.item.support.AbstractItemCountingItemStreamItemReader;
import org.springframework.util.Assert;

public abstract class AbstractHbaseCursorItemReader<T> extends AbstractItemCountingItemStreamItemReader<T> {
	protected Configuration configuration;
	protected String rootdir;
	protected String master;
	protected String quorum;
	protected HConnection connection;
	protected Scan scan;
	protected ResultScanner rs;
	protected Iterator<Result> cursor;
	//T next;
	protected IHbaseConverter<T> converter;

	public AbstractHbaseCursorItemReader() {
		// TODO Auto-generated constructor stub
	}
	
	//protected abstract void readResult();

	@Override
	protected T doRead() throws Exception {
		// TODO Auto-generated method stub
		if (cursor.hasNext()){
			return converter.convert(cursor.next());
		}
		return null;
	}

	@Override
	protected void doOpen() throws Exception {
		// TODO Auto-generated method stub
		Assert.notNull(rootdir, "rootdir must be specified");
		Assert.notNull(master, "master AND database must be set");
		Assert.notNull(quorum, "quorum must be set");
		Assert.notNull(converter, "converter must be set");
		configuration = HBaseConfiguration.create();
		configuration.set("hbase.rootdir", rootdir);
		configuration.set("hbase.cluster.distributed", "true");
		configuration.set("hbase.master", master);
		configuration.set("hbase.zookeeper.quorum", quorum);
		connection = HConnectionManager
				.createConnection(configuration);
	}

	@Override
	protected void doClose() throws Exception {
		// TODO Auto-generated method stub
		
	}

	public String getRootdir() {
		return rootdir;
	}

	public void setRootdir(String rootdir) {
		this.rootdir = rootdir;
	}

	public String getMaster() {
		return master;
	}

	public void setMaster(String master) {
		this.master = master;
	}

	public String getQuorum() {
		return quorum;
	}

	public void setQuorum(String quorum) {
		this.quorum = quorum;
	}

	public IHbaseConverter<T> getConverter() {
		return converter;
	}

	public void setConverter(IHbaseConverter<T> converter) {
		this.converter = converter;
	}
	
	

}
