package org.apache.solr.handler.dataimport.scheduler;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Timer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 增量更新索引的任务
 * @author zhangliang
 *
 */
public class DeltaImportHTTPPostScheduler extends BaseTimerTask {

	private static final Logger logger = LoggerFactory
			.getLogger(DeltaImportHTTPPostScheduler.class);

	public DeltaImportHTTPPostScheduler(String webAppName, Timer t)
			throws Exception {
		super(webAppName, t);
		logger.info("<index update process> DeltaImportHTTPPostScheduler init");
	}

	public void run() {
		sync_run("delta", delta_syncCores);
	}
}