package INKOMapp.controller;

import INKOMapp.payload.TellijstDto;
import INKOMapp.service.TellijstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TellijstController {

    @Autowired
    TellijstService tellijstService;

    //HIER WERKEN MET EVENT/STUDENTPARIJ/TELLING??

    @PostMapping(value = "/events/1/bars/4/tellijst")
    public ResponseEntity<Object> postTellijst(@RequestBody TellijstDto tellijstDto) {
        tellijstService.verwerkTellijst(tellijstDto);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/events/1/bars/4/tellijst")
    public ResponseEntity<Object> getTellijst() {
        return ResponseEntity.noContent().build();
    }

}
