package com.social.media.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Social_Profile getSocialProfile() {
        return socialProfile;
    }

    public void setSocialProfile(Social_Profile socialProfile) {
        this.socialProfile = socialProfile;
    }

    public List<Social_Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Social_Post> posts) {
        this.posts = posts;
    }

    public Set<Social_Group> getGroups() {
        return groups;
    }

    public void setGroups(Set<Social_Group> groups) {
        this.groups = groups;
    }

    public Social_User() {
    }
}
