package com.social.media.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity

public class Social_Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(mappedBy = "groups")
    @JsonIgnore
    private Set<Social_User> userSet = new HashSet<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Social_User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<Social_User> userSet) {
        this.userSet = userSet;
    }

    public Social_Group() {
    }
}
