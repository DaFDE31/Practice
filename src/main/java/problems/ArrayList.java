package problems;
import java.util.Objects;

public class ArrayList <G>{

    private G[] list; // The array that holds the values
    private int size; // A count of how many non-null values are in the list

    public ArrayList(){
        list = (G[]) new Object[5]; // creates an array of size 5
        size = 0;
    }

    public ArrayList(G[] array){
        list = array; // copies the array from array parameter.
        size = array.length;
    }

    public void add(G value){ // This method adds a value to the list
        if (size >= list.length){// This if statement adds 5 more empty spots in the list if it is full
            G[] temp = (G[]) new Object[list.length +5];
            System.arraycopy(list,0,temp,0, list.length);
            //TODO **URGENT**//
            // Look up how to use System.arraycopy, it'll help a lot. ///////////////////////////
            list = temp;
        }

        list[size] = value;
        size++;

    }

    //TODO Make a method that will insert a value into the list at the specified index.
    // So insert(3,2) should insert 3 into the second index.
    // HINT: LOOKUP HOW TO USE System.arraycopy
    public void insert(G value, int index){
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

    //TODO This method should replace the value at the index with the new value.
    // [2,3], replace(1,0) would turn that list into [1,3]
    public void replace(G value, int index){
        ;
    }

    //TODO return the size of the list.
    public int size(){
        return 0;
    }

    //TODO return true if the value is inside the list, false otherwise
    public boolean contains(G value){

        return false;
    }

    //TODO returns the value at the index
    // [1,2,3] get(0) returns 1
    public G get (int index){
        return null;
    }
    //TODO Finds the index of the value, returns -1 if the value isn't in the list.
    // [5,6,7,3] index(4) returns -1 and index(7) returns 2.
    public int index (G value){
        return 0;
    }

    //TODO Remove the value at whatever index is specified.
    // [1,2,3] remove(1) would make it [1,3] since 2 was at index 1.
    public void removeAtindex(int index){

    }

    //TODO remove the first instance of the value in the list
    // HINT: Using removeAtindex and index methods will make this easy.
    public void remove(G value){

    }


    // EXTRA CREDIT. If you do these you get bragging rights, and possibly money. ///////////

    //TODO Return an intersection of two lists.
    // [1,2,3].instersection([5,6,3,2]) returns [2,3]
    public ArrayList<G> intersection(ArrayList<G> otherList){
        ArrayList<G> inter = new ArrayList<>();

        return inter;
    }
    //TODO Return a union of two lists.
    // [1,2,3].union([5,6,3,2]) returns [1,2,3,5,6]
    public ArrayList<G> union(ArrayList<G> otherList){
        ArrayList<G> u = new ArrayList<>(list);

        return u;
    }
    //TODO Return a symmetric difference of two lists.
    // [1,2,3].difference([5,6,3,2]) returns [1,5,6]
    public ArrayList<G> difference(ArrayList<G> otherList) {
        ArrayList<G> diff = new ArrayList<>(list);

        return diff;
    }


    //DO NOT EDIT BELOW THIS LINE ////////////////////////////////////////////////////////////
    public String toString(){
        String ret = "";
        for (G val : list){
            if (val == null){
                break;
            }
            ret += val.toString() + ", ";

        }
        if (Objects.equals(ret, "")){
            return "[]";
        }
        else{
            return "[" + ret.substring(0, ret.length()-2) + "]";
        }
    }
}
