package entity;

import Base.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.cache.spi.RegionFactory;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "admin")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class User extends BaseEntity<Long>{


    private String username;
    private String password;


    @OneToMany(mappedBy = "user")
   private List<Task> tasks;


    public String toString() {
        return "User(username=" + this.getUsername() + ", password=" + this.getPassword() + ")";
    }
}
