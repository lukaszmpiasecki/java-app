package wsb.pzx98442.javaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import wsb.pzx98442.javaapp.service.TaskService;
import wsb.pzx98442.javaapp.model.Task;

@Controller
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String index (Model model){
        model.addAttribute("listTasks",taskService.listAll());
        return "task/new";
    }

    @RequestMapping("/new")
    public String create(Model model){
        Task task = new Task();
        model.addAttribute("task",task);
        return  "task/new";
    }

    @PostMapping("/save")
    public String saveTask(@ModelAttribute("task") Task task){
        taskService.save(task);
        return "redirect:/task/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable(name = "id") int id){
        ModelAndView modelAndView = new ModelAndView("task/edit");
        modelAndView.addObject("task", taskService.find(id));
        return modelAndView;
    }

    @RequestMapping("/delete/{id}")
    public String deleteActor(@PathVariable(name = "id") int id){
        taskService.delete(id);
        return "redirect:/task/";
    }
}
