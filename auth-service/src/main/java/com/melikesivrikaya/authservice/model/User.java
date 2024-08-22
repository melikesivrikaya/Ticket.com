package com.melikesivrikaya.authservice.model;

import com.melikesivrikaya.authservice.model.enums.Role;
import lombok.*;
import java.util.Set;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String username,password,phone,email;
    private Set<Role> roles;

}
