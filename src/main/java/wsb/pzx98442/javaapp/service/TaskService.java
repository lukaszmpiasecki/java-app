package wsb.pzx98442.javaapp.service;

import org.springframework.stereotype.Service;
import wsb.pzx98442.javaapp.model.Task;
import wsb.pzx98442.javaapp.repository.TaskRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public Iterable<Task> listAll(){
        return taskRepository.findAll();
    }

    public Task find(Integer id){
        return taskRepository.findById(id).orElse(null);
    }

    public void save(Task task){
        taskRepository.save(task);
    }
    public void delete(Integer id){
        taskRepository.deleteById(id);
    }
}
