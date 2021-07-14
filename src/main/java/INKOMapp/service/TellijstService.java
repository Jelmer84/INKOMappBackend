package INKOMapp.service;

import INKOMapp.model.Bar;
import INKOMapp.model.Event;
import INKOMapp.payload.TellijstDto;


public interface TellijstService {

    void verwerkTellijst(TellijstDto tellijstDto);
    TellijstDto getTellijst(Event event, Bar bar, int VoorOfNa);

}
