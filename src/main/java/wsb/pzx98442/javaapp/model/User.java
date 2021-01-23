package wsb.pzx98442.javaapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
public class User implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "password",nullable = false)
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Task> task;
}
