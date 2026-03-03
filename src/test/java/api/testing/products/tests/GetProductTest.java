package api.testing.products.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.testing.base.BaseTest;
import api.testing.constants.AuthType;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetProductTest extends BaseTest{
	
	@Test
	public void getAllProductsTest() {
		Response response = restClient.get(BASE_URL_FAKE_PRODUCT, FAKE_PRODUCTS_ENDPOINT, null, null, AuthType.NO_AUTH, ContentType.JSON);
		Assert.assertEquals(response.statusCode(), 200);
		
	}
	

}
