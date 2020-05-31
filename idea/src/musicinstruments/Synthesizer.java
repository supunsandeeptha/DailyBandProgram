package musicinstruments;

import musicinstruments.Instrument;

/**
 Piano class inherits from the Instrument abstract class as it's a musical instrument.
 */
public class Synthesizer extends Instrument {

    private int noOfKeys; // variable to store the no of keys
    private boolean hasLED; // variable to store the LED feature of synthesizer

    // constructor
    public Synthesizer(String instrumentName, String instrumentManufacturer, int noOfKeys, boolean hasLED) {
        super(instrumentName, instrumentManufacturer); // super class constructor
        this.noOfKeys = noOfKeys;
        this.hasLED = hasLED;
    }

    // getter method for no of keys
    public int getNoOfKeys() {
        return noOfKeys;
    }
    // setter method for no of keys
    public void setNoOfKeys(int noOfKeys) {
        this.noOfKeys = noOfKeys;
    }
    // getter method for  isHasLed
    public boolean isHasLED() {
        return hasLED;
    }
    // setter method for isHasLed
    public void setHasLED(boolean hasLED) {
        this.hasLED = hasLED;
    }

    // overriding the toString method to return the string interpretation of variables
    @Override
    public String toString() {
        String value;
        if (hasLED) {
             value = "Has LED.";
        }else{
             value = "Has no LED.";
        }
        return " Instrument is " + getInstrumentName() +". Made by "+ getInstrumentManufacturer() +
                "Properties are: " +
                "No of Keys is " + noOfKeys +
                ", Instrument " + value;
    }
}
