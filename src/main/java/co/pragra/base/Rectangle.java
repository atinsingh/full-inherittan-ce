package co.pragra.base;

public class Rectangle {
    private int width;
    private int hight;




    public int getWidth() {
        return width;
    }

    public int getHight() {
        return hight;
    }

    public void setWidth(int width) {
        if(width<1){
            System.out.println("Invalid width");
        }else {
            this.width = width;
        }
    }

    public void setHight(int hight) {
        if(hight>1000){
            System.out.println("Invalid Height");
        }else{
            this.hight = hight;
        }

    }

    public void display(){
        System.out.println("Height "+ hight);
        System.out.println("Width "+ width);
    }
}
