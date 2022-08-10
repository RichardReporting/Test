package The_Required_Tasks.OOP.MyLinkedList;

import java.util.*;

public class SomeClass implements List {
    static class Node {
        Object data;
        Node next;
        Node prev;

        public Node(Object data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public Node head;
    public Node tail;
    public int size;


    public Node reachIndex(int index) {
        Node current;
        if (index * 2 < size) {
            current = head;
            while (index > 0) {
                index--;
                current = current.next;
            }
        } else {
            current = tail;
            while (index > 0) {
                index--;
                current = current.prev;
            }
        }
        return current;
    }

    public Node nodeRemove(Node current) {
        final Node next = current.next;
        final Node prev = current.prev;
        if (prev == null) {
            head = next;
        } else {
            prev.next = next;
            current.prev = null;
        }

        if (next == null) {
            tail = prev;
        } else {
            next.prev = prev;
            current.next = null;
        }
        size--;
        return current;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (current.data == o) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        Node current = head;
        int cursor = 0;
        Iterator i = new Iterator() {
            @Override
            public boolean hasNext() {
                return (reachIndex(cursor).next != null);
            }

            @Override
            public Object next() {
                return current.next;
            }
        };
        return i;
    }

    @Override
    public Object[] toArray() {
        Node current = head;
        Object[] array = new Object[size];
        for (int i = 0; i < size; i++) {
            array[i] = current.data;
            current = current.next;
        }
        return array;
    }

    @Override
    public boolean add(Object o) {
        Node newNode = new Node(o);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size = 1;
            return true;
        }
        if (head == tail) {
            tail = newNode;
            head.next = tail;
            tail.prev = head;
            size = 2;
            return true;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
        return true;
    }


    @Override
    public boolean remove(Object o) {
        if (head == null) {
            return false;
        }
        if (head.data == o) {
            if (head.next == null) {
                head = null;
            } else {
                head.next.prev = null;
                head = head.next;
            }
            size--;
            return true;

        }
        if (tail.data == o) {
            tail.data = null;
            tail.prev.next = null;
            size--;
            return true;
        }
        Node current = head;
        for (int i = 1; i < size; i++) {
            if (current.data == o) {
                current.data = null;
                current.prev.next = current.next;
                current.next.prev = current.prev;
                size--;
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        if (c.size() == 0) {
            return false;
        }
        List list = c.stream().toList();
        for (int i = 0; i < c.size(); i++) {
            add(list.get(i));
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        if (c.size() == 0) {
            return false;
        }
        List list = c.stream().toList();
        for (int i = 0; i < c.size(); i++) {
            add(index + i, list.get(i));
        }
        return true;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
        return reachIndex(index).data;
    }

    @Override
    public Object set(int index, Object element) {
        reachIndex(index).data = element;
        return null;
    }

    @Override
    public void add(int index, Object element) {
        if (index == size - 1) {
            add(element);
            return;
        }
        Node newNode = new Node(element);
        if (index == 0) {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = reachIndex(index);
        newNode.next = current;
        newNode.prev = current.prev;
        current.prev = current.prev.next = newNode;
    }

    @Override
    public Object remove(int index) {
        Node current = reachIndex(index);
        current.next.prev = current.prev;
        current.prev.next = current.next;
        size--;
        return current.data;
    }

    @Override
    public int indexOf(Object o) {
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (current.data == o) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        Node current = tail;
        for (int i = size - 1; i >= 0; i--) {
            if (current.data == o) {
                return i;
            }
            current = current.prev;
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public ListIterator listIterator(int index) {
        return new ListIterator() {
            final Node cursor = reachIndex(index);
            Node lastReturn = null;

            @Override
            public boolean hasNext() {
                return (cursor.next != null);
            }

            @Override
            public Object next() {
                lastReturn = cursor.next;
                cursor.prev = cursor.next;
                cursor.next = cursor.next.next;
                return cursor.prev.data;
            }

            @Override
            public boolean hasPrevious() {
                return (cursor.prev != null);
            }

            @Override
            public Object previous() {
                lastReturn = cursor.prev;
                cursor.next = cursor.prev;
                cursor.prev = cursor.prev.prev;
                return cursor.next.data;
            }

            @Override
            public int nextIndex() {
                Node indexFinder = head;
                int index = 0;
                while (indexFinder.next != cursor) {
                    index++;
                }
                return index + 1;
            }

            @Override
            public int previousIndex() {
                Node indexFinder = head;
                int index = 0;
                while (indexFinder.next != cursor) {
                    index++;
                }
                return index - 1;
            }

            @Override
            public void remove() {
                Node lastNext = lastReturn.next;
                nodeRemove(lastReturn);
                if (cursor.next == lastReturn) {
                    cursor.next = lastNext;
                } else {
                    lastReturn = null;
                }
            }

            @Override
            public void set(Object o) {
                cursor.data = o;
            }

            @Override
            public void add(Object o) {
                Node newNode = new Node(o);
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                    size = 1;
                    return;
                }
                if (head == tail) {
                    tail = newNode;
                    head.next = tail;
                    tail.prev = head;
                    size = 2;
                    return;
                }
                newNode.next = cursor.next;
                newNode.prev = cursor;
                cursor.next.prev = newNode;
                cursor.next = newNode;
                size++;
            }
        };
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        Node current;
        List<Object> list = new ArrayList<>();
        current = reachIndex(fromIndex);
        for (int i = 0; i < toIndex - fromIndex; i++) {
            list.add(current.data);
            current = current.next;
        }
        return list;
    }

    @Override
    public boolean retainAll(Collection c) {
        Node current = head;
        boolean marker = false;
        for (int i = 0; i < size; i++) {
            if (!(c.contains(current.data))) {
                remove(i);
                i++;
                marker = true;
            }
            current = current.next;
        }
        return marker;
    }

    @Override
    public boolean removeAll(Collection c) {
        Node current = head;
        boolean marker = false;
        for (int i = 0; i < size; i++) {
            if ((c.contains(current.data))) {
                remove(i);
                i++;
                marker = true;
            }
            current = current.next;
        }
        return marker;
    }

    @Override
    public boolean containsAll(Collection c) {
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (!(c.contains(current.data))) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    @Override
    public Object[] toArray(Object[] array) {
        Node current = head;
        for (int i = 0; i < size; i++) {
            array[i] = current.data;
            current = current.next;
        }
        return array;
    }
}
