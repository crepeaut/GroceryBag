/* @formatter:off
 *
 * Dave Rosenberg
 * Comp 2000 - Data Structures
 * Lab: Bag App - Grocery Bagger
 * Spring, 2020
 *
 * Usage restrictions:
 *
 * You may use this code for exploration, experimentation, and furthering your
 * learning for this course. You may not use this code for any other
 * assignments, in my course or elsewhere, without explicit permission, in
 * advance, from myself (and the instructor of any other course).
 *
 * Further, you may not post or otherwise share this code with anyone other than
 * current students in my sections of this course. Violation of these usage
 * restrictions will be considered a violation of the Wentworth Institute of
 * Technology Academic Honesty Policy.
 *
 * Do not remove this notice.
 *
 * @formatter:on
 */

package edu.wit.dcsn.comp2000.bagapp ;

/**
 * Enumeration of grocery item sizes for the GroceryBagger application.
 *
 * @author David M Rosenberg
 * @version 1.0.0 initial version for GroceryBagger application
 */
public enum GroceryItemSize
    {
     // Weight      Display Name    Numeric Value
     SMALL (        "Small",        1 ),
     MEDIUM (       "Medium",       2 ),
     LARGE (        "Large",        3 ),
     EXTRA_LARGE (  "Extra Large",  4 );

	//mnenomics, proper casing
	//another lab 
	//graded as a project, then add and suract by individiual 
	//It does whats its supposed to, and written cleanly 
	//11 pm next thrusday 1/27
	//relative path specification
	//figure out API, figure out a stub version and start to implement and test the code
    //grocery list is tab divided
	//need to use at least 3 of the properties to decide where items go in bags
    // instance variables 
	//inistantiating four instances of groceryitemsize to DIsplayNmae and SizeVale
	//enums are immutable so they are final
//we come up with wight, capacity, number of items and the copatibility
    /** nicely formatted name for display */
    public final String displayName ;

    /** integer equivalent of the size */
    public final int sizeValue ;


    /**
     * @param itemSizeDisplayName
     *     nicely formatted name for display
     * @param itemSizeValue
     *     integer equivalent of the size
     */
    private GroceryItemSize( final String itemSizeDisplayName,
                             final int itemSizeValue )
        {
        this.displayName =  itemSizeDisplayName ;
        this.sizeValue =    itemSizeValue ;
        
        } // end constructor

    
    /**
     * Parse a text description of size
     * <p>
     * WARNING: This is a very rudimentary implementation and may produce
     * unexpected results.
     *
     * @param sizeDescription
     *     a name to parse
     * @return the corresponding enum constant or MEDIUM if the name is
     *     unrecognized
     */
    public static GroceryItemSize
           interpretDescription( final String sizeDescription )
        {
        // This is a very rudimentary implementation
        //will return an instance of small, medium/large etc
        GroceryItemSize correspondingSize ;

        switch ( sizeDescription.toLowerCase().charAt( 0 ) )
            {
            case 's':
                correspondingSize =     SMALL ;
                break ;

            case 'm':
                correspondingSize =     MEDIUM ;
                break ;

            case 'l':
                correspondingSize =     LARGE ;
                break ;

            case 'e':
            case 'x':
                correspondingSize =     EXTRA_LARGE ;
                break ;

            default:
                correspondingSize =     MEDIUM ;
                break ;
                
            }   // end switch()

        return correspondingSize ;
        
        }   // end method interpretDescription()


    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
        {
        return this.displayName ;

        }   // end method toString()


    /**
     * Test driver - displays all constants for this enumeration
     *
     * @param args
     *     -unused-
     */
    public static void main( final String[] args )
        {
        // display introductory message
        System.out.printf( "Members of the %s enumeration%n%n",
                           GroceryItemSize.class.getSimpleName() ) ;
        
        // display column headers
        System.out.printf( "%-5s %-15s %-15s %-15s %-15s %-15s%n",
                           "#",
                           "Item Size",
                           "Name",
                           "Display Name",
                           "Size Value",
                           "Interpreted Size" ) ;

        // display each element of the enumeration
        for ( final GroceryItemSize anItemSize : GroceryItemSize.values() )
            {
            System.out.printf( "%-5d %-15s %-15s %-15s %-15d %-15s%n",
                               anItemSize.ordinal(),
                               anItemSize,
                               anItemSize.name(),
                               anItemSize.displayName,
                               anItemSize.sizeValue,
                               interpretDescription( anItemSize.toString() ) ) ;
            }   // end for()

        }   // end main()

    }   // end enum GroceryItemSize
