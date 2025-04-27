package com.social.media.models;

import jakarta.persistence.*;


@Entity
public class Social_Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "socialProfile")
    private Social_User socialUser;
}
