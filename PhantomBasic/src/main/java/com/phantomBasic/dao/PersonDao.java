/**
 * 
 */
package com.phantomBasic.dao;

import java.util.List;

import com.phantomBasic.model.Person;

/**
 * @author Hokin.jim
 *
 */
public  interface PersonDao {
	
	public abstract List<Person> getAllPerson();
}
