package com.bhuman.exm.models.test;

import org.junit.Assert;
import org.junit.Test;

import com.bhuman.exm.models.Credentials;
import com.bhuman.exm.models.Glentry;
import com.bhuman.exm.models.JournalEntry;
import com.bhuman.exm.models.Project;

/*
 * Unit tests to ensure that all model classes are valid POJO
 */
public class PojoTest {
	
	@Test 
	public void testCredentials() {
		Assert.assertNotNull(new Credentials());
	}
	@Test 
	public void testGlentry() {
		Assert.assertNotNull(new Glentry());
	}
	@Test 
	public void testProject() {
		Assert.assertNotNull(new Project());
	}
	@Test 
	public void testJournalEntry() {
		Assert.assertNotNull(new JournalEntry());
	}
}
