package com.test.mmm.entity;
// Generated Sep 6, 2015 12:46:57 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Projecttypes generated by hbm2java
 */
public class Projecttypes implements java.io.Serializable
{

	private int id;
	private String code;
	private String name;
	private String notes;
	private Date registereddt;
	private Date lastvisitdt;
	private Set projectses = new HashSet(0);

	public Projecttypes()
	{
	}

	public Projecttypes(int id, String code, String name, Date registereddt, Date lastvisitdt)
	{
		this.id = id;
		this.code = code;
		this.name = name;
		this.registereddt = registereddt;
		this.lastvisitdt = lastvisitdt;
	}

	public Projecttypes(int id, String code, String name, String notes, Date registereddt, Date lastvisitdt, Set projectses)
	{
		this.id = id;
		this.code = code;
		this.name = name;
		this.notes = notes;
		this.registereddt = registereddt;
		this.lastvisitdt = lastvisitdt;
		this.projectses = projectses;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getCode()
	{
		return this.code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getNotes()
	{
		return this.notes;
	}

	public void setNotes(String notes)
	{
		this.notes = notes;
	}

	public Date getRegistereddt()
	{
		return this.registereddt;
	}

	public void setRegistereddt(Date registereddt)
	{
		this.registereddt = registereddt;
	}

	public Date getLastvisitdt()
	{
		return this.lastvisitdt;
	}

	public void setLastvisitdt(Date lastvisitdt)
	{
		this.lastvisitdt = lastvisitdt;
	}

	public Set getProjectses()
	{
		return this.projectses;
	}

	public void setProjectses(Set projectses)
	{
		this.projectses = projectses;
	}

}
