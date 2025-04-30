package com.social.media.repository;

import com.social.media.models.Social_Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Social_Post,Long> {
}
