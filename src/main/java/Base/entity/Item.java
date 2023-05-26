package Base.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Item {
@Id
        private Integer itemId;
        private String itemName;
        private String itemDescription;
        private Integer itemPrice;

}

