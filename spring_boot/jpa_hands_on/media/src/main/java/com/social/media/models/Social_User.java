package com.social.media.models;

import jakarta.persistence.*;

@Entity
public class Social_User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "social_profile_id")
    private Social_Profile socialProfile;



}
