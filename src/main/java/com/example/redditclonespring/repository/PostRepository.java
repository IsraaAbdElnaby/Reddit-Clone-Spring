package com.example.redditclonespring.repository;

import com.example.redditclonespring.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//Post => the entity , Long => the type of the primary key
public interface PostRepository extends JpaRepository<Post, Long> {
}