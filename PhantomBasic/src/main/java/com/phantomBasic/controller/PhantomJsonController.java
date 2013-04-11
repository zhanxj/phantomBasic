package com.phantomBasic.controller;

import com.google.inject.Inject;
import com.phantomBasic.ext.PhantomController;
import com.phantomBasic.service.PersonService;

public class PhantomJsonController extends PhantomController {

	@Inject
	private PersonService service;
	
	/**
	 * 提供Json接口
	 */
	public void index() {
		renderJson(service.getAllPersonList());
	}
}
