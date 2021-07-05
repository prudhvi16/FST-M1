package example;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Test1 {
RequestSpecification requestSpec;
String sshKey;
int ID;

@BeforeClass
public void setup() {
	requestSpec = new RequestSpecBuilder()
			.setContentType(ContentType.JSON)
	        .setBaseUri("https://api.github.com")
	        .addHeader("Authorization", "Token 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")
	        .build();
}

@Test(priority=0)
public void postRequest(){
// String reqBody = "{\"title\":\"testAPIKey\",\"key\":\"" + "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQCbEpwUaGDVsYH6snE8be4pVbSmnqBKjcob9M9k6fr1OyfW8TjmTnRgTZwOEPHyCUpbnCPmZb3q3eKHKVcWEFD0i5+L0/NXLNCOPUv3nRDt7N6cLzITC/t0OiHBr4dBTjNq8zskOmk1O8Q/1jWUHjg+pm4XzdG4afwq3JodQNHcuy0FdWffmSXR3L0xYLwC/iSpFkatPzmzJRh8h4JF3UYjUVJQJaMgqu9YKRIBTAmtKHcHOh2oMa9u1UHvstIKG/RyvhrAwqEDnfJ/B4PRqbUyJmtzWxAcbSnTuBGWZQs1hpX9TZAq/VGNWNx1ndx+joinY86IfzmVwIcY5EpR/zBjil7ctjnan+Vh1rE5hRZuHVyJ3d/ObZmu0vkKSW/nYrGJVzyaxOKL+A1cIgu1D9j5eTLYXMkO3uXnNedLDzbzLtqgHCP4HISDdF4J7hEatC+5iaPi/fuMoN0+IyyI5gVQAuse7l1JV5ltzIy+m8cM1EiAJJNlhn1tP5puTyh0SfU" + "\"}";

	String reqBody = "{\"title\":\"TestAPIKey\", \"key\": \"" + "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQCbEpwUaGDVsYH6snE8be4pVbSmnqBKjcob9M9k6fr1OyfW8TjmTnRgTZwOEPHyCUpbnCPmZb3q3eKHKVcWEFD0i5+L0/NXLNCOPUv3nRDt7N6cLzITC/t0OiHBr4dBTjNq8zskOmk1O8Q/1jWUHjg+pm4XzdG4afwq3JodQNHcuy0FdWffmSXR3L0xYLwC/iSpFkatPzmzJRh8h4JF3UYjUVJQJaMgqu9YKRIBTAmtKHcHOh2oMa9u1UHvstIKG/RyvhrAwqEDnfJ/B4PRqbUyJmtzWxAcbSnTuBGWZQs1hpX9TZAq/VGNWNx1ndx+joinY86IfzmVwIcY5EpR/zBjil7ctjnan+Vh1rE5hRZuHVyJ3d/ObZmu0vkKSW/nYrGJVzyaxOKL+A1cIgu1D9j5eTLYXMkO3uXnNedLDzbzLtqgHCP4HISDdF4J7hEatC+5iaPi/fuMoN0+IyyI5gVQAuse7l1JV5ltzIy+m8cM1EiAJJNlhn1tP5puTyh0SfU=" + "\"}";

Response response =given().spec(requestSpec)
.body(reqBody)
.when().post("/user/keys");
//ID= response.then().extract().path("ID");
System.out.println(reqBody);
response.then().statusCode(201);
}

@Test(priority=1)
public void getReq() {
Response response= given().spec(requestSpec)
.when().get("/user/keys");
//ID= response.then().extract().path("ID");
System.out.println(response.then().log().all());
response.then().statusCode(200);
}

@Test(priority=2)
public void deleteReq() {
Response response= given().spec(requestSpec)
.pathParam("keyId", ID)
.when().delete("/user/keys/{keyId}");
System.out.println(response.then().log().all());
response.then().statusCode(204);
}
}



