package test;

public class BinaryTreeImpl<T extends Comparable<T>> {
    private class Node<T>{
        private T val;
        private Node<T> left;
        private Node<T> right;

        Node(T t){
            val= t;
        }
    }

    Node<T> root;

    public void add(T t){
        root= addRecursive(root, t);
    }

    private Node<T> addRecursive(Node<T> cur, T t){
        if(cur== null)
            return new Node<>(t);

        if(t.compareTo(cur.val)<0) cur.left= addRecursive(cur.left, t);
        else cur.right= addRecursive(cur.right, t);

        return cur;
    }

    public void traversePreOrder(Node cur){
        if(cur!=null){
            System.out.println(cur.val);
            traversePreOrder(cur.left);
            traversePreOrder(cur.right);
        }
    }

    public void traverseInOrder(Node cur){
        if(cur!=null){
            traverseInOrder(cur.left);
            System.out.println(cur.val);
            traverseInOrder(cur.right);
        }
    }

    public void traversePostOrder(Node cur){
        if(cur!=null){
            traversePostOrder(cur.left);
            traversePostOrder(cur.right);
            System.out.println(cur.val);
        }
    }

    public boolean contain(T t){
        return containRecursive(root, t);
    }

    private boolean containRecursive(Node<T> cur, T t){
        if(cur==null)
            return false;

        if(t.compareTo(cur.val)==0)
            return true;

        return t.compareTo(cur.val)>0? containRecursive(cur.right, t): containRecursive(cur.left, t);
    }

    public void delete(T t){
        root= deleteRecursive(root, t);
    }

    private Node<T> deleteRecursive(Node<T> cur, T t){
        if(cur== null)
            return null;

        if(t.compareTo(cur.val)==0){
            if (cur.left == null && cur.right == null) {
                return null;
            }

            if(cur.left==null)
                return cur.right;
            else if(cur.right== null)
                return cur.left;

            T smallestValue= findSmallestValue(cur.right);
            cur.val= smallestValue;
            cur.right= deleteRecursive(cur.right, t);
            return cur;
        }

        if(t.compareTo(cur.val)<0) cur.left= deleteRecursive(cur.left, t);
        else cur.right= deleteRecursive(cur.right, t);

        return cur;
    }

    private T findSmallestValue(Node<T> cur){
        return cur.left==null? cur.val: findSmallestValue(cur.left);
    }
}

class Main{
    public static void main(String[] args){
        BinaryTreeImpl<Integer> binaryTree= new BinaryTreeImpl<>();
        binaryTree.add(6);
        binaryTree.add(4);
        binaryTree.add(9);
        binaryTree.add(1);
        binaryTree.add(19);
        binaryTree.add(5);

        binaryTree.delete(9);
        binaryTree.traversePreOrder(binaryTree.root);
        System.out.println(binaryTree.contain(56));
    }
}
