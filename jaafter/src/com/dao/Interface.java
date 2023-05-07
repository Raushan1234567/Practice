package com.dao;

import java.time.LocalDate;

import com.dto.Author2;

import jaaftercom.excep.Norecordfoun;
import jaaftercom.excep.Somethingwent;

public interface Interface {

	public void add(Author2 a) throws Somethingwent;

	public void Update(Author2 a) throws Somethingwent;

	public void Delete(String id) throws Somethingwent;

	public Author2 Printy(String id) throws Somethingwent, Norecordfoun;

	public Author2 Prinbyrange(LocalDate dob, LocalDate dob1) throws Somethingwent;

}
