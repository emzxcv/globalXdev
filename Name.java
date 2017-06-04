
public class Name implements Comparable<Name> {
    private final String firstName, lastName;

    public Name(String name) {
        if( name == null)
            throw new NullPointerException();
        String [] nameSplit = name.split(",");
        this.firstName = nameSplit[1];
        this.lastName = nameSplit[0];
    }

    public String firstName() { return firstName; }
    public String lastName()  { return lastName;  }

    public boolean equals(Object o) {
        if (!(o instanceof Name))
            return false;
        Name n = (Name) o;
        return n.firstName.equals(firstName) && n.lastName.equals(lastName);
    }

    public String toString() {
	return lastName +", "+firstName;
    }

    public int compareTo(Name n) {
        int lastCmp = lastName.compareTo(n.lastName);
        return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
    }
}
