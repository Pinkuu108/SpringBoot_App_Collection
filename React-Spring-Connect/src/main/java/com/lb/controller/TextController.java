package com.lb.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lb.model.TextData;
import com.lb.repository.TextRepository;


@RestController
@RequestMapping("/api/text")
@CrossOrigin(origins = "http://localhost:5174")
public class TextController {
	private final TextRepository repo;

    public TextController(TextRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public TextData saveText(@RequestBody TextData text) {
        return repo.save(text);
    }

    @GetMapping
    public List<TextData> getAll() {
        return repo.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
    @PutMapping("/{id}")
    public TextData updateText(@PathVariable Long id, @RequestBody TextData newText){

        TextData data = repo.findById(id).orElseThrow();

        data.setText(newText.getText());

        return repo.save(data);
    }

}
