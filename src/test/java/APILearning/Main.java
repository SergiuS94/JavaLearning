package APILearning;

import APILearning.fakestore1.ProductsResponseItem;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;


public class Main {
    static RequestSpecification httpRequest = RestAssured.given();

    public static void main(String[] args) {
//        RestAssured.baseURI = "https://fakestoreapi.com/products";
//        RestAssured.basePath = "products";

        /** 1.1 Salvand cu RequestSpecification ca String*/
        String response2 = httpRequest
                .baseUri("https://fakestoreapi.com/")
                .basePath("products")
                .get()
                .then()
                .assertThat().statusCode(200).extract().response().asString();
        JsonPath jsonPath = new JsonPath(response2);
        System.out.println("1.1: "+jsonPath.getString("title[0]"));

        /** 1.2Metoda cu Response*/
        Response response = given()
                .baseUri("https://fakestoreapi.com/")
                .basePath("products")
                .header("Connection", "keep-alive")
                .get().then().assertThat().statusCode(200).extract().response();


        /** 1.2.1Folosind jsonPath*/
        String test = response.jsonPath().getString("title[0]");
        System.out.println("1.2.1: "+test);
        String test2 = response.jsonPath().getString("rating.rate[0]");
        System.out.println("1.2.1: "+test2);

        /** 1.2.2Folosind POJO*/
        ProductsResponseItem[] productsResponseItem = response.as(ProductsResponseItem[].class);
        System.out.println("1.2.2: "+productsResponseItem[0].getTitle());

    }

}
