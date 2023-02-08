package com.spring.codeblog.repository;

import com.spring.codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CodeBlogRepository extends JpaRepository<Post, UUID> {

}
