package com.bind.list_hometask;
import java.util.Arrays;

public class implementation<E>{
	private int size = 0;
    private static final int cap = 10;
    private Object arr[];
    public implementation() {
        arr = new Object[cap];
    }
 
    public void addele(E e) {
        if (size == arr.length) {
            ensureCapacity();
        }
        arr[size++] = e;
    }
     
    @SuppressWarnings("unchecked")
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) arr[i];
    }
    @SuppressWarnings("unchecked")
    public E removeele(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = arr[i];
        int num = arr.length - ( i + 1 ) ;
        System.arraycopy( arr, i + 1, arr, i, num ) ;
        size--;
        return (E) item;
    }
    public int size() {
        return size;
    }
    @Override
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(arr[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
     
    private void ensureCapacity() {
        int newSize = arr.length * 2;
        arr = Arrays.copyOf(arr, newSize);
    }

}
