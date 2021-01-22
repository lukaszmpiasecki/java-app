package wsb.pzx98442.javaapp.model;

import javax.persistence.*;


import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "actor", catalog = "java_course_wsb")
public class Actor implements java.io.Serializable {
    private Integer id;
    private Date created;
    private Date modified;
    private String firstName;
    private String lastName;
    private Integer deleted;
    public Actor() {
    }
    public Actor(Date modified) {
        this.modified = modified;
    }
    public Actor(Date created, Date modified, String firstName, String lastName, Integer
            deleted) {
        this.created = created;
        this.modified = modified;
        this.firstName = firstName;
        this.lastName = lastName;
        this.deleted = deleted;
    }
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", length = 19)
    public Date getCreated() {
        return this.created;
    }
    public void setCreated(Date created) {
        this.created = created;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified", nullable = false, length = 19)
    public Date getModified() {
        return this.modified;
    }
    public void setModified(Date modified) {
        this.modified = modified;
    }
    @Column(name = "first_name")
    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Column(name = "last_name")
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Column(name = "deleted")
    public Integer getDeleted() {
        return this.deleted;
    }
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}
