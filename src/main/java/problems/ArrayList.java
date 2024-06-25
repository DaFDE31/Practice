package problems;

import java.util.Arrays;
import java.util.Objects;

public class ArrayList <G>{
    G[] list;
    int size;
    public ArrayList(){
        list = (G[]) new Object[5]; // creates an array of size 5
        size = 0;
    }

    public ArrayList(G[] array){
        list = array; // creates an array of size 5
        size = array.length;
    }

    public void add(G value){
        if (size >= list.length){
            G[] temp = (G[]) new Object[list.length +5];
            System.arraycopy(list,0,temp,0, list.length);
            list = temp;
        }
        list[size] = value;
        size++;

    }
    public void add(G value, int index){
        G[] temp;
        if (size >= list.length){
            temp = (G[]) new Object[list.length +5];
        }
        else{
            temp = (G[]) new Object[list.length +1];
        }
        System.arraycopy(list,0,temp,0, index);
        temp[index] = value;
        System.arraycopy(list,index,temp,index+1, list.length - index);
        list = temp;
        size++;

    }
    public void replace(G value, int index){
        list[index] = value;
    }
    public int size(){
        return size;
    }

    public boolean contains(G value){
        for (G v : list){
            if (v.equals(value)){
                return true;
            }
        }
        return false;
    }
    public void remove(G value){
        remove(index(value));
    }
    public void remove(int index){
        if (index > -1 && index < size){
            G[] temp = (G[]) new Object[list.length -1];
            System.arraycopy(list,0, temp, 0, index);
            System.arraycopy(list,index+1, temp, index, list.length - index-1);
            //temp = Arrays.copyOfRange(list, 0, index) + Arrays.copyOfRange(list, index+1, list.length);
            list = temp;
            size--;

        }
    }

    public G get (int index){
        try{
            return list[index];
        }
        catch (Exception e){
            System.out.println("Error");
            return null;
        }
    }
    public int index (G value){
        for (int i = 0; i < list.length; i++){
            if (list[i].equals(value)){
                return i;
            }
        }
        return -1;
    }
    public ArrayList<G> intersection(ArrayList<G> otherList){
        return new ArrayList<G>();
    }
    public ArrayList<G> union(ArrayList<G> otherList){
        return new ArrayList<G>();
    }
    public ArrayList<G> difference(ArrayList<G> otherList) {
        return new ArrayList<G>();
    }


    //DO NOT EDIT THIS BELOW THIS LINE ////////////////////////////////////////////////////////////
    public String toString(){
        String ret = "";
        for (G val : list){
            if (val != null){
                ret += val.toString() + ", ";
            }
        }
        if (Objects.equals(ret, "")){
            return "[]";
        }
        else{
            return "[" + ret.substring(0, ret.length()-2) + "]";
        }
    }
}
