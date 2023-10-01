
public class DLL {
    Node2P head;
    Node2P tail;
    int size;

    public DLL() {
        head = null;
        tail = null;
        size = 0;
    }

    //soal 1
    int[] toArray() {
        int[] arr = new int[size];
        Node2P current = head;
        int index = 0;
        while (current != null) {
            arr[index] = current.data;
            current = current.next;
            index++;
        }
        return arr;
    }

    //soal 2
    DLL sublist(int start, int end) {
        if (start < 0 || end >= size || start > end) {
            throw new IllegalArgumentException("Invalid start or end index");
        }
        DLL newList = new DLL();
        Node2P current = head;
        int index = 0;
        while (index < start) {
            current = current.next;
            index++;
        }
        while (index <= end) {
            newList.addLast(current.data);
            current = current.next;
            index++;
        }
        return newList;
    }

    //soal 3
    void addAll(DLL list) {
        Node2P current = list.head;
        while (current != null) {
            addLast(current.data);
            current = current.next;
        }
    }

    //soal 4
    boolean containsAll(DLL list) {
        Node2P current = list.head;
        while (current != null) {
            if (!contains(current.data)) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    //soal 5
    void removeAll(DLL list) {
        Node2P current = list.head;
        while (current != null) {
            deleteByData(current.data);
            current = current.next;
        }
    }

    int get(int idx) {
        if (idx < 0 || idx >= size()) {
            System.out.println("Idx invalid!");
            return -1;
        } else {
            Node2P tmp = head;
            for (int i = 0; i < idx; i++) {
                tmp = tmp.next;
            }
            return tmp.data;
        }
    }

    void deleteByData(int data) {
        Node2P tmp = head;
        while (tmp != null) {
            if (tmp.data == data) {
                if (tmp.prev == null) {
                    deleteFirst();
                } else if (tmp.next == null) {
                    deleteLast();
                } else {
                    tmp.prev.next = tmp.next;
                    tmp.next.prev = tmp.prev;
                }
            }
            tmp = tmp.next;
        }
    }

    boolean isEmpty() {
        return head == null;
    }

    int size() {
        return size;
    }

    void addLast(int in) {
        Node2P newNode = new Node2P(in);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    void deleteFirst() {
        if (isEmpty()) {
            System.out.println("Data kosong! Operasi deleteFirst gagal!");
        } else {
            if (size() == 1) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
        }
    }

    void deleteLast() {
        if (isEmpty()) {
            System.out.println("Data kosong! Operasi deleteLast gagal!");
        } else {
            if (size() == 1) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Data kosong! Operasi print gagal");
        } else {
            Node2P tmp = head;
            while (tmp != null) {
                System.out.print("" + tmp.data);
                if (tmp.next != null)
                    System.out.print("-");
                tmp = tmp.next;
            }
            System.out.println("");
        }
    }

    private boolean contains(int data) {
        Node2P current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
