package musician;

import musicinstruments.Instrument;

/**
 Musician class can be use create the Musician Objects with Instruments
 */
public class Musician {

    private String musicianName; // variable to store the musician name
    private Instrument musicianInstrument; // variable to store the musician instrument

    // constructor
    public Musician(String musicianName, Instrument musicianInstrument) {
        this.musicianName = musicianName;
        this.musicianInstrument = musicianInstrument;
    }

    // getter method for the musician name
    public String getMusicianName() {
        return musicianName;
    }
    // setter method for the musician name
    public void setMusicianName(String musicianName) {
        this.musicianName = musicianName;
    }
    // getter method for the musician instrument
    public Instrument getMusicianInstrument() {
        return musicianInstrument;
    }
    // setter method for the musician instrument
    public void setMusicianInstrument(Instrument musicianInstrument) {
        this.musicianInstrument = musicianInstrument;
    }

    // overriding the toString method to return the string interpretation of variables
    @Override
    public String toString() {
        return
                "Musician Name is " + musicianName + '\n' +
                "Musician" + musicianInstrument.toString() +
                '\n';
    }
}
