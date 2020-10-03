package excercise.orm.repository;

import excercise.orm.model.LogRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRecordRepository extends JpaRepository<LogRecord, Long> {

}
