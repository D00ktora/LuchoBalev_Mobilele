package org.softuni.mobilele.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import javax.management.relation.Role;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

  @Column(nullable = false, unique = true)
  @Size(min = 2)
  @Email
  private String email;
  @Column(nullable = false)
  private String password;
  @Column(nullable = false)
  private String firstName;
  @Column(nullable = false)
  private String lastName;
  private boolean active;
  @ManyToOne(optional = false)
  private UserRole role;
  private String imageUrl;
  @Column(nullable = false)
  private LocalDateTime created;
  @Column(nullable = false)
  private LocalDateTime modified;

  public String getEmail() {
    return email;
  }

  public UserEntity setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public UserEntity setPassword(String password) {
    this.password = password;
    return this;
  }

  public String getFirstName() {
    return firstName;
  }

  public UserEntity setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public UserEntity setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public boolean isActive() {
    return active;
  }

  public UserEntity setActive(boolean active) {
    this.active = active;
    return this;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public UserEntity setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  public LocalDateTime getCreated() {
    return created;
  }

  public UserEntity setCreated(LocalDateTime created) {
    this.created = created;
    return this;
  }

  public LocalDateTime getModified() {
    return modified;
  }

  public UserEntity setModified(LocalDateTime modified) {
    this.modified = modified;
    return this;
  }

  public UserRole getRole() {
    return role;
  }

  public UserEntity setRole(UserRole role) {
    this.role = role;
    return this;
  }
}
