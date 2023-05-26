package entity;

import Base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "admin")
public class User extends BaseEntity<Long> {


    private String username;
    private String password;
    @OneToMany(mappedBy = "user")
   private List<Task> tasks;


    public String toString() {
        return "User(username=" + this.getUsername() + ", password=" + this.getPassword() + ", tasks=" + this.getTasks() + ")";
    }
}
