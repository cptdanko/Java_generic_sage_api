package com.bhuman.exm.api.test;

import org.junit.Assert;
import org.junit.Test;

import com.bhuman.exm.api.API;
import com.bhuman.exm.api.APIFactory;
import com.bhuman.exm.api.SageImpl;
import com.bhuman.exm.models.Credentials;
import com.bhuman.exm.util.Constants;

public class FactoryTest {

	
	@Test 
	public void testSageConstant() {
		String key = Constants.sageFactoryKey;
		Assert.assertEquals("sage", key);
	}
	
	@Test
	public void testSingleton() {
		API<Credentials> impl = APIFactory.factory.getAuthAPI(Constants.sageFactoryKey);
		Assert.assertTrue(impl instanceof SageImpl);
	}
	

}
