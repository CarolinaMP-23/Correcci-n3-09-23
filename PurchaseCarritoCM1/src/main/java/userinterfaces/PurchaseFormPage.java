package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

class PurchaseFormPage {
    private static Target Name;
    public static final Target NAME_FIELD;
    private static Target CountryRecord;

    static {
        NAME_FIELD = Name;
    }

    private static Target Country;
    public static final Target COUNTRY_DROPSOWN = Country;
    private static Target City;
    public static final Target CITY_FIELD = City;
    private static Target Credit_Card;
    public static final Target CREDIT_CARD_FIELD = Credit_Card;
    private static Target Month;
    public static final Target EXPIRATION_MONTH_DROPDOWN = Month;
    private static Target Year;
    public static final Target EXPIRATION_YEAR_DROPDOWN = Year;

    public static void setName(Target name) {
        Name = name;
    }

    public static void setCountryRecord(Target countryRecord) {
        CountryRecord = countryRecord;
    }

    public static Target getCountryRecord() {
        return CountryRecord;
    }
}

