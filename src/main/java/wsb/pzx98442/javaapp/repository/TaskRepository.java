package wsb.pzx98442.javaapp.repository;

import org.springframework.data.repository.CrudRepository;
import wsb.pzx98442.javaapp.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {
}
