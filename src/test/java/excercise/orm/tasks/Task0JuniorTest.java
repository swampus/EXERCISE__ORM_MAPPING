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
public class Task0JuniorTest {

    @Autowired
    private EntityManager entityManager;

    @Test
    public void test() {

        try {
            Query query = entityManager
                    .createQuery("SELECT b.id,b.name,b.annotation,b.author,b.year,b.isbn " +
                            "FROM Book b");
        } catch (Exception e) {
            fail("MAPPING of Book class is Wrong! \n \n \n" + e.getMessage());
        }

    }
}