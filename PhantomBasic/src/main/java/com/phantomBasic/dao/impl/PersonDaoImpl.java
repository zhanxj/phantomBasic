/**
 * 
 */
package com.phantomBasic.dao.impl;

import java.util.List;

import com.google.common.collect.Lists;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.phantomBasic.dao.PersonDao;
import com.phantomBasic.model.Person;

/**
 * @author Hokin.jim
 *
 */
public class PersonDaoImpl implements PersonDao{
	
	@Override
	public List<Person> getAllPerson() {
		List<Record> rs  = Db.find("select * from person");
		List<Person> persons = Lists.newArrayList();
		for (Record record : rs) {
			Person p  = new Person();
			p.setAge((Integer) record.get("age"));
			p.setEmail((String) record.get("email"));
			p.setName((String) record.get("name"));
			p.setSex((Integer) record.get("sex"));
			persons.add(p);
		}
		return persons;
	}

}
