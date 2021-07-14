//package INKOMapp.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import javax.persistence.*;
//
//@Entity
//public class CountBeverage {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//
//    public int fridge1_crate_water_rood;
//    public int fridge1_bottle_water_rood;
//
//    public int fridge1_crate_water_blauw;
//    public int fridge1_bottle_water_blauw;
//
//    public int fridge1_crate_pepsi;
//    public int fridge1_bottle_pepsi;
//
//    public int fridge1_crate_pepsi_max;
//    public int fridge1_bottle_pepsi_max;
//
//    public int fridge1_crate_sisi;
//    public int fridge1_bottle_sisi;
//
//    public int fridge1_crate_ice_tea_normal;
//    public int fridge1_bottle_ice_tea_normal;
//
//    public int fridge1_crate_ice_tea_green_110cl;
//    public int fridge1_bottle_ice_tea_green_110cl;
//
//    public int fridge1_crate_ice_tea_green_150cl;
//    public int fridge1_bottle_ice_tea_green_150cl;
//
//    public int fridge1_crate_red_bull;
//    public int fridge1_bottle_red_bull;
//
//    public int fridge1_crate_red_bull_sugar_free;
//    public int fridge1_bottle_red_bull_sugar_free;
//
//    public int fridge1_crate_red_bull_tropical;
//    public int fridge1_bottle_red_bull_tropical;
//
//    public int fridge1_crate_desperados;
//    public int fridge1_bottle_desperados;
//
//    public int fridge1_keg_jilz;
//
//    public int fridge1_keg_radler;
//
//    public int fridge1_keg_pils;
//
//    public int fridge1_keg_tankbeer;
//
//
//    public int fridge2_crate_water_rood;
//    public int fridge2_bottle_water_rood;
//
//    public int fridge2_crate_water_blauw;
//    public int fridge2_bottle_water_blauw;
//
//    public int fridge2_crate_pepsi;
//    public int fridge2_bottle_pepsi;
//
//    public int fridge2_crate_pepsi_max;
//    public int fridge2_bottle_pepsi_max;
//
//    public int fridge2_crate_sisi;
//    public int fridge2_bottle_sisi;
//
//    public int fridge2_crate_ice_tea_normal;
//    public int fridge2_bottle_ice_tea_normal;
//
//    public int fridge2_crate_ice_tea_green_110cl;
//    public int fridge2_bottle_ice_tea_green_110cl;
//
//    public int fridge2_crate_ice_tea_green_150cl;
//    public int fridge2_bottle_ice_tea_green_150cl;
//
//    public int fridge2_crate_red_bull;
//    public int fridge2_bottle_red_bull;
//
//    public int fridge2_crate_red_bull_sugar_free;
//    public int fridge2_bottle_red_bull_sugar_free;
//
//    public int fridge2_crate_red_bull_tropical;
//    public int fridge2_bottle_red_bull_tropical;
//
//    public int fridge2_crate_desperados;
//    public int fridge2_bottle_desperados;
//
//    public int fridge2_keg_jilz;
//
//    public int fridge2_keg_radler;
//
//    public int fridge2_keg_pils;
//
//
//    public int fridge3_crate_water_rood;
//    public int fridge3_bottle_water_rood;
//
//    public int fridge3_crate_water_blauw;
//    public int fridge3_bottle_water_blauw;
//
//    public int fridge3_crate_pepsi;
//    public int fridge3_bottle_pepsi;
//
//    public int fridge3_crate_pepsi_max;
//    public int fridge3_bottle_pepsi_max;
//
//    public int fridge3_crate_sisi;
//    public int fridge3_bottle_sisi;
//
//    public int fridge3_crate_ice_tea_normal;
//    public int fridge3_bottle_ice_tea_normal;
//
//    public int fridge3_crate_ice_tea_green_110cl;
//    public int fridge3_bottle_ice_tea_green_110cl;
//
//    public int fridge3_crate_ice_tea_green_150cl;
//    public int fridge3_bottle_ice_tea_green_150cl;
//
//    public int fridge3_crate_red_bull;
//    public int fridge3_bottle_red_bull;
//
//    public int fridge3_crate_red_bull_sugar_free;
//    public int fridge3_bottle_red_bull_sugar_free;
//
//    public int fridge3_crate_red_bull_tropical;
//    public int fridge3_bottle_red_bull_tropical;
//
//    public int fridge3_crate_desperados;
//    public int fridge3_bottle_desperados;
//
//
//    public int fridge4_crate_water_rood;
//    public int fridge4_bottle_water_rood;
//
//    public int fridge4_crate_water_blauw;
//    public int fridge4_bottle_water_blauw;
//
//    public int fridge4_crate_pepsi;
//    public int fridge4_bottle_pepsi;
//
//    public int fridge4_crate_pepsi_max;
//    public int fridge4_bottle_pepsi_max;
//
//    public int fridge4_crate_sisi;
//    public int fridge4_bottle_sisi;
//
//    public int fridge4_crate_ice_tea_normal;
//    public int fridge4_bottle_ice_tea_normal;
//
//    public int fridge4_crate_ice_tea_green_110cl;
//    public int fridge4_bottle_ice_tea_green_110cl;
//
//    public int fridge4_crate_ice_tea_green_150cl;
//    public int fridge4_bottle_ice_tea_green_150cl;
//
//    public int fridge4_crate_red_bull;
//    public int fridge4_bottle_red_bull;
//
//    public int fridge4_crate_red_bull_sugar_free;
//    public int fridge4_bottle_red_bull_sugar_free;
//
//    public int fridge4_crate_red_bull_tropical;
//    public int fridge4_bottle_red_bull_tropical;
//
//    public int fridge4_crate_desperados;
//    public int fridge4_bottle_desperados;
//
//
//    public int fridge5_crate_water_rood;
//    public int fridge5_bottle_water_rood;
//
//    public int fridge5_crate_water_blauw;
//    public int fridge5_bottle_water_blauw;
//
//    public int fridge5_crate_pepsi;
//    public int fridge5_bottle_pepsi;
//
//    public int fridge5_crate_pepsi_max;
//    public int fridge5_bottle_pepsi_max;
//
//    public int fridge5_crate_sisi;
//    public int fridge5_bottle_sisi;
//
//    public int fridge5_crate_ice_tea_normal;
//    public int fridge5_bottle_ice_tea_normal;
//
//    public int fridge5_crate_ice_tea_green_110cl;
//    public int fridge5_bottle_ice_tea_green_110cl;
//
//    public int fridge5_crate_ice_tea_green_150cl;
//    public int fridge5_bottle_ice_tea_green_150cl;
//
//    public int fridge5_crate_red_bull;
//    public int fridge5_bottle_red_bull;
//
//    public int fridge5_crate_red_bull_sugar_free;
//    public int fridge5_bottle_red_bull_sugar_free;
//
//    public int fridge5_crate_red_bull_tropical;
//    public int fridge5_bottle_red_bull_tropical;
//
//    public int fridge5_crate_desperados;
//    public int fridge5_bottle_desperados;
//
//
//    public int fridge6_crate_water_rood;
//    public int fridge6_bottle_water_rood;
//
//    public int fridge6_crate_water_blauw;
//    public int fridge6_bottle_water_blauw;
//
//    public int fridge6_crate_pepsi;
//    public int fridge6_bottle_pepsi;
//
//    public int fridge6_crate_pepsi_max;
//    public int fridge6_bottle_pepsi_max;
//
//    public int fridge6_crate_sisi;
//    public int fridge6_bottle_sisi;
//
//    public int fridge6_crate_ice_tea_normal;
//    public int fridge6_bottle_ice_tea_normal;
//
//    public int fridge6_crate_ice_tea_green_110cl;
//    public int fridge6_bottle_ice_tea_green_110cl;
//
//    public int fridge6_crate_ice_tea_green_150cl;
//    public int fridge6_bottle_ice_tea_green_150cl;
//
//    public int fridge6_crate_red_bull;
//    public int fridge6_bottle_red_bull;
//
//    public int fridge6_crate_red_bull_sugar_free;
//    public int fridge6_bottle_red_bull_sugar_free;
//
//    public int fridge6_crate_red_bull_tropical;
//    public int fridge6_bottle_red_bull_tropical;
//
//    public int fridge6_crate_desperados;
//    public int fridge6_bottle_desperados;
//
//
//    public int fridge7_crate_water_rood;
//    public int fridge7_bottle_water_rood;
//
//    public int fridge7_crate_water_blauw;
//    public int fridge7_bottle_water_blauw;
//
//    public int fridge7_crate_pepsi;
//    public int fridge7_bottle_pepsi;
//
//    public int fridge7_crate_pepsi_max;
//    public int fridge7_bottle_pepsi_max;
//
//    public int fridge7_crate_sisi;
//    public int fridge7_bottle_sisi;
//
//    public int fridge7_crate_ice_tea_normal;
//    public int fridge7_bottle_ice_tea_normal;
//
//    public int fridge7_crate_ice_tea_green_110cl;
//    public int fridge7_bottle_ice_tea_green_110cl;
//
//    public int fridge7_crate_ice_tea_green_150cl;
//    public int fridge7_bottle_ice_tea_green_150cl;
//
//    public int fridge7_crate_red_bull;
//    public int fridge7_bottle_red_bull;
//
//    public int fridge7_crate_red_bull_sugar_free;
//    public int fridge7_bottle_red_bull_sugar_free;
//
//    public int fridge7_crate_red_bull_tropical;
//    public int fridge7_bottle_red_bull_tropical;
//
//    public int fridge7_crate_desperados;
//    public int fridge7_bottle_desperados;
//
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public int getFridge1_crate_water_rood() {
//        return fridge1_crate_water_rood;
//    }
//
//    public void setFridge1_crate_water_rood(int fridge1_crate_water_rood) {
//        this.fridge1_crate_water_rood = fridge1_crate_water_rood;
//    }
//
//    public int getFridge1_bottle_water_rood() {
//        return fridge1_bottle_water_rood;
//    }
//
//    public void setFridge1_bottle_water_rood(int fridge1_bottle_water_rood) {
//        this.fridge1_bottle_water_rood = fridge1_bottle_water_rood;
//    }
//
//    public int getFridge1_crate_water_blauw() {
//        return fridge1_crate_water_blauw;
//    }
//
//    public void setFridge1_crate_water_blauw(int fridge1_crate_water_blauw) {
//        this.fridge1_crate_water_blauw = fridge1_crate_water_blauw;
//    }
//
//    public int getFridge1_bottle_water_blauw() {
//        return fridge1_bottle_water_blauw;
//    }
//
//    public void setFridge1_bottle_water_blauw(int fridge1_bottle_water_blauw) {
//        this.fridge1_bottle_water_blauw = fridge1_bottle_water_blauw;
//    }
//
//    public int getFridge1_crate_pepsi() {
//        return fridge1_crate_pepsi;
//    }
//
//    public void setFridge1_crate_pepsi(int fridge1_crate_pepsi) {
//        this.fridge1_crate_pepsi = fridge1_crate_pepsi;
//    }
//
//    public int getFridge1_bottle_pepsi() {
//        return fridge1_bottle_pepsi;
//    }
//
//    public void setFridge1_bottle_pepsi(int fridge1_bottle_pepsi) {
//        this.fridge1_bottle_pepsi = fridge1_bottle_pepsi;
//    }
//
//    public int getFridge1_crate_pepsi_max() {
//        return fridge1_crate_pepsi_max;
//    }
//
//    public void setFridge1_crate_pepsi_max(int fridge1_crate_pepsi_max) {
//        this.fridge1_crate_pepsi_max = fridge1_crate_pepsi_max;
//    }
//
//    public int getFridge1_bottle_pepsi_max() {
//        return fridge1_bottle_pepsi_max;
//    }
//
//    public void setFridge1_bottle_pepsi_max(int fridge1_bottle_pepsi_max) {
//        this.fridge1_bottle_pepsi_max = fridge1_bottle_pepsi_max;
//    }
//
//    public int getFridge1_crate_sisi() {
//        return fridge1_crate_sisi;
//    }
//
//    public void setFridge1_crate_sisi(int fridge1_crate_sisi) {
//        this.fridge1_crate_sisi = fridge1_crate_sisi;
//    }
//
//    public int getFridge1_bottle_sisi() {
//        return fridge1_bottle_sisi;
//    }
//
//    public void setFridge1_bottle_sisi(int fridge1_bottle_sisi) {
//        this.fridge1_bottle_sisi = fridge1_bottle_sisi;
//    }
//
//    public int getFridge1_crate_ice_tea_normal() {
//        return fridge1_crate_ice_tea_normal;
//    }
//
//    public void setFridge1_crate_ice_tea_normal(int fridge1_crate_ice_tea_normal) {
//        this.fridge1_crate_ice_tea_normal = fridge1_crate_ice_tea_normal;
//    }
//
//    public int getFridge1_bottle_ice_tea_normal() {
//        return fridge1_bottle_ice_tea_normal;
//    }
//
//    public void setFridge1_bottle_ice_tea_normal(int fridge1_bottle_ice_tea_normal) {
//        this.fridge1_bottle_ice_tea_normal = fridge1_bottle_ice_tea_normal;
//    }
//
//    public int getFridge1_crate_ice_tea_green_110cl() {
//        return fridge1_crate_ice_tea_green_110cl;
//    }
//
//    public void setFridge1_crate_ice_tea_green_110cl(int fridge1_crate_ice_tea_green_110cl) {
//        this.fridge1_crate_ice_tea_green_110cl = fridge1_crate_ice_tea_green_110cl;
//    }
//
//    public int getFridge1_bottle_ice_tea_green_110cl() {
//        return fridge1_bottle_ice_tea_green_110cl;
//    }
//
//    public void setFridge1_bottle_ice_tea_green_110cl(int fridge1_bottle_ice_tea_green_110cl) {
//        this.fridge1_bottle_ice_tea_green_110cl = fridge1_bottle_ice_tea_green_110cl;
//    }
//
//    public int getFridge1_crate_ice_tea_green_150cl() {
//        return fridge1_crate_ice_tea_green_150cl;
//    }
//
//    public void setFridge1_crate_ice_tea_green_150cl(int fridge1_crate_ice_tea_green_150cl) {
//        this.fridge1_crate_ice_tea_green_150cl = fridge1_crate_ice_tea_green_150cl;
//    }
//
//    public int getFridge1_bottle_ice_tea_green_150cl() {
//        return fridge1_bottle_ice_tea_green_150cl;
//    }
//
//    public void setFridge1_bottle_ice_tea_green_150cl(int fridge1_bottle_ice_tea_green_150cl) {
//        this.fridge1_bottle_ice_tea_green_150cl = fridge1_bottle_ice_tea_green_150cl;
//    }
//
//    public int getFridge1_crate_red_bull() {
//        return fridge1_crate_red_bull;
//    }
//
//    public void setFridge1_crate_red_bull(int fridge1_crate_red_bull) {
//        this.fridge1_crate_red_bull = fridge1_crate_red_bull;
//    }
//
//    public int getFridge1_bottle_red_bull() {
//        return fridge1_bottle_red_bull;
//    }
//
//    public void setFridge1_bottle_red_bull(int fridge1_bottle_red_bull) {
//        this.fridge1_bottle_red_bull = fridge1_bottle_red_bull;
//    }
//
//    public int getFridge1_crate_red_bull_sugar_free() {
//        return fridge1_crate_red_bull_sugar_free;
//    }
//
//    public void setFridge1_crate_red_bull_sugar_free(int fridge1_crate_red_bull_sugar_free) {
//        this.fridge1_crate_red_bull_sugar_free = fridge1_crate_red_bull_sugar_free;
//    }
//
//    public int getFridge1_bottle_red_bull_sugar_free() {
//        return fridge1_bottle_red_bull_sugar_free;
//    }
//
//    public void setFridge1_bottle_red_bull_sugar_free(int fridge1_bottle_red_bull_sugar_free) {
//        this.fridge1_bottle_red_bull_sugar_free = fridge1_bottle_red_bull_sugar_free;
//    }
//
//    public int getFridge1_crate_red_bull_tropical() {
//        return fridge1_crate_red_bull_tropical;
//    }
//
//    public void setFridge1_crate_red_bull_tropical(int fridge1_crate_red_bull_tropical) {
//        this.fridge1_crate_red_bull_tropical = fridge1_crate_red_bull_tropical;
//    }
//
//    public int getFridge1_bottle_red_bull_tropical() {
//        return fridge1_bottle_red_bull_tropical;
//    }
//
//    public void setFridge1_bottle_red_bull_tropical(int fridge1_bottle_red_bull_tropical) {
//        this.fridge1_bottle_red_bull_tropical = fridge1_bottle_red_bull_tropical;
//    }
//
//    public int getFridge1_crate_desperados() {
//        return fridge1_crate_desperados;
//    }
//
//    public void setFridge1_crate_desperados(int fridge1_crate_desperados) {
//        this.fridge1_crate_desperados = fridge1_crate_desperados;
//    }
//
//    public int getFridge1_bottle_desperados() {
//        return fridge1_bottle_desperados;
//    }
//
//    public void setFridge1_bottle_desperados(int fridge1_bottle_desperados) {
//        this.fridge1_bottle_desperados = fridge1_bottle_desperados;
//    }
//
//    public int getFridge1_keg_jilz() {
//        return fridge1_keg_jilz;
//    }
//
//    public void setFridge1_keg_jilz(int fridge1_keg_jilz) {
//        this.fridge1_keg_jilz = fridge1_keg_jilz;
//    }
//
//    public int getFridge1_keg_radler() {
//        return fridge1_keg_radler;
//    }
//
//    public void setFridge1_keg_radler(int fridge1_keg_radler) {
//        this.fridge1_keg_radler = fridge1_keg_radler;
//    }
//
//    public int getFridge1_keg_pils() {
//        return fridge1_keg_pils;
//    }
//
//    public void setFridge1_keg_pils(int fridge1_keg_pils) {
//        this.fridge1_keg_pils = fridge1_keg_pils;
//    }
//
//    public int getFridge1_keg_tankbeer() {
//        return fridge1_keg_tankbeer;
//    }
//
//    public void setFridge1_keg_tankbeer(int fridge1_keg_tankbeer) {
//        this.fridge1_keg_tankbeer = fridge1_keg_tankbeer;
//    }
//
//    public int getFridge2_crate_water_rood() {
//        return fridge2_crate_water_rood;
//    }
//
//    public void setFridge2_crate_water_rood(int fridge2_crate_water_rood) {
//        this.fridge2_crate_water_rood = fridge2_crate_water_rood;
//    }
//
//    public int getFridge2_bottle_water_rood() {
//        return fridge2_bottle_water_rood;
//    }
//
//    public void setFridge2_bottle_water_rood(int fridge2_bottle_water_rood) {
//        this.fridge2_bottle_water_rood = fridge2_bottle_water_rood;
//    }
//
//    public int getFridge2_crate_water_blauw() {
//        return fridge2_crate_water_blauw;
//    }
//
//    public void setFridge2_crate_water_blauw(int fridge2_crate_water_blauw) {
//        this.fridge2_crate_water_blauw = fridge2_crate_water_blauw;
//    }
//
//    public int getFridge2_bottle_water_blauw() {
//        return fridge2_bottle_water_blauw;
//    }
//
//    public void setFridge2_bottle_water_blauw(int fridge2_bottle_water_blauw) {
//        this.fridge2_bottle_water_blauw = fridge2_bottle_water_blauw;
//    }
//
//    public int getFridge2_crate_pepsi() {
//        return fridge2_crate_pepsi;
//    }
//
//    public void setFridge2_crate_pepsi(int fridge2_crate_pepsi) {
//        this.fridge2_crate_pepsi = fridge2_crate_pepsi;
//    }
//
//    public int getFridge2_bottle_pepsi() {
//        return fridge2_bottle_pepsi;
//    }
//
//    public void setFridge2_bottle_pepsi(int fridge2_bottle_pepsi) {
//        this.fridge2_bottle_pepsi = fridge2_bottle_pepsi;
//    }
//
//    public int getFridge2_crate_pepsi_max() {
//        return fridge2_crate_pepsi_max;
//    }
//
//    public void setFridge2_crate_pepsi_max(int fridge2_crate_pepsi_max) {
//        this.fridge2_crate_pepsi_max = fridge2_crate_pepsi_max;
//    }
//
//    public int getFridge2_bottle_pepsi_max() {
//        return fridge2_bottle_pepsi_max;
//    }
//
//    public void setFridge2_bottle_pepsi_max(int fridge2_bottle_pepsi_max) {
//        this.fridge2_bottle_pepsi_max = fridge2_bottle_pepsi_max;
//    }
//
//    public int getFridge2_crate_sisi() {
//        return fridge2_crate_sisi;
//    }
//
//    public void setFridge2_crate_sisi(int fridge2_crate_sisi) {
//        this.fridge2_crate_sisi = fridge2_crate_sisi;
//    }
//
//    public int getFridge2_bottle_sisi() {
//        return fridge2_bottle_sisi;
//    }
//
//    public void setFridge2_bottle_sisi(int fridge2_bottle_sisi) {
//        this.fridge2_bottle_sisi = fridge2_bottle_sisi;
//    }
//
//    public int getFridge2_crate_ice_tea_normal() {
//        return fridge2_crate_ice_tea_normal;
//    }
//
//    public void setFridge2_crate_ice_tea_normal(int fridge2_crate_ice_tea_normal) {
//        this.fridge2_crate_ice_tea_normal = fridge2_crate_ice_tea_normal;
//    }
//
//    public int getFridge2_bottle_ice_tea_normal() {
//        return fridge2_bottle_ice_tea_normal;
//    }
//
//    public void setFridge2_bottle_ice_tea_normal(int fridge2_bottle_ice_tea_normal) {
//        this.fridge2_bottle_ice_tea_normal = fridge2_bottle_ice_tea_normal;
//    }
//
//    public int getFridge2_crate_ice_tea_green_110cl() {
//        return fridge2_crate_ice_tea_green_110cl;
//    }
//
//    public void setFridge2_crate_ice_tea_green_110cl(int fridge2_crate_ice_tea_green_110cl) {
//        this.fridge2_crate_ice_tea_green_110cl = fridge2_crate_ice_tea_green_110cl;
//    }
//
//    public int getFridge2_bottle_ice_tea_green_110cl() {
//        return fridge2_bottle_ice_tea_green_110cl;
//    }
//
//    public void setFridge2_bottle_ice_tea_green_110cl(int fridge2_bottle_ice_tea_green_110cl) {
//        this.fridge2_bottle_ice_tea_green_110cl = fridge2_bottle_ice_tea_green_110cl;
//    }
//
//    public int getFridge2_crate_ice_tea_green_150cl() {
//        return fridge2_crate_ice_tea_green_150cl;
//    }
//
//    public void setFridge2_crate_ice_tea_green_150cl(int fridge2_crate_ice_tea_green_150cl) {
//        this.fridge2_crate_ice_tea_green_150cl = fridge2_crate_ice_tea_green_150cl;
//    }
//
//    public int getFridge2_bottle_ice_tea_green_150cl() {
//        return fridge2_bottle_ice_tea_green_150cl;
//    }
//
//    public void setFridge2_bottle_ice_tea_green_150cl(int fridge2_bottle_ice_tea_green_150cl) {
//        this.fridge2_bottle_ice_tea_green_150cl = fridge2_bottle_ice_tea_green_150cl;
//    }
//
//    public int getFridge2_crate_red_bull() {
//        return fridge2_crate_red_bull;
//    }
//
//    public void setFridge2_crate_red_bull(int fridge2_crate_red_bull) {
//        this.fridge2_crate_red_bull = fridge2_crate_red_bull;
//    }
//
//    public int getFridge2_bottle_red_bull() {
//        return fridge2_bottle_red_bull;
//    }
//
//    public void setFridge2_bottle_red_bull(int fridge2_bottle_red_bull) {
//        this.fridge2_bottle_red_bull = fridge2_bottle_red_bull;
//    }
//
//    public int getFridge2_crate_red_bull_sugar_free() {
//        return fridge2_crate_red_bull_sugar_free;
//    }
//
//    public void setFridge2_crate_red_bull_sugar_free(int fridge2_crate_red_bull_sugar_free) {
//        this.fridge2_crate_red_bull_sugar_free = fridge2_crate_red_bull_sugar_free;
//    }
//
//    public int getFridge2_bottle_red_bull_sugar_free() {
//        return fridge2_bottle_red_bull_sugar_free;
//    }
//
//    public void setFridge2_bottle_red_bull_sugar_free(int fridge2_bottle_red_bull_sugar_free) {
//        this.fridge2_bottle_red_bull_sugar_free = fridge2_bottle_red_bull_sugar_free;
//    }
//
//    public int getFridge2_crate_red_bull_tropical() {
//        return fridge2_crate_red_bull_tropical;
//    }
//
//    public void setFridge2_crate_red_bull_tropical(int fridge2_crate_red_bull_tropical) {
//        this.fridge2_crate_red_bull_tropical = fridge2_crate_red_bull_tropical;
//    }
//
//    public int getFridge2_bottle_red_bull_tropical() {
//        return fridge2_bottle_red_bull_tropical;
//    }
//
//    public void setFridge2_bottle_red_bull_tropical(int fridge2_bottle_red_bull_tropical) {
//        this.fridge2_bottle_red_bull_tropical = fridge2_bottle_red_bull_tropical;
//    }
//
//    public int getFridge2_crate_desperados() {
//        return fridge2_crate_desperados;
//    }
//
//    public void setFridge2_crate_desperados(int fridge2_crate_desperados) {
//        this.fridge2_crate_desperados = fridge2_crate_desperados;
//    }
//
//    public int getFridge2_bottle_desperados() {
//        return fridge2_bottle_desperados;
//    }
//
//    public void setFridge2_bottle_desperados(int fridge2_bottle_desperados) {
//        this.fridge2_bottle_desperados = fridge2_bottle_desperados;
//    }
//
//    public int getFridge2_keg_jilz() {
//        return fridge2_keg_jilz;
//    }
//
//    public void setFridge2_keg_jilz(int fridge2_keg_jilz) {
//        this.fridge2_keg_jilz = fridge2_keg_jilz;
//    }
//
//    public int getFridge2_keg_radler() {
//        return fridge2_keg_radler;
//    }
//
//    public void setFridge2_keg_radler(int fridge2_keg_radler) {
//        this.fridge2_keg_radler = fridge2_keg_radler;
//    }
//
//    public int getFridge2_keg_pils() {
//        return fridge2_keg_pils;
//    }
//
//    public void setFridge2_keg_pils(int fridge2_keg_pils) {
//        this.fridge2_keg_pils = fridge2_keg_pils;
//    }
//
//    public int getFridge3_crate_water_rood() {
//        return fridge3_crate_water_rood;
//    }
//
//    public void setFridge3_crate_water_rood(int fridge3_crate_water_rood) {
//        this.fridge3_crate_water_rood = fridge3_crate_water_rood;
//    }
//
//    public int getFridge3_bottle_water_rood() {
//        return fridge3_bottle_water_rood;
//    }
//
//    public void setFridge3_bottle_water_rood(int fridge3_bottle_water_rood) {
//        this.fridge3_bottle_water_rood = fridge3_bottle_water_rood;
//    }
//
//    public int getFridge3_crate_water_blauw() {
//        return fridge3_crate_water_blauw;
//    }
//
//    public void setFridge3_crate_water_blauw(int fridge3_crate_water_blauw) {
//        this.fridge3_crate_water_blauw = fridge3_crate_water_blauw;
//    }
//
//    public int getFridge3_bottle_water_blauw() {
//        return fridge3_bottle_water_blauw;
//    }
//
//    public void setFridge3_bottle_water_blauw(int fridge3_bottle_water_blauw) {
//        this.fridge3_bottle_water_blauw = fridge3_bottle_water_blauw;
//    }
//
//    public int getFridge3_crate_pepsi() {
//        return fridge3_crate_pepsi;
//    }
//
//    public void setFridge3_crate_pepsi(int fridge3_crate_pepsi) {
//        this.fridge3_crate_pepsi = fridge3_crate_pepsi;
//    }
//
//    public int getFridge3_bottle_pepsi() {
//        return fridge3_bottle_pepsi;
//    }
//
//    public void setFridge3_bottle_pepsi(int fridge3_bottle_pepsi) {
//        this.fridge3_bottle_pepsi = fridge3_bottle_pepsi;
//    }
//
//    public int getFridge3_crate_pepsi_max() {
//        return fridge3_crate_pepsi_max;
//    }
//
//    public void setFridge3_crate_pepsi_max(int fridge3_crate_pepsi_max) {
//        this.fridge3_crate_pepsi_max = fridge3_crate_pepsi_max;
//    }
//
//    public int getFridge3_bottle_pepsi_max() {
//        return fridge3_bottle_pepsi_max;
//    }
//
//    public void setFridge3_bottle_pepsi_max(int fridge3_bottle_pepsi_max) {
//        this.fridge3_bottle_pepsi_max = fridge3_bottle_pepsi_max;
//    }
//
//    public int getFridge3_crate_sisi() {
//        return fridge3_crate_sisi;
//    }
//
//    public void setFridge3_crate_sisi(int fridge3_crate_sisi) {
//        this.fridge3_crate_sisi = fridge3_crate_sisi;
//    }
//
//    public int getFridge3_bottle_sisi() {
//        return fridge3_bottle_sisi;
//    }
//
//    public void setFridge3_bottle_sisi(int fridge3_bottle_sisi) {
//        this.fridge3_bottle_sisi = fridge3_bottle_sisi;
//    }
//
//    public int getFridge3_crate_ice_tea_normal() {
//        return fridge3_crate_ice_tea_normal;
//    }
//
//    public void setFridge3_crate_ice_tea_normal(int fridge3_crate_ice_tea_normal) {
//        this.fridge3_crate_ice_tea_normal = fridge3_crate_ice_tea_normal;
//    }
//
//    public int getFridge3_bottle_ice_tea_normal() {
//        return fridge3_bottle_ice_tea_normal;
//    }
//
//    public void setFridge3_bottle_ice_tea_normal(int fridge3_bottle_ice_tea_normal) {
//        this.fridge3_bottle_ice_tea_normal = fridge3_bottle_ice_tea_normal;
//    }
//
//    public int getFridge3_crate_ice_tea_green_110cl() {
//        return fridge3_crate_ice_tea_green_110cl;
//    }
//
//    public void setFridge3_crate_ice_tea_green_110cl(int fridge3_crate_ice_tea_green_110cl) {
//        this.fridge3_crate_ice_tea_green_110cl = fridge3_crate_ice_tea_green_110cl;
//    }
//
//    public int getFridge3_bottle_ice_tea_green_110cl() {
//        return fridge3_bottle_ice_tea_green_110cl;
//    }
//
//    public void setFridge3_bottle_ice_tea_green_110cl(int fridge3_bottle_ice_tea_green_110cl) {
//        this.fridge3_bottle_ice_tea_green_110cl = fridge3_bottle_ice_tea_green_110cl;
//    }
//
//    public int getFridge3_crate_ice_tea_green_150cl() {
//        return fridge3_crate_ice_tea_green_150cl;
//    }
//
//    public void setFridge3_crate_ice_tea_green_150cl(int fridge3_crate_ice_tea_green_150cl) {
//        this.fridge3_crate_ice_tea_green_150cl = fridge3_crate_ice_tea_green_150cl;
//    }
//
//    public int getFridge3_bottle_ice_tea_green_150cl() {
//        return fridge3_bottle_ice_tea_green_150cl;
//    }
//
//    public void setFridge3_bottle_ice_tea_green_150cl(int fridge3_bottle_ice_tea_green_150cl) {
//        this.fridge3_bottle_ice_tea_green_150cl = fridge3_bottle_ice_tea_green_150cl;
//    }
//
//    public int getFridge3_crate_red_bull() {
//        return fridge3_crate_red_bull;
//    }
//
//    public void setFridge3_crate_red_bull(int fridge3_crate_red_bull) {
//        this.fridge3_crate_red_bull = fridge3_crate_red_bull;
//    }
//
//    public int getFridge3_bottle_red_bull() {
//        return fridge3_bottle_red_bull;
//    }
//
//    public void setFridge3_bottle_red_bull(int fridge3_bottle_red_bull) {
//        this.fridge3_bottle_red_bull = fridge3_bottle_red_bull;
//    }
//
//    public int getFridge3_crate_red_bull_sugar_free() {
//        return fridge3_crate_red_bull_sugar_free;
//    }
//
//    public void setFridge3_crate_red_bull_sugar_free(int fridge3_crate_red_bull_sugar_free) {
//        this.fridge3_crate_red_bull_sugar_free = fridge3_crate_red_bull_sugar_free;
//    }
//
//    public int getFridge3_bottle_red_bull_sugar_free() {
//        return fridge3_bottle_red_bull_sugar_free;
//    }
//
//    public void setFridge3_bottle_red_bull_sugar_free(int fridge3_bottle_red_bull_sugar_free) {
//        this.fridge3_bottle_red_bull_sugar_free = fridge3_bottle_red_bull_sugar_free;
//    }
//
//    public int getFridge3_crate_red_bull_tropical() {
//        return fridge3_crate_red_bull_tropical;
//    }
//
//    public void setFridge3_crate_red_bull_tropical(int fridge3_crate_red_bull_tropical) {
//        this.fridge3_crate_red_bull_tropical = fridge3_crate_red_bull_tropical;
//    }
//
//    public int getFridge3_bottle_red_bull_tropical() {
//        return fridge3_bottle_red_bull_tropical;
//    }
//
//    public void setFridge3_bottle_red_bull_tropical(int fridge3_bottle_red_bull_tropical) {
//        this.fridge3_bottle_red_bull_tropical = fridge3_bottle_red_bull_tropical;
//    }
//
//    public int getFridge3_crate_desperados() {
//        return fridge3_crate_desperados;
//    }
//
//    public void setFridge3_crate_desperados(int fridge3_crate_desperados) {
//        this.fridge3_crate_desperados = fridge3_crate_desperados;
//    }
//
//    public int getFridge3_bottle_desperados() {
//        return fridge3_bottle_desperados;
//    }
//
//    public void setFridge3_bottle_desperados(int fridge3_bottle_desperados) {
//        this.fridge3_bottle_desperados = fridge3_bottle_desperados;
//    }
//
//    public int getFridge4_crate_water_rood() {
//        return fridge4_crate_water_rood;
//    }
//
//    public void setFridge4_crate_water_rood(int fridge4_crate_water_rood) {
//        this.fridge4_crate_water_rood = fridge4_crate_water_rood;
//    }
//
//    public int getFridge4_bottle_water_rood() {
//        return fridge4_bottle_water_rood;
//    }
//
//    public void setFridge4_bottle_water_rood(int fridge4_bottle_water_rood) {
//        this.fridge4_bottle_water_rood = fridge4_bottle_water_rood;
//    }
//
//    public int getFridge4_crate_water_blauw() {
//        return fridge4_crate_water_blauw;
//    }
//
//    public void setFridge4_crate_water_blauw(int fridge4_crate_water_blauw) {
//        this.fridge4_crate_water_blauw = fridge4_crate_water_blauw;
//    }
//
//    public int getFridge4_bottle_water_blauw() {
//        return fridge4_bottle_water_blauw;
//    }
//
//    public void setFridge4_bottle_water_blauw(int fridge4_bottle_water_blauw) {
//        this.fridge4_bottle_water_blauw = fridge4_bottle_water_blauw;
//    }
//
//    public int getFridge4_crate_pepsi() {
//        return fridge4_crate_pepsi;
//    }
//
//    public void setFridge4_crate_pepsi(int fridge4_crate_pepsi) {
//        this.fridge4_crate_pepsi = fridge4_crate_pepsi;
//    }
//
//    public int getFridge4_bottle_pepsi() {
//        return fridge4_bottle_pepsi;
//    }
//
//    public void setFridge4_bottle_pepsi(int fridge4_bottle_pepsi) {
//        this.fridge4_bottle_pepsi = fridge4_bottle_pepsi;
//    }
//
//    public int getFridge4_crate_pepsi_max() {
//        return fridge4_crate_pepsi_max;
//    }
//
//    public void setFridge4_crate_pepsi_max(int fridge4_crate_pepsi_max) {
//        this.fridge4_crate_pepsi_max = fridge4_crate_pepsi_max;
//    }
//
//    public int getFridge4_bottle_pepsi_max() {
//        return fridge4_bottle_pepsi_max;
//    }
//
//    public void setFridge4_bottle_pepsi_max(int fridge4_bottle_pepsi_max) {
//        this.fridge4_bottle_pepsi_max = fridge4_bottle_pepsi_max;
//    }
//
//    public int getFridge4_crate_sisi() {
//        return fridge4_crate_sisi;
//    }
//
//    public void setFridge4_crate_sisi(int fridge4_crate_sisi) {
//        this.fridge4_crate_sisi = fridge4_crate_sisi;
//    }
//
//    public int getFridge4_bottle_sisi() {
//        return fridge4_bottle_sisi;
//    }
//
//    public void setFridge4_bottle_sisi(int fridge4_bottle_sisi) {
//        this.fridge4_bottle_sisi = fridge4_bottle_sisi;
//    }
//
//    public int getFridge4_crate_ice_tea_normal() {
//        return fridge4_crate_ice_tea_normal;
//    }
//
//    public void setFridge4_crate_ice_tea_normal(int fridge4_crate_ice_tea_normal) {
//        this.fridge4_crate_ice_tea_normal = fridge4_crate_ice_tea_normal;
//    }
//
//    public int getFridge4_bottle_ice_tea_normal() {
//        return fridge4_bottle_ice_tea_normal;
//    }
//
//    public void setFridge4_bottle_ice_tea_normal(int fridge4_bottle_ice_tea_normal) {
//        this.fridge4_bottle_ice_tea_normal = fridge4_bottle_ice_tea_normal;
//    }
//
//    public int getFridge4_crate_ice_tea_green_110cl() {
//        return fridge4_crate_ice_tea_green_110cl;
//    }
//
//    public void setFridge4_crate_ice_tea_green_110cl(int fridge4_crate_ice_tea_green_110cl) {
//        this.fridge4_crate_ice_tea_green_110cl = fridge4_crate_ice_tea_green_110cl;
//    }
//
//    public int getFridge4_bottle_ice_tea_green_110cl() {
//        return fridge4_bottle_ice_tea_green_110cl;
//    }
//
//    public void setFridge4_bottle_ice_tea_green_110cl(int fridge4_bottle_ice_tea_green_110cl) {
//        this.fridge4_bottle_ice_tea_green_110cl = fridge4_bottle_ice_tea_green_110cl;
//    }
//
//    public int getFridge4_crate_ice_tea_green_150cl() {
//        return fridge4_crate_ice_tea_green_150cl;
//    }
//
//    public void setFridge4_crate_ice_tea_green_150cl(int fridge4_crate_ice_tea_green_150cl) {
//        this.fridge4_crate_ice_tea_green_150cl = fridge4_crate_ice_tea_green_150cl;
//    }
//
//    public int getFridge4_bottle_ice_tea_green_150cl() {
//        return fridge4_bottle_ice_tea_green_150cl;
//    }
//
//    public void setFridge4_bottle_ice_tea_green_150cl(int fridge4_bottle_ice_tea_green_150cl) {
//        this.fridge4_bottle_ice_tea_green_150cl = fridge4_bottle_ice_tea_green_150cl;
//    }
//
//    public int getFridge4_crate_red_bull() {
//        return fridge4_crate_red_bull;
//    }
//
//    public void setFridge4_crate_red_bull(int fridge4_crate_red_bull) {
//        this.fridge4_crate_red_bull = fridge4_crate_red_bull;
//    }
//
//    public int getFridge4_bottle_red_bull() {
//        return fridge4_bottle_red_bull;
//    }
//
//    public void setFridge4_bottle_red_bull(int fridge4_bottle_red_bull) {
//        this.fridge4_bottle_red_bull = fridge4_bottle_red_bull;
//    }
//
//    public int getFridge4_crate_red_bull_sugar_free() {
//        return fridge4_crate_red_bull_sugar_free;
//    }
//
//    public void setFridge4_crate_red_bull_sugar_free(int fridge4_crate_red_bull_sugar_free) {
//        this.fridge4_crate_red_bull_sugar_free = fridge4_crate_red_bull_sugar_free;
//    }
//
//    public int getFridge4_bottle_red_bull_sugar_free() {
//        return fridge4_bottle_red_bull_sugar_free;
//    }
//
//    public void setFridge4_bottle_red_bull_sugar_free(int fridge4_bottle_red_bull_sugar_free) {
//        this.fridge4_bottle_red_bull_sugar_free = fridge4_bottle_red_bull_sugar_free;
//    }
//
//    public int getFridge4_crate_red_bull_tropical() {
//        return fridge4_crate_red_bull_tropical;
//    }
//
//    public void setFridge4_crate_red_bull_tropical(int fridge4_crate_red_bull_tropical) {
//        this.fridge4_crate_red_bull_tropical = fridge4_crate_red_bull_tropical;
//    }
//
//    public int getFridge4_bottle_red_bull_tropical() {
//        return fridge4_bottle_red_bull_tropical;
//    }
//
//    public void setFridge4_bottle_red_bull_tropical(int fridge4_bottle_red_bull_tropical) {
//        this.fridge4_bottle_red_bull_tropical = fridge4_bottle_red_bull_tropical;
//    }
//
//    public int getFridge4_crate_desperados() {
//        return fridge4_crate_desperados;
//    }
//
//    public void setFridge4_crate_desperados(int fridge4_crate_desperados) {
//        this.fridge4_crate_desperados = fridge4_crate_desperados;
//    }
//
//    public int getFridge4_bottle_desperados() {
//        return fridge4_bottle_desperados;
//    }
//
//    public void setFridge4_bottle_desperados(int fridge4_bottle_desperados) {
//        this.fridge4_bottle_desperados = fridge4_bottle_desperados;
//    }
//
//    public int getFridge5_crate_water_rood() {
//        return fridge5_crate_water_rood;
//    }
//
//    public void setFridge5_crate_water_rood(int fridge5_crate_water_rood) {
//        this.fridge5_crate_water_rood = fridge5_crate_water_rood;
//    }
//
//    public int getFridge5_bottle_water_rood() {
//        return fridge5_bottle_water_rood;
//    }
//
//    public void setFridge5_bottle_water_rood(int fridge5_bottle_water_rood) {
//        this.fridge5_bottle_water_rood = fridge5_bottle_water_rood;
//    }
//
//    public int getFridge5_crate_water_blauw() {
//        return fridge5_crate_water_blauw;
//    }
//
//    public void setFridge5_crate_water_blauw(int fridge5_crate_water_blauw) {
//        this.fridge5_crate_water_blauw = fridge5_crate_water_blauw;
//    }
//
//    public int getFridge5_bottle_water_blauw() {
//        return fridge5_bottle_water_blauw;
//    }
//
//    public void setFridge5_bottle_water_blauw(int fridge5_bottle_water_blauw) {
//        this.fridge5_bottle_water_blauw = fridge5_bottle_water_blauw;
//    }
//
//    public int getFridge5_crate_pepsi() {
//        return fridge5_crate_pepsi;
//    }
//
//    public void setFridge5_crate_pepsi(int fridge5_crate_pepsi) {
//        this.fridge5_crate_pepsi = fridge5_crate_pepsi;
//    }
//
//    public int getFridge5_bottle_pepsi() {
//        return fridge5_bottle_pepsi;
//    }
//
//    public void setFridge5_bottle_pepsi(int fridge5_bottle_pepsi) {
//        this.fridge5_bottle_pepsi = fridge5_bottle_pepsi;
//    }
//
//    public int getFridge5_crate_pepsi_max() {
//        return fridge5_crate_pepsi_max;
//    }
//
//    public void setFridge5_crate_pepsi_max(int fridge5_crate_pepsi_max) {
//        this.fridge5_crate_pepsi_max = fridge5_crate_pepsi_max;
//    }
//
//    public int getFridge5_bottle_pepsi_max() {
//        return fridge5_bottle_pepsi_max;
//    }
//
//    public void setFridge5_bottle_pepsi_max(int fridge5_bottle_pepsi_max) {
//        this.fridge5_bottle_pepsi_max = fridge5_bottle_pepsi_max;
//    }
//
//    public int getFridge5_crate_sisi() {
//        return fridge5_crate_sisi;
//    }
//
//    public void setFridge5_crate_sisi(int fridge5_crate_sisi) {
//        this.fridge5_crate_sisi = fridge5_crate_sisi;
//    }
//
//    public int getFridge5_bottle_sisi() {
//        return fridge5_bottle_sisi;
//    }
//
//    public void setFridge5_bottle_sisi(int fridge5_bottle_sisi) {
//        this.fridge5_bottle_sisi = fridge5_bottle_sisi;
//    }
//
//    public int getFridge5_crate_ice_tea_normal() {
//        return fridge5_crate_ice_tea_normal;
//    }
//
//    public void setFridge5_crate_ice_tea_normal(int fridge5_crate_ice_tea_normal) {
//        this.fridge5_crate_ice_tea_normal = fridge5_crate_ice_tea_normal;
//    }
//
//    public int getFridge5_bottle_ice_tea_normal() {
//        return fridge5_bottle_ice_tea_normal;
//    }
//
//    public void setFridge5_bottle_ice_tea_normal(int fridge5_bottle_ice_tea_normal) {
//        this.fridge5_bottle_ice_tea_normal = fridge5_bottle_ice_tea_normal;
//    }
//
//    public int getFridge5_crate_ice_tea_green_110cl() {
//        return fridge5_crate_ice_tea_green_110cl;
//    }
//
//    public void setFridge5_crate_ice_tea_green_110cl(int fridge5_crate_ice_tea_green_110cl) {
//        this.fridge5_crate_ice_tea_green_110cl = fridge5_crate_ice_tea_green_110cl;
//    }
//
//    public int getFridge5_bottle_ice_tea_green_110cl() {
//        return fridge5_bottle_ice_tea_green_110cl;
//    }
//
//    public void setFridge5_bottle_ice_tea_green_110cl(int fridge5_bottle_ice_tea_green_110cl) {
//        this.fridge5_bottle_ice_tea_green_110cl = fridge5_bottle_ice_tea_green_110cl;
//    }
//
//    public int getFridge5_crate_ice_tea_green_150cl() {
//        return fridge5_crate_ice_tea_green_150cl;
//    }
//
//    public void setFridge5_crate_ice_tea_green_150cl(int fridge5_crate_ice_tea_green_150cl) {
//        this.fridge5_crate_ice_tea_green_150cl = fridge5_crate_ice_tea_green_150cl;
//    }
//
//    public int getFridge5_bottle_ice_tea_green_150cl() {
//        return fridge5_bottle_ice_tea_green_150cl;
//    }
//
//    public void setFridge5_bottle_ice_tea_green_150cl(int fridge5_bottle_ice_tea_green_150cl) {
//        this.fridge5_bottle_ice_tea_green_150cl = fridge5_bottle_ice_tea_green_150cl;
//    }
//
//    public int getFridge5_crate_red_bull() {
//        return fridge5_crate_red_bull;
//    }
//
//    public void setFridge5_crate_red_bull(int fridge5_crate_red_bull) {
//        this.fridge5_crate_red_bull = fridge5_crate_red_bull;
//    }
//
//    public int getFridge5_bottle_red_bull() {
//        return fridge5_bottle_red_bull;
//    }
//
//    public void setFridge5_bottle_red_bull(int fridge5_bottle_red_bull) {
//        this.fridge5_bottle_red_bull = fridge5_bottle_red_bull;
//    }
//
//    public int getFridge5_crate_red_bull_sugar_free() {
//        return fridge5_crate_red_bull_sugar_free;
//    }
//
//    public void setFridge5_crate_red_bull_sugar_free(int fridge5_crate_red_bull_sugar_free) {
//        this.fridge5_crate_red_bull_sugar_free = fridge5_crate_red_bull_sugar_free;
//    }
//
//    public int getFridge5_bottle_red_bull_sugar_free() {
//        return fridge5_bottle_red_bull_sugar_free;
//    }
//
//    public void setFridge5_bottle_red_bull_sugar_free(int fridge5_bottle_red_bull_sugar_free) {
//        this.fridge5_bottle_red_bull_sugar_free = fridge5_bottle_red_bull_sugar_free;
//    }
//
//    public int getFridge5_crate_red_bull_tropical() {
//        return fridge5_crate_red_bull_tropical;
//    }
//
//    public void setFridge5_crate_red_bull_tropical(int fridge5_crate_red_bull_tropical) {
//        this.fridge5_crate_red_bull_tropical = fridge5_crate_red_bull_tropical;
//    }
//
//    public int getFridge5_bottle_red_bull_tropical() {
//        return fridge5_bottle_red_bull_tropical;
//    }
//
//    public void setFridge5_bottle_red_bull_tropical(int fridge5_bottle_red_bull_tropical) {
//        this.fridge5_bottle_red_bull_tropical = fridge5_bottle_red_bull_tropical;
//    }
//
//    public int getFridge5_crate_desperados() {
//        return fridge5_crate_desperados;
//    }
//
//    public void setFridge5_crate_desperados(int fridge5_crate_desperados) {
//        this.fridge5_crate_desperados = fridge5_crate_desperados;
//    }
//
//    public int getFridge5_bottle_desperados() {
//        return fridge5_bottle_desperados;
//    }
//
//    public void setFridge5_bottle_desperados(int fridge5_bottle_desperados) {
//        this.fridge5_bottle_desperados = fridge5_bottle_desperados;
//    }
//
//    public int getFridge6_crate_water_rood() {
//        return fridge6_crate_water_rood;
//    }
//
//    public void setFridge6_crate_water_rood(int fridge6_crate_water_rood) {
//        this.fridge6_crate_water_rood = fridge6_crate_water_rood;
//    }
//
//    public int getFridge6_bottle_water_rood() {
//        return fridge6_bottle_water_rood;
//    }
//
//    public void setFridge6_bottle_water_rood(int fridge6_bottle_water_rood) {
//        this.fridge6_bottle_water_rood = fridge6_bottle_water_rood;
//    }
//
//    public int getFridge6_crate_water_blauw() {
//        return fridge6_crate_water_blauw;
//    }
//
//    public void setFridge6_crate_water_blauw(int fridge6_crate_water_blauw) {
//        this.fridge6_crate_water_blauw = fridge6_crate_water_blauw;
//    }
//
//    public int getFridge6_bottle_water_blauw() {
//        return fridge6_bottle_water_blauw;
//    }
//
//    public void setFridge6_bottle_water_blauw(int fridge6_bottle_water_blauw) {
//        this.fridge6_bottle_water_blauw = fridge6_bottle_water_blauw;
//    }
//
//    public int getFridge6_crate_pepsi() {
//        return fridge6_crate_pepsi;
//    }
//
//    public void setFridge6_crate_pepsi(int fridge6_crate_pepsi) {
//        this.fridge6_crate_pepsi = fridge6_crate_pepsi;
//    }
//
//    public int getFridge6_bottle_pepsi() {
//        return fridge6_bottle_pepsi;
//    }
//
//    public void setFridge6_bottle_pepsi(int fridge6_bottle_pepsi) {
//        this.fridge6_bottle_pepsi = fridge6_bottle_pepsi;
//    }
//
//    public int getFridge6_crate_pepsi_max() {
//        return fridge6_crate_pepsi_max;
//    }
//
//    public void setFridge6_crate_pepsi_max(int fridge6_crate_pepsi_max) {
//        this.fridge6_crate_pepsi_max = fridge6_crate_pepsi_max;
//    }
//
//    public int getFridge6_bottle_pepsi_max() {
//        return fridge6_bottle_pepsi_max;
//    }
//
//    public void setFridge6_bottle_pepsi_max(int fridge6_bottle_pepsi_max) {
//        this.fridge6_bottle_pepsi_max = fridge6_bottle_pepsi_max;
//    }
//
//    public int getFridge6_crate_sisi() {
//        return fridge6_crate_sisi;
//    }
//
//    public void setFridge6_crate_sisi(int fridge6_crate_sisi) {
//        this.fridge6_crate_sisi = fridge6_crate_sisi;
//    }
//
//    public int getFridge6_bottle_sisi() {
//        return fridge6_bottle_sisi;
//    }
//
//    public void setFridge6_bottle_sisi(int fridge6_bottle_sisi) {
//        this.fridge6_bottle_sisi = fridge6_bottle_sisi;
//    }
//
//    public int getFridge6_crate_ice_tea_normal() {
//        return fridge6_crate_ice_tea_normal;
//    }
//
//    public void setFridge6_crate_ice_tea_normal(int fridge6_crate_ice_tea_normal) {
//        this.fridge6_crate_ice_tea_normal = fridge6_crate_ice_tea_normal;
//    }
//
//    public int getFridge6_bottle_ice_tea_normal() {
//        return fridge6_bottle_ice_tea_normal;
//    }
//
//    public void setFridge6_bottle_ice_tea_normal(int fridge6_bottle_ice_tea_normal) {
//        this.fridge6_bottle_ice_tea_normal = fridge6_bottle_ice_tea_normal;
//    }
//
//    public int getFridge6_crate_ice_tea_green_110cl() {
//        return fridge6_crate_ice_tea_green_110cl;
//    }
//
//    public void setFridge6_crate_ice_tea_green_110cl(int fridge6_crate_ice_tea_green_110cl) {
//        this.fridge6_crate_ice_tea_green_110cl = fridge6_crate_ice_tea_green_110cl;
//    }
//
//    public int getFridge6_bottle_ice_tea_green_110cl() {
//        return fridge6_bottle_ice_tea_green_110cl;
//    }
//
//    public void setFridge6_bottle_ice_tea_green_110cl(int fridge6_bottle_ice_tea_green_110cl) {
//        this.fridge6_bottle_ice_tea_green_110cl = fridge6_bottle_ice_tea_green_110cl;
//    }
//
//    public int getFridge6_crate_ice_tea_green_150cl() {
//        return fridge6_crate_ice_tea_green_150cl;
//    }
//
//    public void setFridge6_crate_ice_tea_green_150cl(int fridge6_crate_ice_tea_green_150cl) {
//        this.fridge6_crate_ice_tea_green_150cl = fridge6_crate_ice_tea_green_150cl;
//    }
//
//    public int getFridge6_bottle_ice_tea_green_150cl() {
//        return fridge6_bottle_ice_tea_green_150cl;
//    }
//
//    public void setFridge6_bottle_ice_tea_green_150cl(int fridge6_bottle_ice_tea_green_150cl) {
//        this.fridge6_bottle_ice_tea_green_150cl = fridge6_bottle_ice_tea_green_150cl;
//    }
//
//    public int getFridge6_crate_red_bull() {
//        return fridge6_crate_red_bull;
//    }
//
//    public void setFridge6_crate_red_bull(int fridge6_crate_red_bull) {
//        this.fridge6_crate_red_bull = fridge6_crate_red_bull;
//    }
//
//    public int getFridge6_bottle_red_bull() {
//        return fridge6_bottle_red_bull;
//    }
//
//    public void setFridge6_bottle_red_bull(int fridge6_bottle_red_bull) {
//        this.fridge6_bottle_red_bull = fridge6_bottle_red_bull;
//    }
//
//    public int getFridge6_crate_red_bull_sugar_free() {
//        return fridge6_crate_red_bull_sugar_free;
//    }
//
//    public void setFridge6_crate_red_bull_sugar_free(int fridge6_crate_red_bull_sugar_free) {
//        this.fridge6_crate_red_bull_sugar_free = fridge6_crate_red_bull_sugar_free;
//    }
//
//    public int getFridge6_bottle_red_bull_sugar_free() {
//        return fridge6_bottle_red_bull_sugar_free;
//    }
//
//    public void setFridge6_bottle_red_bull_sugar_free(int fridge6_bottle_red_bull_sugar_free) {
//        this.fridge6_bottle_red_bull_sugar_free = fridge6_bottle_red_bull_sugar_free;
//    }
//
//    public int getFridge6_crate_red_bull_tropical() {
//        return fridge6_crate_red_bull_tropical;
//    }
//
//    public void setFridge6_crate_red_bull_tropical(int fridge6_crate_red_bull_tropical) {
//        this.fridge6_crate_red_bull_tropical = fridge6_crate_red_bull_tropical;
//    }
//
//    public int getFridge6_bottle_red_bull_tropical() {
//        return fridge6_bottle_red_bull_tropical;
//    }
//
//    public void setFridge6_bottle_red_bull_tropical(int fridge6_bottle_red_bull_tropical) {
//        this.fridge6_bottle_red_bull_tropical = fridge6_bottle_red_bull_tropical;
//    }
//
//    public int getFridge6_crate_desperados() {
//        return fridge6_crate_desperados;
//    }
//
//    public void setFridge6_crate_desperados(int fridge6_crate_desperados) {
//        this.fridge6_crate_desperados = fridge6_crate_desperados;
//    }
//
//    public int getFridge6_bottle_desperados() {
//        return fridge6_bottle_desperados;
//    }
//
//    public void setFridge6_bottle_desperados(int fridge6_bottle_desperados) {
//        this.fridge6_bottle_desperados = fridge6_bottle_desperados;
//    }
//
//    public int getFridge7_crate_water_rood() {
//        return fridge7_crate_water_rood;
//    }
//
//    public void setFridge7_crate_water_rood(int fridge7_crate_water_rood) {
//        this.fridge7_crate_water_rood = fridge7_crate_water_rood;
//    }
//
//    public int getFridge7_bottle_water_rood() {
//        return fridge7_bottle_water_rood;
//    }
//
//    public void setFridge7_bottle_water_rood(int fridge7_bottle_water_rood) {
//        this.fridge7_bottle_water_rood = fridge7_bottle_water_rood;
//    }
//
//    public int getFridge7_crate_water_blauw() {
//        return fridge7_crate_water_blauw;
//    }
//
//    public void setFridge7_crate_water_blauw(int fridge7_crate_water_blauw) {
//        this.fridge7_crate_water_blauw = fridge7_crate_water_blauw;
//    }
//
//    public int getFridge7_bottle_water_blauw() {
//        return fridge7_bottle_water_blauw;
//    }
//
//    public void setFridge7_bottle_water_blauw(int fridge7_bottle_water_blauw) {
//        this.fridge7_bottle_water_blauw = fridge7_bottle_water_blauw;
//    }
//
//    public int getFridge7_crate_pepsi() {
//        return fridge7_crate_pepsi;
//    }
//
//    public void setFridge7_crate_pepsi(int fridge7_crate_pepsi) {
//        this.fridge7_crate_pepsi = fridge7_crate_pepsi;
//    }
//
//    public int getFridge7_bottle_pepsi() {
//        return fridge7_bottle_pepsi;
//    }
//
//    public void setFridge7_bottle_pepsi(int fridge7_bottle_pepsi) {
//        this.fridge7_bottle_pepsi = fridge7_bottle_pepsi;
//    }
//
//    public int getFridge7_crate_pepsi_max() {
//        return fridge7_crate_pepsi_max;
//    }
//
//    public void setFridge7_crate_pepsi_max(int fridge7_crate_pepsi_max) {
//        this.fridge7_crate_pepsi_max = fridge7_crate_pepsi_max;
//    }
//
//    public int getFridge7_bottle_pepsi_max() {
//        return fridge7_bottle_pepsi_max;
//    }
//
//    public void setFridge7_bottle_pepsi_max(int fridge7_bottle_pepsi_max) {
//        this.fridge7_bottle_pepsi_max = fridge7_bottle_pepsi_max;
//    }
//
//    public int getFridge7_crate_sisi() {
//        return fridge7_crate_sisi;
//    }
//
//    public void setFridge7_crate_sisi(int fridge7_crate_sisi) {
//        this.fridge7_crate_sisi = fridge7_crate_sisi;
//    }
//
//    public int getFridge7_bottle_sisi() {
//        return fridge7_bottle_sisi;
//    }
//
//    public void setFridge7_bottle_sisi(int fridge7_bottle_sisi) {
//        this.fridge7_bottle_sisi = fridge7_bottle_sisi;
//    }
//
//    public int getFridge7_crate_ice_tea_normal() {
//        return fridge7_crate_ice_tea_normal;
//    }
//
//    public void setFridge7_crate_ice_tea_normal(int fridge7_crate_ice_tea_normal) {
//        this.fridge7_crate_ice_tea_normal = fridge7_crate_ice_tea_normal;
//    }
//
//    public int getFridge7_bottle_ice_tea_normal() {
//        return fridge7_bottle_ice_tea_normal;
//    }
//
//    public void setFridge7_bottle_ice_tea_normal(int fridge7_bottle_ice_tea_normal) {
//        this.fridge7_bottle_ice_tea_normal = fridge7_bottle_ice_tea_normal;
//    }
//
//    public int getFridge7_crate_ice_tea_green_110cl() {
//        return fridge7_crate_ice_tea_green_110cl;
//    }
//
//    public void setFridge7_crate_ice_tea_green_110cl(int fridge7_crate_ice_tea_green_110cl) {
//        this.fridge7_crate_ice_tea_green_110cl = fridge7_crate_ice_tea_green_110cl;
//    }
//
//    public int getFridge7_bottle_ice_tea_green_110cl() {
//        return fridge7_bottle_ice_tea_green_110cl;
//    }
//
//    public void setFridge7_bottle_ice_tea_green_110cl(int fridge7_bottle_ice_tea_green_110cl) {
//        this.fridge7_bottle_ice_tea_green_110cl = fridge7_bottle_ice_tea_green_110cl;
//    }
//
//    public int getFridge7_crate_ice_tea_green_150cl() {
//        return fridge7_crate_ice_tea_green_150cl;
//    }
//
//    public void setFridge7_crate_ice_tea_green_150cl(int fridge7_crate_ice_tea_green_150cl) {
//        this.fridge7_crate_ice_tea_green_150cl = fridge7_crate_ice_tea_green_150cl;
//    }
//
//    public int getFridge7_bottle_ice_tea_green_150cl() {
//        return fridge7_bottle_ice_tea_green_150cl;
//    }
//
//    public void setFridge7_bottle_ice_tea_green_150cl(int fridge7_bottle_ice_tea_green_150cl) {
//        this.fridge7_bottle_ice_tea_green_150cl = fridge7_bottle_ice_tea_green_150cl;
//    }
//
//    public int getFridge7_crate_red_bull() {
//        return fridge7_crate_red_bull;
//    }
//
//    public void setFridge7_crate_red_bull(int fridge7_crate_red_bull) {
//        this.fridge7_crate_red_bull = fridge7_crate_red_bull;
//    }
//
//    public int getFridge7_bottle_red_bull() {
//        return fridge7_bottle_red_bull;
//    }
//
//    public void setFridge7_bottle_red_bull(int fridge7_bottle_red_bull) {
//        this.fridge7_bottle_red_bull = fridge7_bottle_red_bull;
//    }
//
//    public int getFridge7_crate_red_bull_sugar_free() {
//        return fridge7_crate_red_bull_sugar_free;
//    }
//
//    public void setFridge7_crate_red_bull_sugar_free(int fridge7_crate_red_bull_sugar_free) {
//        this.fridge7_crate_red_bull_sugar_free = fridge7_crate_red_bull_sugar_free;
//    }
//
//    public int getFridge7_bottle_red_bull_sugar_free() {
//        return fridge7_bottle_red_bull_sugar_free;
//    }
//
//    public void setFridge7_bottle_red_bull_sugar_free(int fridge7_bottle_red_bull_sugar_free) {
//        this.fridge7_bottle_red_bull_sugar_free = fridge7_bottle_red_bull_sugar_free;
//    }
//
//    public int getFridge7_crate_red_bull_tropical() {
//        return fridge7_crate_red_bull_tropical;
//    }
//
//    public void setFridge7_crate_red_bull_tropical(int fridge7_crate_red_bull_tropical) {
//        this.fridge7_crate_red_bull_tropical = fridge7_crate_red_bull_tropical;
//    }
//
//    public int getFridge7_bottle_red_bull_tropical() {
//        return fridge7_bottle_red_bull_tropical;
//    }
//
//    public void setFridge7_bottle_red_bull_tropical(int fridge7_bottle_red_bull_tropical) {
//        this.fridge7_bottle_red_bull_tropical = fridge7_bottle_red_bull_tropical;
//    }
//
//    public int getFridge7_crate_desperados() {
//        return fridge7_crate_desperados;
//    }
//
//    public void setFridge7_crate_desperados(int fridge7_crate_desperados) {
//        this.fridge7_crate_desperados = fridge7_crate_desperados;
//    }
//
//    public int getFridge7_bottle_desperados() {
//        return fridge7_bottle_desperados;
//    }
//
//    public void setFridge7_bottle_desperados(int fridge7_bottle_desperados) {
//        this.fridge7_bottle_desperados = fridge7_bottle_desperados;
//    }
//}
//
