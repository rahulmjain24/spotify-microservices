package com.spotify.userservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class User extends BaseModel {
    private String username;
    private String email;
    private String password;
}