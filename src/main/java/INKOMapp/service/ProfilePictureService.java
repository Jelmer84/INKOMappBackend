package INKOMapp.service;

import INKOMapp.model.ProfilePicture;
import INKOMapp.payload.ProfilePictureDto;
import INKOMapp.repository.ProfilePictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfilePictureService {

    @Autowired
    private ProfilePictureRepository profilePictureRepository;

    public void addImage(ProfilePictureDto imageDto) {

        ProfilePicture image = new ProfilePicture();
        image.setBase64String(imageDto.getBase64String());
        profilePictureRepository.save(image);
    }
}
