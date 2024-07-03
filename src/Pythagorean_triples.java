
/**
 *
 * @author Azinm
 */
public class Pythagorean_triples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int side1, side2, hypt;
        System.out.printf("%s \t %s \t %s\n","Side 1", "Side2", "Hypotenuse");
        
        for ( side1 = 1; side1 < 500; side1++ ) {
		for ( side2= 1; side2 < 500; side2++ ) {
                        for ( hypt = 1; hypt < 500; hypt++ ) {
                            if (  side1*side1 + side2*side2 ==  hypt*hypt){
                                 System.out.printf("%d \t %d \t %d\n",
                                    side1, side2, hypt);
                            }
                        }
                }
        }
    }
}
    
