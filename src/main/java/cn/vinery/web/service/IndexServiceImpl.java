/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.vinery.rss.Rss;
import cn.vinery.rss.parser.RssParser;

/**
 * 首页服务实现
 */
@Service
public class IndexServiceImpl implements IndexService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.vinery.service.IndexService#getLatest()
	 */
	public List<Rss> getLatest() {
		RssParser rp = new RssParser("http://feed.feedsky.com/oslog");
		Rss rss = rp.parse();
		List<Rss> rssList = new ArrayList<Rss>(1);
		rssList.add(rss);
		return rssList;
	}

}
