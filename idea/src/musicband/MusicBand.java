package musicband;

import musician.Musician;

import java.util.List;

/**
 MusicBand class can used to create Band Objects with List of Musicians
 */
public class MusicBand {

    private String bandName; // variable to store the name of the band
    private List<Musician> musicians; // variable to store the musicians of the band

    // constructor
    public MusicBand(String bandName, List<Musician> musicians) {
        this.bandName = bandName;
        this.musicians = musicians;
    }

    // getter method for band name variable
    public String getBandName() {
        return bandName;
    }

    // setter method for the band name variable
    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    // getter method for the musicians variable
    public List<Musician> getMusicians() {
        return musicians;
    }

    // setter method for the musicians variable
    public void setMusicians(List<Musician> musicians) {
        this.musicians = musicians;
    }

    // overriding the toString method to return the string interpretation of variables
    @Override
    public String toString() {
        return "MusicBand" +
                "bandName='" + bandName + '\'' +
                ", musicians=" + musicians +
                "";
    }
}
