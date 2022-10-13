package com.example.redditclonespring.repository;

import com.example.redditclonespring.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//Post => the entity , Long => the type of the primary key
public interface CommentRepository extends JpaRepository<Comment, Long> {
}