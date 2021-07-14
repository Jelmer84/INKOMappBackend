package INKOMapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ItemCounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    public ItemCounts(){}
    public ItemCounts(Koeling koeling, Beverages beverage, Units unit, int aantal){
        this.koeling = koeling;
        this.beverage = beverage;
        this.unit = unit;
        this.aantal = aantal;
    }

    Beverages beverage;
    Units unit;
    int aantal;

    @ManyToOne
    Koeling koeling;
}