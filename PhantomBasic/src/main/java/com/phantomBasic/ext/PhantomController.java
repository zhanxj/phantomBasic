/**
 * 
 */
package com.phantomBasic.ext;

import com.jfinal.core.Controller;
import com.phantomBasic.PhantomGuiceModulePlugin;

/**
 * jfinal controller guice拓展
 * @author Hokin.jim
 *
 */
public abstract class PhantomController extends Controller {

	public PhantomController() {
		super();
		PhantomGuiceModulePlugin.injector.injectMembers(this);//注入guice容器
	}
	
}
