package my.projectSpringMVC.service;

import my.projectSpringMVC.exception.NotFoundException;
import my.projectSpringMVC.modul.Post;
import my.projectSpringMVC.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository repository;

    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public List<Post> all() {
        return repository.all();
    }

    public Post save(Post post) {
        return repository.save(post);
    }

    public void removePostById(long id) {
        repository.removePostById(id);
    }

    public Post getById(long id) {
        return repository.getById(id).orElseThrow(NotFoundException::new);
    }
}
