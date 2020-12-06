public class InOrderTest {
    public static void main(String[] args) {
        FunList list1 = new Cons(2)
                .append(new Cons(3))
                .append(new Cons(4))
                .append(new Cons(6))
                .append(new Cons(7));
        System.out.println("list1: " + list1);
        FunList list2 = list1.insertInOrder(5);
        System.out.println("list2: " + list2);

        FunList empty = Empty.uniqueInstance();
        FunList list3 = empty.insertInOrder(1);
        System.out.println("empty: " + empty);
        System.out.println("list3: " + list3);
    }
}
