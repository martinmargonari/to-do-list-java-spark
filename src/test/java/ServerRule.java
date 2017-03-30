import org.junit.rules.ExternalResource;
import spark.Spark;

/**
 * Created by Margonari on 28/03/2017.
 */
public class ServerRule extends ExternalResource {

    protected void before() {
        String[] args = {};
        App.main(args);
    }

    protected void after() {
        Spark.stop();
    }

}
