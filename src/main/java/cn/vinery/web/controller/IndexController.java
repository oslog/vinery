/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.vinery.Constants;
import cn.vinery.web.service.IndexService;

/**
 * 首页
 */
@Controller
public class IndexController extends VineryController {

	/** 首页服务 */
	@Autowired
	private IndexService indexService;

	/**
	 * 进入首页
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView(Constants.INDEX);
		mav.addObject("rssList", this.indexService.getLatest());
		return mav;
	}

	// @RequestMapping("/{start}")
	// public ModelAndView index(@PathVariable("start") Integer start) {
	// ModelAndView mav = new ModelAndView();
	// mav.setViewName("item");
	// mav.addObject("myPage", this.indexService.getHotLinks(start));
	// return mav;
	// }
	//
	// @RequestMapping("/tag/{id}")
	// public ModelAndView showByTag(@PathVariable("id") String id) throws
	// AppException {
	// ModelAndView mav = new ModelAndView();
	// mav.setViewName("index");
	// mav.addObject("myPage", this.indexService.getLinkByTag(id));
	// mav.addObject("tags", this.indexService.getHotTags());
	// mav.addObject("searchTags", this.indexService.getSearchTags());
	//
	// return mav;
	// }

	// @RequestMapping("/save")
	// @ResponseBody
	// public String saveWebsite(String url, String tags, HttpServletRequest
	// request) {
	// Errors errs = new Errors();
	// if (StringUtil.isEmpty(url) || Util.isUrl(url) == false) {
	// errs.add("webPageUrl", Constants.WAR006);
	// return ng(errs);
	// }
	//
	// UserVo vo = (UserVo)
	// request.getSession().getAttribute(Constants.LOGIN_USER);
	//
	// try {
	// this.indexService.saveLink(url, tags, vo.getId());
	// } catch (AppException ae) {
	// return ng(ae.getMessage());
	// }
	//
	// return ok();
	// }
	//
	// @RequestMapping("/searchTags")
	// @ResponseBody
	// public String searchTags(String url) {
	// Errors errs = new Errors();
	// if (StringUtil.isEmpty(url) || Util.isUrl(url) == false) {
	// errs.add("webPageUrl", Constants.WAR006);
	// return ng(errs);
	// }
	//
	// try {
	// return ok(this.indexService.searchTags(url));
	// } catch (AppException ae) {
	// return ng(ae.getMessage());
	// }
	// }

	// @RequestMapping("/home")
	// public ModelAndView showMyLinks(HttpServletRequest request) throws
	// AppException {
	// ModelAndView mav = new ModelAndView();
	// mav.setViewName("home");
	//
	// UserVo vo = (UserVo)
	// request.getSession().getAttribute(Constants.LOGIN_USER);
	//
	// mav.addObject("myPage", this.indexService.getUserLinks(vo.getId(), 0));
	// mav.addObject("tags", this.indexService.getHotTags());
	// mav.addObject("searchTags", this.indexService.getSearchTags());
	//
	// return mav;
	// }
	//
	// @RequestMapping("/home/{start}")
	// public ModelAndView showMyLinks(@PathVariable("start") Integer start,
	// HttpServletRequest request)
	// throws AppException {
	// ModelAndView mav = new ModelAndView();
	// mav.setViewName("home");
	//
	// UserVo vo = (UserVo)
	// request.getSession().getAttribute(Constants.LOGIN_USER);
	//
	// mav.addObject("myPage", this.indexService.getUserLinks(vo.getId(),
	// start));
	// mav.addObject("tags", this.indexService.getHotTags());
	// mav.addObject("searchTags", this.indexService.getSearchTags());
	//
	// return mav;
	// }
}
