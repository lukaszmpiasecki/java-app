package wsb.pzx98442.javaapp.model;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "taskname", nullable = false)
    private String taskName;
    @Column(name = "taskdescription")
    private String taskDescription;
    @Column(name = "taskcomplete")
    private Boolean taskComplete;
    @ManyToOne
    private User user;
}
