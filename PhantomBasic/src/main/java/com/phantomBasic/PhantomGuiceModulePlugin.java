/**
 * 
 */
package com.phantomBasic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Scopes;
import com.jfinal.plugin.IPlugin;
import com.phantomBasic.dao.PersonDao;
import com.phantomBasic.dao.impl.PersonDaoImpl;
import com.phantomBasic.service.PersonService;
import com.phantomBasic.service.impl.PersonServiceImpl;

/**
 * guice module
 * @author Hokin.jim
 * 
 */
public class PhantomGuiceModulePlugin implements Module,IPlugin{
	private static final Logger LOG = LoggerFactory.getLogger(PhantomGuiceModulePlugin.class);
	public static Injector injector;
	
	@Override
	public void configure(Binder binder) {
		binder.bind(PersonDao.class).to(PersonDaoImpl.class).in(Scopes.SINGLETON);
		binder.bind(PersonService.class).to(PersonServiceImpl.class).in(Scopes.SINGLETON);
	}

	@Override
	public boolean start() {
		injector = Guice.createInjector(this);
		LOG.info("PhantomGuiceModulePlugin is started。");
		return true;
	}

	@Override
	public boolean stop() {
		LOG.info("PhantomGuiceModulePlugin is stop。");
		return true;
	}


}
