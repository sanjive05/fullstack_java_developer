package com.social.media.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Social_User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "social_profile_id")
    private Social_Profile socialProfile;

    @OneToMany(mappedBy = "socialUser")
    private List<Social_Post> posts = new ArrayList<>();


    @ManyToMany
    @JoinTable(
            name = "user_group",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name ="group_id")
    )
    private Set<Social_Group> groups = new HashSet<>();

}
