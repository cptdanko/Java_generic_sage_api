package com.bhuman.exm.api;

import java.util.HashMap;
import java.util.Map;

import com.bhuman.exm.models.Credentials;
import com.bhuman.exm.models.JournalEntry;
import com.bhuman.exm.util.Constants;

/*
 * Adding this factory here in case there are more auth providers
 * or CrudTypes for different object types. This class ensures we
 * avoid multiple nested if statements
 */
public class APIFactory {

	private Map<String, API<Credentials>> authMap = new HashMap<String, API<Credentials>>();
	
	private Map<String, CrudAPI<JournalEntry>> crudMap = new HashMap<String, CrudAPI<JournalEntry>>();
	
	//let's just have one instance of this factory in the project
	public static APIFactory factory = new APIFactory();
	
	/*
	 * So far we only have crud and auth implementations for Sage
	 */
	private APIFactory() {
		SageImpl sageImpl = new SageImpl();
		authMap.put(Constants.sageFactoryKey, sageImpl);
		crudMap.put(Constants.sageFactoryKey, sageImpl);
	}
	
	public API<Credentials> getAuthAPI(String name) {
		return authMap.get(name);
	}
	
	public CrudAPI<JournalEntry> getCrudAPI(String name) {
		return crudMap.get(name);
	}
}
