/**
 * 
 */
package com.phantomBasic.service.impl;

import java.util.List;

import com.google.inject.Inject;
import com.phantomBasic.dao.PersonDao;
import com.phantomBasic.model.Person;
import com.phantomBasic.service.PersonService;

/**
 * @author Hokin.jim
 *
 */
public class PersonServiceImpl implements PersonService {
	
	@Inject
	private PersonDao dao;
	
	@Override
	public List<Person> getAllPersonList() {
		return dao.getAllPerson();
	}

}
