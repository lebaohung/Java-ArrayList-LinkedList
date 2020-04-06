package list;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> listInterger = new MyList<Integer>();
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.get(-1);
        System.out.println("element -1: " + listInterger.get(-1));
    }
}
