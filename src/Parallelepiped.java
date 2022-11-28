public class Parallelepiped {

    public void  getArea (int height,int length , int width){
        double area=2*((height * length) + (length * width) + (height * width));
        System.out.println("Area: "+area);
    }
    public void getVolume(int height,int length,int width){
        System.out.println("Volume: "+(length*width*height));

    }


}



