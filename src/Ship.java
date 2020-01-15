public abstract class Ship {
    protected int length;
    protected int damage;
    
    int getLength(){
        return length;
    }

    boolean isSunk(){
        if(this.damage == this.length) {
            return true;
        }
        return false;
    }
}