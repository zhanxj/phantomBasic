/**
 * 
 */
package com.phantomBasic.util;

import com.thoughtworks.xstream.XStream;

/**
 * XML 工具类 依赖于Xsteam
 * 
 * @author Hokin.jim
 * 
 */
public class XmlUtil {
	
	private static XStream xs =new XStream();
	
	/**
	 * 对象转XML
	 * @param obj
	 * @return
	 */
	public static String objectToXml(Object obj) {
		return xs.toXML(obj);
	}

	/**
	 * xml转对象
	 * @param xml
	 * @return
	 */
	public static Object xmlToObject(String xml) {
		return xs.fromXML(xml);
	}
}
