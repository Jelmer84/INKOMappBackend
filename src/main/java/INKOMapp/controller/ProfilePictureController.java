package INKOMapp.controller;

import INKOMapp.payload.ProfilePictureDto;
import INKOMapp.service.ProfilePictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")

@RequestMapping(value = "/api/image")
public class ProfilePictureController {

    @Autowired
    private ProfilePictureService profilePictureService;

    @PostMapping(value = "/plaatje")
    public ResponseEntity<Object> addProfilePicture(@RequestBody ProfilePictureDto imageDto) {

        profilePictureService.addImage(imageDto);
        return new ResponseEntity<>("Profile picture saved", HttpStatus.OK);
    }

}
