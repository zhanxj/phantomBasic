/**
 * 
 */
package com.phantomBasic.controller;

import com.google.inject.Inject;
import com.phantomBasic.ext.PhantomController;
import com.phantomBasic.service.PersonService;
import com.phantomBasic.util.XmlUtil;

/**
 * 
 * @author Hokin.jim
 * 
 */
public class PhantomXmlController extends PhantomController {

	@Inject
	private PersonService service;
	
	private static final String contentType = "text/xml; charset=utf-8";

	/**
	 * 提供XML接口
	 */
	public void index() {
		String xml = XmlUtil.objectToXml(service.getAllPersonList());
		renderText(xml, contentType);
	}
}
