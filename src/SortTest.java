public class SortTest {
    public static void main(String[] args) {
        FunList list1 = new Cons(2)
                .append(new Cons(4))
                .append(new Cons(1))
                .append(new Cons(6))
                .append(new Cons(10))
                .append(new Cons(8));
        System.out.println("list1: " + list1);
        FunList sortedList = list1.sort();
        System.out.println("list1: " + list1);
        System.out.println("sortedList: " + sortedList);
    }
}
