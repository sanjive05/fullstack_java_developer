package com.social.media.repository;

import com.social.media.models.Social_Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Social_Profile,Long> {
}
