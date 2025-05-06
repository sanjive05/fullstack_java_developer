package com.social.media;

import com.social.media.models.Social_Group;
import com.social.media.models.Social_Post;
import com.social.media.models.Social_Profile;
import com.social.media.models.Social_User;
import com.social.media.repository.GroupRepository;
import com.social.media.repository.PostRepository;
import com.social.media.repository.ProfileRepository;
import com.social.media.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {
    private final UserRepository userRepository;
    private final GroupRepository groupRepository;
    private final PostRepository postRepository;
    private final ProfileRepository profileRepository;

    public DataInitializer(UserRepository userRepository, GroupRepository groupRepository, PostRepository postRepository, ProfileRepository profileRepository) {
        this.userRepository = userRepository;
        this.groupRepository = groupRepository;
        this.postRepository = postRepository;
        this.profileRepository = profileRepository;
    }
    @Bean
    public CommandLineRunner initializeData(){
        return (args -> {

            Social_User socialUser1 = new Social_User();
            Social_User socialUser2 = new Social_User();
            Social_User socialUser3 = new Social_User();

            userRepository.save(socialUser1);
            userRepository.save(socialUser2);
            userRepository.save(socialUser3);

            Social_Group socialGroup1 = new Social_Group();
            Social_Group socialGroup2 = new Social_Group();
            socialGroup1.getUserSet().add(socialUser1);
            socialGroup1.getUserSet().add(socialUser2);
            socialGroup2.getUserSet().add(socialUser2);
            socialGroup2.getUserSet().add(socialUser3);

            groupRepository.save(socialGroup1);
            groupRepository.save(socialGroup2);

            Social_Post post1 = new Social_Post();
            Social_Post post2 = new Social_Post();
            Social_Post post3 = new Social_Post();

            post1.setSocialUser(socialUser1);
            post2.setSocialUser(socialUser2);
            post3.setSocialUser(socialUser3);

            postRepository.save(post1);
            postRepository.save(post2);
            postRepository.save(post3);

            Social_Profile socialProfile1 = new Social_Profile();
            Social_Profile socialProfile2 = new Social_Profile();
            Social_Profile socialProfile3 = new Social_Profile();

            socialProfile1.setSocialUser(socialUser1);
            socialProfile2.setSocialUser(socialUser2);
            socialProfile3.setSocialUser(socialUser3);
            profileRepository.save(socialProfile1);
            profileRepository.save(socialProfile2);
            profileRepository.save(socialProfile3);

        });
    }
}
