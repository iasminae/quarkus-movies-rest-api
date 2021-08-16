import io.quarkus.test.junit.QuarkusTest;
import model.Movie;
import org.junit.jupiter.api.Test;

import javax.transaction.Transactional;

import static io.restassured.RestAssured.given;
import static io.smallrye.common.constraint.Assert.assertTrue;
import static org.hamcrest.Matchers.is;

@QuarkusTest
public class MovieTest {

    @Test
    @Transactional
    public void testMovieEndpoint() {
        Movie movie= new Movie();
        movie.id= 12345L;
        movie.persistAndFlush();
        assertTrue(movie.isPersistent());
        given()
                .when().get("/movies/"+movie.id)
                .then()
                .statusCode(200)
                .body(is("12345L"));
    }
}