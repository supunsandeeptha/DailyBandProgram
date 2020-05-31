package musicinstruments;

/**
 Drums class inherits from the Instrument abstract class as it's a musical instrument.
 */
public class Drums extends Instrument {

    private boolean hasHiHat; // variable to store the hasHiHat feature

    // constructor
    public Drums(String instrumentName, String instrumentManufacturer, boolean hasHiHat) {
        super(instrumentName, instrumentManufacturer); // super constructor
        this.hasHiHat = hasHiHat;
    }

    // getter method for hasHiHat variable
    public boolean isHasHiHat() {
        return hasHiHat;
    }

    // setter method for hasHiHat variable
    public void setHasHiHat(boolean hasHiHat) {
        this.hasHiHat = hasHiHat;
    }

    // overriding the toString method to return the string interpretation of variables
    @Override
    public String toString() {
        String value; // variable to assign a string value matching with boolean
        if(hasHiHat){
            value = "Instrument has a hi-hat";
        }else{
            value = "Instrument doesn't have a hi-hat";
        }
        return "Instrument is " + getInstrumentName()  + ". Made by " + getInstrumentManufacturer()
                + ". Properties are: " +
                "" + value +
                "";
    }
}
