public class MyList <T> {
    private T[] array;
    private int size;

    // Varsayılan kapasite
    private static final int DEFAULT_CAPACITY=10;

    // Boş constructor: Dizinin başlangıç boyutu varsayılan kapasite
    public MyList () {
        this.array=(T[]) new Object[DEFAULT_CAPACITY];
        this.size=0;
    }

    // Kapasiteyi belirten constructor
    public MyList (int capacity){
        this.array=(T[]) new Object[capacity];
        this.size=0;
    }

    // Dizideki eleman sayısını döndürür
    public int size (){
        return this.size;
    }

    // Dizinin kapasitesini döndürür
    public int getCapacity(){
        return this.array.length;
    }

    // Diziye eleman ekler, gerekirse kapasiteyi artırır
    public void add (T data) {
        if(this.size == this.array.length){
            // Kapasiteyi iki katına çıkar
            resizeArray(this.array.length*2);
        }
        this.array[this.size++]=data;
    }
    // Dizinin kapasitesini değiştirmek için
    private void resizeArray(int newCapacity){
        T[] newArray = (T[]) new Object[newCapacity];
        System.arraycopy(this.array, 0, newArray, 0, this.size);
        this.array=newArray;
    }

    // Verilen indisteki elemanı döndürür, geçersizse null döndürür
    public T get(int index){
        if(index<0 || index >= this.size){
            return null;
        }
        return this.array[index];
    }

    // Verilen indisteki elemanı siler ve elemanları sola kaydırır
    public T remove(int index) {
        if (index < 0 || index >= this.size) {
            return null;
        }
        T removedData = this.array[index];
        for (int i = index; i < this.size - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.array[--this.size] = null; // Son elemanı null yap
        return removedData;
    }

    // Verilen indisteki elemanı değiştirir
    public T set(int index, T data) {
        if (index < 0 || index >= this.size) {
            return null;
        }
        T oldData = this.array[index];
        this.array[index] = data;
        return oldData;
    }

    // Listeleme
    @Override
    public String toString() {
        StringBuilder text = new StringBuilder(" ");
        for (T t : this.array) {
            if (t != null) {
                text.append(t).append(",");
            }

        }
        return "[" + text.substring(0, text.length() - 1) + "]";
    }

    // Belirtilen öğenin ilk indeksini döndürür, yoksa -1 döndürür
    public int indexOf(T data) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    // Belirtilen öğenin son indeksini döndürür, yoksa -1 döndürür
    public int lastIndexOf(T data) {
        for (int i = this.size - 1; i >= 0; i--) {
            if (this.array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    // Liste boş mu kontrol eder
    public boolean isEmpty() {
        return this.size == 0;
    }

    //Listedeki öğeleri, aynı sırayla bir array haline getirir.
    public T[] toArray() {
        T[] newArray = this.array;
        return newArray;
    }

    //Temizleme
    public void clear() {
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = null;
        }
    }

    // Belirtilen aralıkta alt bir liste döner
    public MyList<T> subList(int start, int finish) {
        if (start < 0 || finish >= this.size || start > finish) {
            return null;
        }
        MyList<T> sublist = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            sublist.add(this.array[i]);
        }
        return sublist;
    }

    // Verilen değerin dizide olup olmadığını kontrol eder
    public boolean contains(T data) {
        return indexOf(data) != -1;
    }

}
