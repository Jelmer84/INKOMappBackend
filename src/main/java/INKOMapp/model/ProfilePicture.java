package INKOMapp.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "ProfilePictureTable")
public class ProfilePicture {

    @Id
    @GeneratedValue(
            strategy= GenerationType.AUTO,
            generator="native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    @Column(columnDefinition = "serial")
    private long id;

    @Column(columnDefinition="TEXT")
    private String base64String;

    public ProfilePicture() {}

    public void setBase64String(String base64String) {
        this.base64String = base64String;
    }

    public String getBase64String() {
        return base64String;
    }

}
