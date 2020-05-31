package musicinstruments;

import musicinstruments.Instrument;

/**
    Guitar class inherits from the Instrument abstract class as it's a musical instrument.
 */
public class Guitar extends Instrument {

    private int noOfString; // variable to store the no of strings
    private float stringSize; // variable to store the string size

    // constructor
    public Guitar(String instrumentName, String instrumentManufacturer, int noOfString, float stringSize) {
        super(instrumentName, instrumentManufacturer); // super class constructor
        this.noOfString = noOfString;
        this.stringSize = stringSize;
    }

    // getter method for no of strings
    public int getNoOfString() {
        return noOfString;
    }

    // setter method for no of strings
    public void setNoOfString(int noOfString) {
        this.noOfString = noOfString;
    }

    // getter method for string size
    public float getStringSize() {
        return stringSize;
    }

    // setter method for string size
    public void setStringSize(float stringSize) {
        this.stringSize = stringSize;
    }

    // overriding the toString method to return the string interpretation of variables
    @Override
    public String toString() {
        return " Instrument is " + getInstrumentName() + ". Made by " + getInstrumentManufacturer()
                + ". Properties are: " +
                "No of Strings are " + noOfString +
                ", String Size is " + stringSize + "mm." +
                "";
    }
}
