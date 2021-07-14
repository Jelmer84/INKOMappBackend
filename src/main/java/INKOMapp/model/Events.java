package INKOMapp.model;

public enum Events {
    PRE_INKOM_PARTY ("pre-inkom-party"),
    OPENING ("opening"),
    WELCOME_TO_MAASTRICHT("welcome-to-maastricht"),
    FESTIVAL("festival"),
    MECC_TUESDAY("mecc-tuesday"),
    SPORTSEVENT("sportsevent"),
    BBQ("bbq"),
    CANTUS("cantus"),
    CULTURE_CARNIVAL("culture-carnival"),
    AQUA_LOUNGE("aqua-lounge"),
    OPEN_AIR_CINEMA("open-air-cinema"),
    HEINEKEN_NIGHT("heineken-night");

    private final String name;

    Events(String name) {
        this.name = name;
    }
}




