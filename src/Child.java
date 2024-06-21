public class Child {
    public int x=10;

    public int getX(){
        return x;
    }

    // public void setX(int x){
    //     this.x=x;
    // }
    //Setter cannot be used when using final

    public Child(int x){
        this.x = x;
    }

    public Child(){
        this.x=10;
    }
}
