package com.book.spring.springbootaws.domain.posts;

import com.book.spring.springbootaws.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
