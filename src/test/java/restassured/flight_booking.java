package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class flight_booking {

	public class flyaway_flightbooking {

		@Test
		public void Flyaway_booking() {
			
			String url = "http://localhost:8086/FlyAway/home?source=1&destination=4";
			RestAssured.baseURI=url;
			
			RequestSpecification requestSpecification = RestAssured.given();
			Response response = requestSpecification.accept(ContentType.JSON).get();
			System.out.println(response.asPrettyString());
			
			response.prettyPrint();
			System.out.println("Response code : "+response.getStatusCode());
			Assert.assertEquals(response.getStatusCode(), 200);
			
			
			
		}
	}
}
