/**
 * Mimics functional lists.
 *
 * @author Moskalenko Vyacheslav and Anton Mishchenko
 * @since JDK1.4
 */
public abstract class FunList {

    /**
     * @return the first int in the list object
     */
    public abstract int car();

    /**
     * @return the tail (all but the first element) of the list object
     */
    public abstract FunList cdr();

    /**
     * Appends list to this one and returns result as new list.
     *
     * @param other list to append
     *
     * @return new list which contains the elements of this list followed by elements of other
     */
    public abstract FunList append(FunList other);

    /**
     * Inserts new element to sorted list into right place.
     *
     * @param i element to insert
     *
     * @return new list which contains the elements of this list and new element inserted in the appropriate order
     */
    public abstract FunList insertInOrder (int i);

    /**
     * @return a new sorted in non-descending order list containing the same elements as this
     */
    public abstract FunList sort();

    /**
     * NOTE: toString () method is NOT abstract. It calls, toStringHelp() , an abstract method.
     * It represents what we call an "invariant" behavior for <code>FunList</code>.
     * It is an example of the "Template Method Pattern". A "template method" is a method that
     * makes calls to at least one abstract method in its own class.
     *
     * @return String description of the list object
     */
    public String toString(){
        return "(" + toStringHelp() + " ) ";
    }

    /**
     * To string help string.
     *
     * @return String description of the list object
     */
    abstract String toStringHelp();
}