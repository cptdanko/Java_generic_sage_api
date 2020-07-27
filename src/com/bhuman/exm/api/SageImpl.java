package com.bhuman.exm.api;

import java.util.ArrayList;
import java.util.List;

import com.bhuman.exm.models.Credentials;
import com.bhuman.exm.models.JournalEntry;

/*
 * Sample class that demonstrates how to consume the Sage API
 * found at: https://developer.intacct.com/web-services/
 * Implementing the API<Credentials> here, so in this case it's with the
 * Sage API but we could have GoogleAuthImpl<>, FacebookAuthImpl<> etc
 */
public class SageImpl implements API<Credentials>, CrudAPI<JournalEntry> {

	@Override
	public JournalEntry create(JournalEntry entry, String sessionId) {
		// TODO Auto-generated method stub
		return new JournalEntry();
	}

	@Override
	public List<JournalEntry> retrieveEntries(String sessionId) {
		// TODO Auto-generated method stub
		return new ArrayList<JournalEntry>();
	}

	@Override
	public JournalEntry updateJournalEntry(JournalEntry entry, String sessionId) {
		// TODO Auto-generated method stub
		return new JournalEntry();
	}

	@Override
	public boolean delete(JournalEntry entry, String sessionId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Credentials authenticate() {
		// TODO Auto-generated method stub
		return null;
	}

}
