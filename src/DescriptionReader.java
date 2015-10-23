import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by chrisgarland on 21/10/15.
 */
public class DescriptionReader
{
    private int numStockRooms, numCartons;
    private Scanner fileScanner;                                    //For breaking a file into individual lines


    /**
     * Alternate constructor
     *
     * @param descriptionFile - Provided by user
     */
    public DescriptionReader( File descriptionFile )
    {
        try
        {
            fileScanner = new Scanner( descriptionFile );
            numStockRooms = 0;
            numCartons = 0;
        }
        catch( IOException e )
        {
            System.out.println(e.getMessage());
        }
    }


    /**
     * Responsible for breaking the geometry section
     * into individual tokens and storing them in a queue.
     * Uses fileScanner to break file into lines, and lineTokenizer
     * to break each line into tokens.
     *
     * @return - Queue of individual tokens
     */
    public DSAQueue<String> readGeoSection()
    {
        DSAQueue<String> geoQueue = new DSAQueue<String>();               //Filled and returned by this method
        StringTokenizer lineTokenizer;                               //Breaks each line into individual tokens
        String line;                                                 //Each line provided by fileScanner
        String token;



        return geoQueue;
    }


    public DSAQueue<String> readCartonSection()
    {
        DSAQueue<String> cartonQueue = new DSAQueue<String>();      //Filled and returned by method

        //Needs implementation

        return cartonQueue;
    }


//Accessors:

    /**
     * @return - Number of stockrooms
     */
    public int getNumStockRooms()
    {
        return numStockRooms;
    }


    /**
     * @return - Number of cartons
     */
    public int getNumCartons()
    {
        return numCartons;
    }


//Cleanup:

    /**
     * Responsible for cleaning up resources
     */
    public void close()
    {
        fileScanner.close();
    }
}