package INKOMapp.service;

import INKOMapp.model.*;
import INKOMapp.payload.FustDto;
import INKOMapp.payload.KoelingDto;
import INKOMapp.payload.TankDto;
import INKOMapp.payload.TellijstDto;
import INKOMapp.repository.ItemCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TellijstServiceImpl implements TellijstService {

    @Autowired
    ItemCountRepository itemCountRepository;

    public void verwerkTellijst(TellijstDto tellijstDto) {

//      Event event =
//      Date date =
//      Bar bar =


        //KRATTEN
        List<KoelingDto> krattenDto = tellijstDto.getKrattenList();
        for (KoelingDto koelingDto: krattenDto) {
            Koeling koeling = new Koeling(koelingDto.toString());

            ItemCounts aantalWaterRood = new ItemCounts(koeling, Beverages.WATER_ROOD, Units.CRATE, koelingDto.getWater_rood());
            itemCountRepository.save(aantalWaterRood);

            ItemCounts aantalWaterBlauw = new ItemCounts(koeling, Beverages.WATER_BLAUW, Units.CRATE, koelingDto.getWater_blauw());
            itemCountRepository.save(aantalWaterBlauw);

            ItemCounts aantalPepsi = new ItemCounts(koeling, Beverages.PEPSI, Units.CRATE, koelingDto.getPepsi());
            itemCountRepository.save(aantalPepsi);

            ItemCounts aantalPepsiMax = new ItemCounts(koeling, Beverages.PEPSI_MAX, Units.CRATE, koelingDto.getPepsi_Max());
            itemCountRepository.save(aantalPepsiMax);

            ItemCounts aantalSisi = new ItemCounts(koeling, Beverages.SISI, Units.CRATE, koelingDto.getSisi());
            itemCountRepository.save(aantalSisi);

            ItemCounts aantalIceTeaNormal = new ItemCounts(koeling, Beverages.ICE_TEA_NORMAL, Units.CRATE, koelingDto.getIce_Tea_Normal());
            itemCountRepository.save(aantalIceTeaNormal);

            ItemCounts aantalIceTeaGreen110cl = new ItemCounts(koeling, Beverages.ICE_TEA_GREEN_110CL, Units.CRATE, koelingDto.getIce_Tea_Green_110cl());
            itemCountRepository.save(aantalIceTeaGreen110cl);

            ItemCounts aantalIceTeaGreen150cl = new ItemCounts(koeling, Beverages.ICE_TEA_GREEN_150CL, Units.CRATE, koelingDto.getIce_Tea_Green_150cl());
            itemCountRepository.save(aantalIceTeaGreen150cl);

            ItemCounts aantalRedBull = new ItemCounts(koeling, Beverages.RED_BULL, Units.CRATE, koelingDto.getRed_Bull());
            itemCountRepository.save(aantalRedBull);

            ItemCounts aantalRedBullSugarFree = new ItemCounts(koeling, Beverages.RED_BULL_SUGAR_FREE, Units.CRATE, koelingDto.getRed_Bull_Sugar_Free());
            itemCountRepository.save(aantalRedBullSugarFree);

            ItemCounts aantalRedBullTropical = new ItemCounts(koeling, Beverages.RED_BULL_TROPICAL, Units.CRATE, koelingDto.getRed_Bull_Tropical());
            itemCountRepository.save(aantalRedBullTropical);

            ItemCounts aantalDesperados = new ItemCounts(koeling, Beverages.DESPERADOS, Units.CRATE, koelingDto.getDesperados());
            itemCountRepository.save(aantalDesperados);
        }

        //FLESSEN
        List<KoelingDto> flessenDto = tellijstDto.getFlessenList();
        for (KoelingDto koelingDto: flessenDto) {
            Koeling koeling = new Koeling(koelingDto.toString());

            ItemCounts aantalWaterRood = new ItemCounts(koeling, Beverages.WATER_ROOD, Units.BOTTLE, koelingDto.getWater_rood());
            itemCountRepository.save(aantalWaterRood);

            ItemCounts aantalWaterBlauw = new ItemCounts(koeling, Beverages.WATER_BLAUW, Units.BOTTLE, koelingDto.getWater_blauw());
            itemCountRepository.save(aantalWaterBlauw);

            ItemCounts aantalPepsi = new ItemCounts(koeling, Beverages.PEPSI, Units.BOTTLE, koelingDto.getPepsi());
            itemCountRepository.save(aantalPepsi);

            ItemCounts aantalPepsiMax = new ItemCounts(koeling, Beverages.PEPSI_MAX, Units.BOTTLE, koelingDto.getPepsi_Max());
            itemCountRepository.save(aantalPepsiMax);

            ItemCounts aantalSisi = new ItemCounts(koeling, Beverages.SISI, Units.BOTTLE, koelingDto.getSisi());
            itemCountRepository.save(aantalSisi);

            ItemCounts aantalIceTeaNormal = new ItemCounts(koeling, Beverages.ICE_TEA_NORMAL, Units.BOTTLE, koelingDto.getIce_Tea_Normal());
            itemCountRepository.save(aantalIceTeaNormal);

            ItemCounts aantalIceTeaGreen110cl = new ItemCounts(koeling, Beverages.ICE_TEA_GREEN_110CL, Units.BOTTLE, koelingDto.getIce_Tea_Green_110cl());
            itemCountRepository.save(aantalIceTeaGreen110cl);

            ItemCounts aantalIceTeaGreen150cl = new ItemCounts(koeling, Beverages.ICE_TEA_GREEN_150CL, Units.BOTTLE, koelingDto.getIce_Tea_Green_150cl());
            itemCountRepository.save(aantalIceTeaGreen150cl);

            ItemCounts aantalRedBull = new ItemCounts(koeling, Beverages.RED_BULL, Units.BOTTLE, koelingDto.getRed_Bull());
            itemCountRepository.save(aantalRedBull);

            ItemCounts aantalRedBullSugarFree = new ItemCounts(koeling, Beverages.RED_BULL_SUGAR_FREE, Units.BOTTLE, koelingDto.getRed_Bull_Sugar_Free());
            itemCountRepository.save(aantalRedBullSugarFree);

            ItemCounts aantalRedBullTropical = new ItemCounts(koeling, Beverages.RED_BULL_TROPICAL, Units.BOTTLE, koelingDto.getRed_Bull_Tropical());
            itemCountRepository.save(aantalRedBullTropical);

            ItemCounts aantalDesperados = new ItemCounts(koeling, Beverages.DESPERADOS, Units.BOTTLE, koelingDto.getDesperados());
            itemCountRepository.save(aantalDesperados);
        }

        //FUSTEN
        List<FustDto> fustenDto = tellijstDto.getFustenList();
        for (FustDto koelingDto: fustenDto) {

            //???????
            Koeling koeling = new Koeling(koelingDto.toString());

            ItemCounts aantalJilz = new ItemCounts(koeling, Beverages.FUST_JILZ, Units.KEG, koelingDto.getFust_Jilz());
            itemCountRepository.save(aantalJilz);

            ItemCounts aantalRadler = new ItemCounts(koeling, Beverages.FUST_RADLER, Units.KEG, koelingDto.getFust_Radler());
            itemCountRepository.save(aantalRadler);

            ItemCounts aantalPils= new ItemCounts(koeling, Beverages.FUST_PILS, Units.KEG, koelingDto.getFust_Pils());
            itemCountRepository.save(aantalPils);
        }

        //TANK
        List<TankDto> tankDto = tellijstDto.getTankDtoList();
        for (TankDto koelingDto: tankDto) {

            //???????
            Koeling koeling = new Koeling(koelingDto.toString());

            ItemCounts aantalTankbier = new ItemCounts(koeling, Beverages.TANKBIER, Units.TANK, koelingDto.getTankbier());
            itemCountRepository.save(aantalTankbier);
        }
    }


    public TellijstDto getTellijst(Event event, Bar bar, int VoorOfNa) {
        return null;
    }
}


