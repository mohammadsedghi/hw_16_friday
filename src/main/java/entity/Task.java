package entity;


import Base.entity.BaseEntity;
import entity.util.TaskStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Task extends BaseEntity<Long> {
    private String description;
    String title;
    @ManyToOne
    private User user;
    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus = TaskStatus.OPEN;
    LocalDate deadline;

    @Override
    public String toString() {
        return "Task{" +
                "id: "+getId()+ '\'' +
                "task='" + description + '\'' +
                ", title='" + title + '\'' +
                ", taskStatus=" + taskStatus +
                ", deadline=" + deadline +
                "} " ;
    }
}
