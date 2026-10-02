package src.main.entity;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lastname;
    private String firstname;
    private String email;

    // Relationship with Land
    @ManyToMany(mappedBy = "users")
    private Set<Land> lands = new HashSet<>();
    public  User(){}
}
