import musicband.MusicBand;
import musician.Musician;
import musicinstruments.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    // array list to store the band musicians
    public ArrayList<Musician> spokenHubMusicians = new ArrayList<Musician>();
    public ArrayList<Musician> fleeratsMusicians = new ArrayList<Musician>();
    // array list to store the removed musicians
    public ArrayList<Musician> removedMusicians = new ArrayList<Musician>();
    // array list to store the bands
    public ArrayList<MusicBand> musicBands = new ArrayList<MusicBand>();

    public static void main(String[] args) {

        Main main = new Main();
        // creating the music instruments , musicians, and band
        main.createBands();


        char userOption = '\0'; // variable to take user input and use it with switch case
        Scanner inputScanner = new Scanner(System.in); // inputScanner to take the user input

        // program welcome menu
        System.out.println("**=+=+=+=+=+=+=+=**=+=+=+=+=+=+=+=**=+=+=+=+=+=+=+=**=+=+=+=+=+=+=+=**");
        System.out.println("              ** Welcome To Daily Band Play **");
        System.out.println("**=+=+=+=+=+=+=+=**=+=+=+=+=+=+=+=**=+=+=+=+=+=+=+=**=+=+=+=+=+=+=+=**");


        do {

            System.out.println("1. List all the bands with their members and the properties of their instruments");
            System.out.println("2. Play one night");
            System.out.println("3. Exit");

            System.out.println("Please Enter a letter to select a Menu Option : ");
            userOption = inputScanner.next().charAt(0);
            System.out.println("\n");

            // switch case for menu options
            switch (userOption) {

                case '1':
                    main.listMusicBands();
                    break;


                case '2':
                    main.playOneNight();
                    break;

                case '3':

                    System.out.println("**=+=+=+=+=+=+=+=**=+=+=+=+=+=+=+=**=+=+=+=+=+=+=+=**=+=+=+=+=+=+=+=**");
                    System.out.println("            Thank You for using the daily band program.               ");
                    System.out.println("**=+=+=+=+=+=+=+=**=+=+=+=+=+=+=+=**=+=+=+=+=+=+=+=**=+=+=+=+=+=+=+=**");

                    break;

                default:
                    System.err.println(" Please enter a valid option!!! ");
                    break;
            }
        }
        while (userOption != '3'); // loop exit condition
    }

    // Band Creation Method
    public void createBands() {
        // musicinstruments.Guitar  & Liza Baar
        Guitar lizaGuitar = new Guitar("Guitar", "Bender", 5, 0.4f);
        Musician lizaBaar = new Musician("Liza Baar", lizaGuitar);

        //musicinstruments.Piano & Null Beat
        Piano nullPiano = new Piano("Piano", "McFaren", 47, true);
        Musician nullBeat = new Musician("Null Beat", nullPiano);

        // Void & musicinstruments.Synthesizer
        Synthesizer voidSynthesizer = new Synthesizer("Synthesizer", "Lorg", 47, true);
        Musician voidMusician = new Musician("Void", voidSynthesizer);

        // Stringsteen & musicinstruments.Banjo
        Banjo stringBanjo = new Banjo("Banjo", "Gibson", 4, 8f);
        Musician stringsTeen = new Musician("Stringsteen", stringBanjo);

        // Xindea & Drum
        Drums xindeaDrum = new Drums("Drum", "Toyota", true);
        Musician xindea = new Musician("Xindea", xindeaDrum);

        // Captor & musicinstruments.Synthesizer
        Synthesizer captorSynthesizer = new Synthesizer("Synthesizer", "Suzuki", 72, false);
        Musician captor = new Musician("Captor", captorSynthesizer);

        // creating the musician which doesn't belong to any band
        Banjo seperatorBanjo = new Banjo("Banjo", "Spic", 7, 0.7f);
        Musician sunSeperator = new Musician("Sun Seperator", seperatorBanjo);

        // adding the spoke n Hub musicians to a list
        spokenHubMusicians.add(lizaBaar);
        spokenHubMusicians.add(nullBeat);
        spokenHubMusicians.add(voidMusician);

        // adding the Fleerats musicians to a list
        fleeratsMusicians.add(stringsTeen);
        fleeratsMusicians.add(xindea);
        fleeratsMusicians.add(captor);

        // Band Spoke n hub
        MusicBand spokenHub = new MusicBand("Spoke n Hub", spokenHubMusicians);

        // Band Fleerats
        MusicBand fleeRats = new MusicBand("Fleerats", fleeratsMusicians);

        // adding the music bands to array list
        musicBands.add(spokenHub);
        musicBands.add(fleeRats);

        //adding the sun separator to removed musicians
        removedMusicians.add(sunSeperator);

    }

    // list the all the music bands with their instruments
    public void listMusicBands() {
        // listing all the bands with their instruments
        for (int c = 0; c < musicBands.size(); c++) {
            MusicBand musicBand = musicBands.get(c);
            System.out.println("------------------**** Band Name : " + musicBand.getBandName() + " ****---------------");
            for (int x = 0; x < musicBand.getMusicians().size(); x++) {
                System.out.println("Musician Name is " + musicBand.getMusicians().get(x).getMusicianName());
                System.out.println("Instrument: " + musicBand.getMusicians().get(x).getMusicianInstrument());
            }
            System.out.println("--------------------------**** End Of Band **** --------------------------------------" +
                    "---");
        }

    }

    // play one night method
    public void playOneNight() {
        // checking if there are any bands
        if (musicBands.size() == 0) {
            System.out.println("No Existing Bands !. Please List the Bands First !");
        }
        // generating a random element to remove
        for (MusicBand musicBand : musicBands) {
            System.out.println("Band Name : " + musicBand.getBandName() + " is playing ");
            // generating a random number
            int randomNumber = new Random().nextInt(musicBand.getMusicians().size());
            // adding the about to remove musician to an array
            removedMusicians.add(musicBand.getMusicians().get(randomNumber));
            System.out.println("Musician " + musicBand.getMusicians().get(randomNumber).getMusicianName()
                    + " left the " + musicBand.getBandName());
            // removed
            musicBand.getMusicians().remove(randomNumber);

        }
        // band iteration flag variable
        int previouslySelectedBand = -1;
        // while loop condition
        while(!removedMusicians.isEmpty()) {
            // random number
            int joinRandomNumber = new Random().nextInt(removedMusicians.size());
            Musician currentRemovedMusician = removedMusicians.get(joinRandomNumber);
            for(int i = 0; i < musicBands.size(); i++) { // iterating music bands
                if (i == previouslySelectedBand) {
                    continue;
                }
                // current music band
                MusicBand currentBand = musicBands.get(i);
                // variable to keep track of instrument conflicts
                boolean isConflictingInstruments = false;
                // iterating the current band musicians checking for conflicts
                for (int c = 0; c < currentBand.getMusicians().size(); c++) {
                    Musician currentMusician = currentBand.getMusicians().get(c);
                    // checking for instrument conflicts
                    if (currentMusician.getMusicianInstrument().getInstrumentName().equals(
                            currentRemovedMusician.getMusicianInstrument().getInstrumentName())) {
                        isConflictingInstruments = true;
                        break;
                    }
                }
                // checking conflict status
                if (isConflictingInstruments) {
                    // if conflicts are there logging the failed attempt
                    System.out.println("Musician " + currentRemovedMusician.getMusicianName() + " failed" +
                            " to join" + currentBand.getBandName() + " band. ");
                   // if this is the last band in iteration. resetting the iteration
                    if (i == musicBands.size() - 1) {
                        previouslySelectedBand = -1;
                    }
                }else {
                    // resetting the iteration if success
                    previouslySelectedBand = i;
                    // logging the joining band
                    System.out.println("Musician " + currentRemovedMusician.getMusicianName()
                            + " has joined the " + currentBand.getBandName());
                    // adding to the band
                    currentBand.getMusicians().add(currentRemovedMusician);
                    // removing the added musician from the removed musicians array
                    removedMusicians.remove(joinRandomNumber);
                    break;
                }
            }
        }
    }
}