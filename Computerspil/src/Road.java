public class Road implements Comparable<Road>{
    private City from;
    private City to;
    private int length;

    public Road(City from, City to, int length) {
        this.from = from;
        this.to = to;
        this.length = length;
    }
    public String toString(){
        return from + " -> " + to + " : " + length;
    }

    @Override
    public int compareTo(Road other){
        if(from.compareTo(other.from) != 0) {
            return from.compareTo(other.from);
        }
        if(to.compareTo(other.to) != 0) {
            return to.compareTo(other.to);
        }
        return length - other.length;
    }

    @Override
    public boolean equals(Object otherObject){
        if(this == otherObject){return true;}
        if(otherObject ==null) { return false;}
        if(getClass() != otherObject.getClass()) {return false;}
        Road other = (Road)otherObject;
        return from.equals(other.from) && to.equals(other.to) && length == other.length;
    }

    @Override
    public int hashCode(){
        return 11 * from.hashCode() +
                13 * Integer.hashCode(length);
    }



    public City getFrom() {
        return from;
    }

    public City getTo() {
        return to;
    }

    public int getLength() {
        return length;
    }
}
