package com.spring.codeblog.service;

import com.spring.codeblog.model.Post;

import java.util.List;
import java.util.UUID;

public interface CodeblogService {

    List<Post> findAll();
    Post findById(UUID id);
    Post save(Post post);
}
