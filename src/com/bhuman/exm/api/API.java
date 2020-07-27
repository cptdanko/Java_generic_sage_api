package com.bhuman.exm.api;

/*
 * A generic API interface. It provides generic
 * methods to authenticate, post and retrieve 
 * journal entries
 */
public interface API<T> {	
	public T authenticate();	
}
