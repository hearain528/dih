package org.apache.solr.handler.dataimport.scheduler;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Timer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 重做索引的任务
 * @author zhangliang
 *
 */
public class FullImportHTTPPostScheduler extends BaseTimerTask {

	private static final Logger logger = LoggerFactory
			.getLogger(FullImportHTTPPostScheduler.class);

	public FullImportHTTPPostScheduler(String webAppName, Timer t)
			throws Exception {
		super(webAppName, t);
		logger.info("<index update process> FullImportHTTPPostScheduler init");
	}

	public void run() {
		sync_run("full", full_syncCores);
	}
}