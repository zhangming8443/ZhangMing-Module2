package ss10.excercise.array_list;


public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.show();
        System.out.println("element 3 :" + list.get(3));
        System.out.println("element 5 :" + list.get(5));
        System.out.println(list.indexOf(3));
        System.out.println(list.size());
    }
}
