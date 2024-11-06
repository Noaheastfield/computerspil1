import java.util.*;
public class City implements Comparable<City>{
    private String name;
    private int value;
    private int initialValue;

    public City(String name, int value) {
        this.name = name;
        this.value = value;
        this.initialValue = value;
    }

    public void changeValue(int amount){
        value += amount;
    }

    public void reset(){
        value = initialValue;
    }

    public String toString(){
        return name + " (" + value + ")";
    }

    @Override
    public int compareTo(City o) {
        return name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object otherObject){
        if(this == otherObject){return true;}
        if(otherObject == null){return false;}
        if(getClass() != otherObject.getClass()){return false;}
        City other = (City)otherObject;
        return name.equals(other.name);
    }

    @Override
    public int hashCode(){
        int hc = 0;
        for(int i= 0 ; i < name.length(); i++){
            hc = 31 * hc + name.charAt(i);
        }
        return hc;
    }



    public String getName() {
        return name;
    }
    public int getValue() {
        return value;
    }
    public int getInitialValue() {
        return initialValue;
    }
}
