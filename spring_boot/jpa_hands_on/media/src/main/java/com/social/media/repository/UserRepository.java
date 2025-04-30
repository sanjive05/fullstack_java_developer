package com.social.media.repository;

import com.social.media.models.Social_User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Social_User,Long> {
}
