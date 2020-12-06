/**
 * Mimics functional empty list.
 *
 * @author Vyacheslav Moskalenko and Anton Mishchenko
 * @since JDK1.4
 */
public class Empty extends FunList{
    private static Empty instance;

    /**
     * Instantiates a new Empty.
     */
    private Empty(){}

    public static Empty uniqueInstance() {
        if (instance == null) {
            instance = new Empty();
        }
        return instance;
    }

    /**
     * @return the first int in the list object
     */
    public int car(){
        throw new java.util.NoSuchElementException("car requires a non Empty Funlist");
    }

    /**
     * @return the tail (all but the first element) of the list object
     */
    public FunList cdr(){
        throw new java.util.NoSuchElementException("cdr requires a non Empty Funlist");
    }

    /**
     * Appends list to this one and returns result as new list.
     *
     * @param other list to append
     *
     * @return new list which contains the elements of this list followed by elements of other
     */
    public FunList append(FunList other) {
        return other;
    }

    /**
     * Inserts new element to sorted list into right place.
     *
     * @param i element to insert
     *
     * @return new list which contains the elements of this list and new element inserted in the appropriate order
     */
    public FunList insertInOrder(int i) {
        return new Cons(i);
    }

    /**
     * @return a sorted in non-descending order list containing the same elements as this
     */
    public FunList sort() {
        return uniqueInstance();
    }

    /**
     * @return String description of the list object
     */
    String toStringHelp(){
        return "";
    }
}

