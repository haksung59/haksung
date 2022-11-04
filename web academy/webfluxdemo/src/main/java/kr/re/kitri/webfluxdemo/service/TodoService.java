package kr.re.kitri.webfluxdemo.service;

import kr.re.kitri.webfluxdemo.model.Todo;
import kr.re.kitri.webfluxdemo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public Flux<Todo> getAllTodos() {
        return todoRepository.retrieveTodos();
    }

    public Mono<Todo> getTodoById(long id) {
        Mono<Todo> todoMono = todoRepository.retrieveTodoById(id);
        //todoRepository.insertTodo(todoMono);
        return todoMono;
    }
}
