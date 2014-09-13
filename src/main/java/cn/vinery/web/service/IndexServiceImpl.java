/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.web.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import cn.vinery.rss.Rss;
import cn.vinery.rss.parser.RssParser;

/**
 * 首页服务实现
 */
@Service
public class IndexServiceImpl implements IndexService {

	/** 日志 */
	private static final Logger log = LogManager.getLogger(IndexServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.vinery.service.IndexService#getLatest()
	 */
	public List<Rss> getLatest() {
		RssParser rp = new RssParser("http://feed.feedsky.com/oslog");

		try {
			Rss rss = rp.parse();
			List<Rss> rssList = new ArrayList<Rss>(1);
			rssList.add(rss);
			return rssList;
		} catch (Exception ex) {
			log.warn(ex);
		}
		return null;
	}

}
