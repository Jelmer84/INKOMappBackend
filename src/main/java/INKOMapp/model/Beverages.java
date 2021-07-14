package INKOMapp.model;

public enum Beverages {
    WATER_ROOD ("Water_Rood"),
    WATER_BLAUW ("Water_Blauw"),
    PEPSI ("Pepsi"),
    PEPSI_MAX ("Pepsi_Max"),
    SISI ("Sisi"),
    ICE_TEA_NORMAL ("Ice_Tea_Normal"),
    ICE_TEA_GREEN_110CL ("Ice_Tea_Green_110cl"),
    ICE_TEA_GREEN_150CL("Ice_Tea_Green_150cl"),
    RED_BULL ("Red_Bull"),
    RED_BULL_SUGAR_FREE ("Red_Bull_Sugar_Free"),
    RED_BULL_TROPICAL ("Red_Bull_Tropical"),
    DESPERADOS ("Desperados"),
    FUST_JILZ ("Fust_Jilz"),
    FUST_RADLER ("Fust_Radler"),
    FUST_PILS ("Fust_Pils"),
    TANKBIER ("Tankbier");

    private final String name;

    Beverages(String name) {
        this.name = name;
    }
}




