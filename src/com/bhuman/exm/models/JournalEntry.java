package com.bhuman.exm.models;

import java.util.List;

/*
 * Contains a small selection of fields relative to the journal 
 * entries found at, 
 * https://developer.intacct.com/api/general-ledger/journal-entries/#create-journal-entry
 * JournalEntry POJO
 */
public class JournalEntry {

	//********** mandatory fields ****************
	private String journal;
	/* mm/dd/yyy format */
	private String batch_date;
	private String batch_title;
	private List<Glentry> entries;
	
	//********** optional fields ****************
	/* mm/dd/yyy format */
	private String reversedate;

	public JournalEntry() {
	}
	
	/* the entries are not being added as when retrieved from the endpoint */
	public JournalEntry(String journal, String batch_date, String batch_title) {
		this.journal = journal;
		this.batch_date = batch_date;
		this.batch_title = batch_title;
	}

	public String getJournal() {
		return journal;
	}

	public void setJournal(String journal) {
		this.journal = journal;
	}

	public String getBatch_date() {
		return batch_date;
	}

	public void setBatch_date(String batch_date) {
		this.batch_date = batch_date;
	}

	public String getBatch_title() {
		return batch_title;
	}

	public void setBatch_title(String batch_title) {
		this.batch_title = batch_title;
	}

	public String getReversedate() {
		return reversedate;
	}

	public void setReversedate(String reversedate) {
		this.reversedate = reversedate;
	}

	public List<Glentry> getEntries() {
		return entries;
	}

	public void setEntries(List<Glentry> entries) {
		this.entries = entries;
	}
}
