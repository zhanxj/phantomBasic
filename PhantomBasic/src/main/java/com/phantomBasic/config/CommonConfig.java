/**
 * 
 */
package com.phantomBasic.config;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.phantomBasic.PhantomGuiceModulePlugin;
import com.phantomBasic.controller.PhantomJsonController;
import com.phantomBasic.controller.PhantomXmlController;

/**
 * jfinal框架config主类
 * @author Hokin.jim
 *
 */
public class CommonConfig extends JFinalConfig{

	@Override
	public void configConstant(Constants constants) {
		//常量
		constants.setDevMode(true);//开发模式
	}

	@Override
	public void configRoute(Routes routes) {
		//路由设置
		routes.add("/phantomxml", PhantomXmlController.class);
		routes.add("/phantomjson", PhantomJsonController.class);
	}

	@Override
	public void configPlugin(Plugins plugins) {
		C3p0Plugin cp = new C3p0Plugin("jdbc:mysql://localhost:3306/test","root","root");
		plugins.add(cp);
		ActiveRecordPlugin activeRecordPlugin = new ActiveRecordPlugin(cp);
		plugins.add(activeRecordPlugin);
		PhantomGuiceModulePlugin guiceModule = new PhantomGuiceModulePlugin();
		plugins.add(guiceModule);
	}

	@Override
	public void configInterceptor(Interceptors interceptors) {
		
	}

	@Override
	public void configHandler(Handlers handlers) {
		
	}

}
