package INKOMapp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "bars")
public class Bar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @ManyToOne
    private Event event;

    @ManyToOne
    private StudentParty studentParty;

    private String status; // akkoord, niet akkoord, niet bekeken

    @OneToMany
    private List<Koeling> koelingen;


}
