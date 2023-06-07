package my.projectSpringMVC.controller;

import my.projectSpringMVC.modul.Post;
import my.projectSpringMVC.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    @GetMapping
    public List<Post> all() {
        return service.all();
    }

    @PostMapping
    public Post save(@RequestBody Post post) {
        return service.save(post);
    }

    @GetMapping("/{id}")
    public Post getById(@PathVariable long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void removePostById(@PathVariable long id) {
        service.removePostById(id);
    }
}
