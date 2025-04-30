package com.social.media.repository;

import com.social.media.models.Social_Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Social_Group,Long> {
}
