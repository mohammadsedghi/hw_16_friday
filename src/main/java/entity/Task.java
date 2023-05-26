package entity;


import Base.entity.BaseEntity;
import entity.util.TaskStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@Entity

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
                ", user=" + user.getUsername()+
                ", taskStatus=" + taskStatus +
                ", deadline=" + deadline +
                "} " ;
    }
}
