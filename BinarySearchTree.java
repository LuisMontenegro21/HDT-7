public class BinarySearchTree< E extends Comparable <E>> {

    protected BinaryTree<E> root;
    protected int counter;
    
    public BinarySearchTree () {
        this.root = null;
        this.counter = 0;
    }

    public BinaryTree<E> locate (BinaryTree<E> root, E value) {
        E rootValue = root.value();
        BinaryTree<E> child;

        // found at root: done
        if (rootValue.equals(value)) return root;
        // look left if less-than, right if greater-than
        if (rootValue.compareTo(value) < 0)
        {
            child = root.right();
        } else {
            child = root.left();
        }
        // no child there: not in tree, return this node,
        // else keep searching
        if (child.isEmpty()) {
            return root;
        } else {
            return locate(child, value);
        }
    }

    public void add(E value)
    {
        BinaryTree<E> newNode = new BinaryTree<E>(value);

        // add value to binary search tree 
        // if there's no root, create value at root
        if (root.isEmpty())
        {
            root = newNode;
        } else {
            BinaryTree<E> insertLocation = locate(root,value);
            E nodeValue = insertLocation.value();
            // The location returned is the successor or predecessor
            // of the to-be-inserted value
            if (nodeValue.compareTo(value) < 0) {
                insertLocation.setRight(newNode);
            } else {
                insertLocation.setLeft(newNode);
            }
        }
        counter++;
    }

    public E get(E value)
    {
        if (root.isEmpty()) return null;

        BinaryTree<E> possibleLocation = locate(root,value);
        if (value.equals(possibleLocation.value()))
          return possibleLocation.value();
        else
          return null;
    }
    
}