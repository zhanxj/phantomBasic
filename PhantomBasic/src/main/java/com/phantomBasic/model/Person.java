/**
 * 
 */
package com.phantomBasic.model;


/**
 * 
 * @author Hokin.jim
 *
 */
public class Person {
	/**
	 * 姓名
	 */

	private String name;
	/**
	 * 年龄
	 */
	private Integer age;
	/**
	 * 性别
	 */
	private Integer sex;
	/**
	 * 邮箱
	 */
	private String email;
	
	public Person(){}
	public Person(String name, Integer age, Integer sex, String email) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
