# Sage API consumption for EX-M

This project provides an outline i.e. a structure for how to consume Sage API.

## Structure
This project is divided into 3 packages i.e. Model, API, and Util and each corresponding package has it's own set of unit test methods.

### Model 
Contains models that provide a mapping to it's corresponding types found in [Sage docs]. At this stage, all the models are POJOs and they are 

- Credentials 
- Glentry 
- JournalEntry 
- Project 

### API
The API package consists of generic interfaces for authentication and CRUD operations. 

```
public interface API<T> {	
	public T authenticate();	
}
public interface CrudAPI<T> {
	public T create(T entry, String sessionId);
	public List<T> retrieveEntries(String sessionId); 
	public T updateJournalEntry(T entry, String sessionId);
	public boolean delete(T entry, String sessionId);
}
```
They are implemented by the 
- SageImpl that aims to query external Sage API

which is access via the APIFactory, which is a uses the Factory pattern in combination with the Singleton pattern to avoid multiple if statements in the future 

```
public class APIFactory {
	private Map<String, API<Credentials>> authMap = new HashMap<String, API<Credentials>>();
	private Map<String, CrudAPI<JournalEntry>> crudMap = new HashMap<String, CrudAPI<JournalEntry>>();
	//let's just have one instance of this factory in the project
	public static APIFactory factory = new APIFactory();
	/
	* So far we only have crud and auth implementations for Sage */
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
```

### Util 
The util package contains the necessary information such as 
- enum - has the relative Sage urls
```
public enum SageUrls {
	AUTHENTICATE(""),
	POST_JOURNAL_ENTRY("https://developer.intacct.com/api/general-ledger/journal-entries/#create-journal-entry"),
	RETRIEVE_JOURNAL_ENTRIES("https://developer.intacct.com/api/project-resource-mgmt/projects/");
	
    private String urlStr = null;
    private SageUrls(String desc){
        this.urlStr = desc;
    }
    public String getUrlStr() {
    	return urlStr;
    }
}
```
- Constants - has the key to fetch the API from APIFactory
```
package com.bhuman.exm.util;

public class Constants {
	
	public static String sageFactoryKey = "sage";	
}

```

# Further reading

- [Singleton Pattern]
- [Factory Pattern]
- [Mockito]
- [Java REST app with Jersey]
- [Maven project with Java How-To]
- [Java on HackerRank]


[Sage docs]: https://developer.intacct.com/api/general-ledger/journal-entries/#create-journal-entry
[Singleton Pattern]: https://refactoring.guru/design-patterns/singleton
[Factory Pattern]: https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
[Mockito]: https://site.mockito.org/
[Java REST app with Jersey]: https://mydaytodo.com/java-restful-backend-for-an-app/
[Maven project with Java How-To]: https://mkyong.com/maven/how-to-create-a-java-project-with-maven/
[Java on HackerRank]: https://mydaytodo.com/java-stack-brackets-hackerrank/

