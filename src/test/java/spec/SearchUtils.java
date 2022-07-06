import model.FullResponse;

import static io.restassured.RestAssured.given;
import static spec.Spec.request;
import static spec.Spec.response;

public class SearchUtils {
    static final String searchQuery = "search.json?%s";

    private static String searchQuery(String s) {
        return String.format(searchQuery, s);
    }

    public static FullResponse getSearchResult(String searchText) {
        System.out.println(searchQuery(searchText));
        return given()
                .spec(request)
                .when()
                .get(searchQuery(searchText))
                .then()
                .spec(response)
                .extract()
                .as(FullResponse.class);
    }
}
