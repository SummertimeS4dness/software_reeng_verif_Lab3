/**
 * Mimics fundamental function cons for constructs
 * memory objects which hold two values or pointers to values
 *
 * @author Vyacheslav Moskalenko and Anton Mishchenko
 * @since JDK1.4
 */
public class Cons extends FunList {

    /**
     * Left side (head) of the list.
     */
    private int _dat;
    /**
     * Tail (all but the first element) of the list object.
     */
    private FunList _cdr;

    /**
     * Instantiates a new list with left side (head) and the tail.
     *
     * @param carDat a left side (head) of the list
     * @param cdr    the tail (all but the first element) of the list object
     */
    public Cons(int carDat, FunList cdr){
        _dat = carDat;
        _cdr = cdr;
    }

    /**
     * Instantiates a new list with left side (head) and empty tail.
     *
     * @param i a left side (head) of the list.
     */
    public Cons(int i){
        _dat = i; 
        _cdr = Empty.uniqueInstance();
    }

    private Cons() {
        _cdr = Empty.uniqueInstance();
    }

    /**
     * @return the first int in the list object
     */
    public int car(){
        return _dat;
    }

    /**
     * @return the tail (all but the first element) of the list object
     */
    public FunList cdr(){
        return _cdr;
    }

    /**
     * Appends list to this one and returns result as new list.
     *
     * @param other list to append
     *
     * @return new list which contains the elements of this list followed by elements of other
     */
    public FunList append(FunList other) {
        return new Cons(_dat, _cdr.append(other));
    }

    /**
     * Inserts new element to sorted list into right place.
     *
     * @param i element to insert
     *
     * @return new list which contains the elements of this list and new element inserted in the appropriate order
     */
    public FunList insertInOrder(int i) {
        if (i >= _dat) {
            return new Cons(_dat, _cdr.insertInOrder(i));
        }

        return new Cons(i, this);
    }

    /**
     * @return a sorted in non-descending order list containing the same elements as this
     */
    public FunList sort() {
        if (_cdr instanceof Empty) {
            return this;
        }

        FunList toReturn = new Cons(_dat);
        FunList res = _cdr;
        int next = _cdr.car();

        while (true) {
            toReturn = toReturn.insertInOrder(next);
            if (!(res.cdr() instanceof Empty)) {
                res = res.cdr();
                next = res.car();
            } else {
                break;
            }
        }

        return toReturn;
    }

    /**
     * @return a String description of the list object
     */
    String toStringHelp(){
        return " " + _dat + _cdr.toStringHelp();
    }
}