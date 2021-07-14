package INKOMapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student_parties")
public class StudentParty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String naam;

}

