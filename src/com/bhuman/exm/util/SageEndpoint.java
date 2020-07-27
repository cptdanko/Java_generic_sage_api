package com.bhuman.exm.util;

public enum SageEndpoint {
	
	AUTHENTICATE(""),
	POST_JOURNAL_ENTRY("https://developer.intacct.com/api/general-ledger/journal-entries/#create-journal-entry"),
	RETRIEVE_JOURNAL_ENTRIES("https://developer.intacct.com/api/project-resource-mgmt/projects/");
	
    private String urlStr = null;

    private SageEndpoint(String desc){
        this.urlStr = desc;
    }

    public String urlString() {
    	return urlStr;
    }
}