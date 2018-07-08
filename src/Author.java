/**
 * Created By Dark Sh@dow
 */
public class Author {
    private String firstName;
    private String lastName;

    /** Constructors **/
    public Author() {

    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**Instance Methods **/

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString(){
        String details = "Author :"+this.firstName + this.lastName;
        System.out.println(details);
        return details;
    }
}
