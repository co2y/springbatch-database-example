package com.co2y.project.mongodb_exportdata_springbatch;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.batch.item.support.AbstractItemCountingItemStreamItemReader;
import org.springframework.util.Assert;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;

public abstract class AbstractMongoDBCursorItemReader<T> extends
		AbstractItemCountingItemStreamItemReader<T> {
	protected MongoClient mongo;

	protected String databaseName;

	protected MongoCollection<Document> collection;

	protected String collectionName;

	protected MongoCursor<Document> cursor;

	// the document fields to select
	protected String[] fields;

	protected Document query;

	// protected IMongoConverter<T> converter;

	protected T next;
	
	protected abstract void readCursor();

	public AbstractMongoDBCursorItemReader() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doClose() throws Exception {
		// TODO Auto-generated method stub
		cursor.close();
	}

	@Override
	protected void doOpen() throws Exception {
		// TODO Auto-generated method stub
		Assert.notNull(mongo, "Mongo must be specified");
		Assert.notNull(databaseName, "Mongo AND database must be set");
		Assert.notNull(collectionName, "collectionName must be set");
		MongoDatabase db = mongo.getDatabase(databaseName);
		collection = db.getCollection(collectionName);

		// cursor =
		// collection.find(createQuery()).projection(createProject()).iterator();
	}

	protected Bson createQuery() {
		if (query == null)
			return new Document();
		else
			return query;
	}

	protected Bson createProject() {
		if (fields == null)
			return Projections.fields(Projections.excludeId());
		else
			return Projections.fields(Projections.include(fields),
					Projections.excludeId());
	}

	@Override
	protected T doRead() throws Exception {
		// TODO Auto-generated method stub
		// if (cursor.hasNext())
		// return converter.convert(cursor.next());
		readCursor();
		return this.next;
	}

	public MongoClient getMongo() {
		return mongo;
	}

	public void setMongo(MongoClient mongo) {
		this.mongo = mongo;
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public MongoCollection<Document> getCollection() {
		return collection;
	}

	public void setCollection(MongoCollection<Document> collection) {
		this.collection = collection;
	}

	public String getCollectionName() {
		return collectionName;
	}

	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	public MongoCursor<Document> getCursor() {
		return cursor;
	}

	public void setCursor(MongoCursor<Document> cursor) {
		this.cursor = cursor;
	}

	public String[] getFields() {
		return fields;
	}

	public void setFields(String[] fields) {
		this.fields = fields;
	}

	public Document getQuery() {
		return query;
	}

	public void setQuery(Document query) {
		this.query = query;
	}

}
