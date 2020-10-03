package excercise.orm.tasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import static org.junit.Assert.fail;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Task2SeniorTest {
    @Autowired
    private EntityManager entityManager;

    @Test
    public void test() {

        try {
            Query query = entityManager
                    .createQuery(
                            "SELECT b.id,b.date,b.method,b.url," +
                                    "b.requestJson,b.requestIpV6,b.message,b.result " +
                                    "FROM LogRecord b");
            query.getResultList();
        } catch (Exception e) {
            fail("MAPPING of LogRecord class is Wrong! \n \n \n" + e.getMessage());
        }
    }
}