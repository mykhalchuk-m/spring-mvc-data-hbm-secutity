package com.test.mmm.service;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.test.mmm.entity.Users;
import com.test.mmm.repository.UsersRepository;

/**
 * Created by Marian_Mykhalchuk on 9/9/2015.
 */
@Service("userDetailsService")
public class CustomUserDetailsService implements UserDetailsService, Serializable {

    private static final long serialVersionUID = 1340607602118264243L;

    @Autowired
    private UsersRepository usersRepository;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final Users user = usersRepository.findByLogin(username).get(0);
        if (user == null) {
            return null;
        } else {
            return new UserDetails() {
                public Collection<? extends GrantedAuthority> getAuthorities() {
                    return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
                }

                public String getPassword() {
                    return user.getPassword();
                }

                public String getUsername() {
                    return user.getFirstname();
                }

                public boolean isAccountNonExpired() {
                    return true;
                }

                public boolean isAccountNonLocked() {
                    return true;
                }

                public boolean isCredentialsNonExpired() {
                    return true;
                }

                public boolean isEnabled() {
                    return true;
                }
            };
        }
    }
}
