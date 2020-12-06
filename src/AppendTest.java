public class AppendTest {
    public static void main(String[] args) {
        FunList list1 = new Cons(2);
        System.out.println("list1: " + list1);
        FunList list2 = list1.append(new Cons(8));
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        FunList list3 = list1.append(new Cons(6));
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("list3: " + list3);
        FunList list4 = list3.append(list3);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("list3: " + list3);
        System.out.println("list4: " + list4);

        FunList empty = Empty.uniqueInstance();
        FunList list5 = empty.append(new Cons(1));
        System.out.println("empty: " + empty);
        System.out.println("list3: " + list5);
    }
}
