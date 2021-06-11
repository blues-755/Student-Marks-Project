
/* Student-Marks-Project.java
 Generic Helper for the Gender

 Author: Siyamtanda Tonjeni (217107958)
 Date: 11 June 2021
 */

package za.ac.cput.Util;

        import java.util.UUID;

public class GenericHelper {
    public static String generateId(){
        return UUID.randomUUID().toString();
    }
}
