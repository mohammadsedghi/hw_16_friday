package Base.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User<ID extends Serializable> extends BaseEntity<ID> {

    private String firstname;
    private String lastname;
    @ElementCollection
    private List<Address> addresses;
    @Transient
    private String age;
    private Date dateOfBirth;


}
