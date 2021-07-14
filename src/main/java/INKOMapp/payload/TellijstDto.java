package INKOMapp.payload;

import lombok.Data;

import java.util.List;


@Data
public class TellijstDto {

    public String nameEvent;
    public String weekday;
    public String studentParty;
    public String count; // "voortelling" of "natelling", "totaal voortelling"
    public List<KoelingDto> krattenList;
    public List<KoelingDto> flessenList;
    public List<FustDto> fustenList;
    public List<TankDto> tankDtoList;



}
