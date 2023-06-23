package demo;

public class DemoTree {
    protected Integer element;
    protected DemoTree left;
    protected DemoTree right;

    public DemoTree(Integer e) {
        element = e;
    }

    public void put(Integer element){
        DemoTree current = this;
        while (current != null){
            if (element < current.element){
                current = current.left;
                if (current == null){
                    this.left =  new DemoTree(element);
                    break;
                }
            }else if ( element > current.element){
                current = current.right;
                if (current == null){
                    this.right = new DemoTree(element);
                    break;
                }
            }

        }

    }

//    public  boolean search(E element){
//        DemoTree<E> curent
//    }


    @Override
    public String toString() {
        return "DemoTree{" +
                "element=" + element +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
