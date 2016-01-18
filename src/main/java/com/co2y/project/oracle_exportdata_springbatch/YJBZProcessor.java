package com.co2y.project.oracle_exportdata_springbatch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("itemProcessor")
@Scope(value = "step")
public class YJBZProcessor implements ItemProcessor<YJBZTable, YJBZTable> {

	@Value("#{stepExecutionContext[name]}")
	private String threadName;


	public YJBZTable process(YJBZTable item) throws Exception {

		return item;
	}

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

}
