package musicinstruments;

/**
    Instrument class is an abstract class, which will be used as the super class for other instruments
 */
public abstract class Instrument {
    private String instrumentName;  // variable for the instrument name
    private String instrumentManufacturer; // variable for instrument manufacturer

    // constructor
    public Instrument(String instrumentName, String instrumentManufacturer){
       this.instrumentName = instrumentName;
       this.instrumentManufacturer = instrumentManufacturer;
    }

    // Getter method for the instrument name
    public String getInstrumentName() {
        return instrumentName;
    }

    // Setter method for the instrument name
    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    // Getter method for the instrument manufacturer
    public String getInstrumentManufacturer() {
        return instrumentManufacturer;
    }

     //   Setter method for the instrument manufacturer
    public void setInstrumentManufacturer(String instrumentManufacturer) {
        this.instrumentManufacturer = instrumentManufacturer;
    }

}
