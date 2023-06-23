package demo;

public class Main {
    public static void main(String[] args) {
        DemoTree demoTree = new DemoTree(1);
        demoTree.put(3);
        demoTree.put(5);
        System.out.println(demoTree);
    }
}
