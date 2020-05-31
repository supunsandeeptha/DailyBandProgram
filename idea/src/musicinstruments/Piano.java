package musicinstruments;

import musicinstruments.Instrument;

/**
 Piano class inherits from the Instrument abstract class as it's a musical instrument.
 */
public class Piano extends Instrument {
    private int noOfKeys; // variable to store the no of keys in the keyboard
    private boolean isAcoustic; // variable to the store the acoustic feature

    // constructor
    public Piano(String instrumentName, String instrumentManufacturer, int noOfKeys, boolean isAcoustic) {
        super(instrumentName, instrumentManufacturer); // super class constructor
        this.noOfKeys = noOfKeys;
        this.isAcoustic = isAcoustic;
    }

    // getter method for no of keys
    public int getNoOfKeys() {
        return noOfKeys;
    }

    // setter method for no of keys
    public void setNoOfKeys(int noOfKeys) {
        this.noOfKeys = noOfKeys;
    }

    // getter method for isAcoustic
    public boolean isAcoustic() {
        return isAcoustic;
    }

    // setter method for isAcoustic
    public void setAcoustic(boolean acoustic) {
        isAcoustic = acoustic;
    }

    // overriding the toString method to return the string interpretation of variables
    @Override
    public String toString() {
        String value; // variable to store a string value based on boolean value
        if(isAcoustic){
            value = "Instrument is Acoustic";
        }else{
            value = "Instrument is not Acoustic";
        }
        return "Instrument is " + getInstrumentName() + ". Made by " + getInstrumentManufacturer() +
              ". Properties are: " +  " No of Keys are " + noOfKeys +
                ", " + value;
    }
}
