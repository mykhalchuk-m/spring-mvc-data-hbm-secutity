package com.test.mmm.entity;
// Generated Sep 5, 2015 1:43:34 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * Importinfo generated by hbm2java
 */
public class Importinfo implements java.io.Serializable
{

	private int id;
	private Users users;
	private Date transactiondate;
	private String notes;
	private byte[] file;
	private String filename;

	public Importinfo()
	{
	}

	public Importinfo(int id, Users users, Date transactiondate, String notes, byte[] file, String filename)
	{
		this.id = id;
		this.users = users;
		this.transactiondate = transactiondate;
		this.notes = notes;
		this.file = file;
		this.filename = filename;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Users getUsers()
	{
		return this.users;
	}

	public void setUsers(Users users)
	{
		this.users = users;
	}

	public Date getTransactiondate()
	{
		return this.transactiondate;
	}

	public void setTransactiondate(Date transactiondate)
	{
		this.transactiondate = transactiondate;
	}

	public String getNotes()
	{
		return this.notes;
	}

	public void setNotes(String notes)
	{
		this.notes = notes;
	}

	public byte[] getFile()
	{
		return this.file;
	}

	public void setFile(byte[] file)
	{
		this.file = file;
	}

	public String getFilename()
	{
		return this.filename;
	}

	public void setFilename(String filename)
	{
		this.filename = filename;
	}

}
