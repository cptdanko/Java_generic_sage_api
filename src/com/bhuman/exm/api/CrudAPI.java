package com.bhuman.exm.api;

import java.util.List;

public interface CrudAPI<T> {
	/* e.g. create = post journal entry*/
	
	public T create(T entry, String sessionId);
	
	public List<T> retrieveEntries(String sessionId); 
	
	public T updateJournalEntry(T entry, String sessionId);
	
	public boolean delete(T entry, String sessionId);
}
