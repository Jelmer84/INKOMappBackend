package INKOMapp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "koelingen")
public class Koeling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Koeling(){}
    public Koeling(String name){
        this.name = name;
    }

    @Column
    private String name;

//@Todo MET DEZE TWEE AAN KRIJG IK EEN ERROR. OPLOSSEN!
//    private List<ItemCounts> itemCountsVoor;
//
//    private List<ItemCounts> itemCountsNa;

}