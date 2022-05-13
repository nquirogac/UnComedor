package Data;

public class ListComedores {

    public static void main(String[] args) throws Exception {
        ListComedores Comedores = new ListComedores();
        Comedores.insert(new Comedor(2,"Central"));
        Comedores.insert(new Comedor(8,"Ecologia"));
        Comedores.insert(new Comedor(10,"veterinaria"));
        Comedores.output();
    }

    int N = 5;
    Comedor larray[];

    private int position, count;

    public ListComedores() {
        count = 0;
        larray = new Comedor[N];
    }

    private boolean empty() {
        return count <= 0;
    }

    private boolean full() {
        return count >= N;
    }

    public boolean delete(Comedor item) {
        boolean deleted = false;
        if (!empty()) {
            if (search(item)) {
                for (int j = position; j < count - 1; j++) {
                    larray[j] = larray[j + 1];
                }
                count--;
                deleted = true;
            } else {
                System.out.println("List is Empty");
            }
        }
        return deleted;
    }

    public boolean insert(Comedor item) {
        boolean inserted = false;
        if (!full()) {
            if (!search(item)) {
                for (int j = count; j > position; j--) {
                    larray[j] = larray[j - 1];
                }
                larray[position] = item;
                count++;
                inserted = true;
            } 
        }
        else {
                System.out.println("List is Full");
            }
        return inserted;
    }

    private boolean search(Comedor item) {
        boolean found = false, stop = false;
        position = 0;
        while (position < count && !stop) {
            if (larray[position].nombre == item.nombre) {
                stop = true;
                found = true;
            } else {
                position++;
            }
        }
        return found;
    }

    public void output() {
        System.out.print("Comedores: "+"\n");
        int j = 0;
        while (j != count) {
            System.out.print(larray[j] + " "+ "Capacidad: "+ larray[j].capacidad+"\n");
            j++;
        }
        System.out.println();
    }
}
