import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Parallelepiped parallelepiped = new Parallelepiped();

            Scanner scanner = new Scanner(System.in);
            System.out.println("1.Area    2.Volume");
            int areaVolume = scanner.nextInt();
            if (areaVolume == 1) {
                System.out.println("Length: ");
                int length = scanner.nextInt();
                System.out.println("Width: ");
                int width = scanner.nextInt();
                System.out.println("Height: ");
                int height = scanner.nextInt();
                if (length > 0 || height > 0 || width > 0) {

                    if (length < 20 || height < 20 || width < 20) {
                        parallelepiped.getArea(height,length,width);
                    } else{
                        throw new RuntimeException("20 dan chon san beruugo bolboyt");
                    }
                }else{
                    throw new RuntimeException("noldon kichine san beruugo bolboyt");
                }

            } else if (areaVolume==2) {

                System.out.println("Length: ");
                int length= scanner.nextInt();
                System.out.println("Width: ");
                int width= scanner.nextInt();
                System.out.println("Height: ");
                int height= scanner.nextInt();
                if(length>0||width>0||height>0){
                    parallelepiped.getVolume(length,width,height);
                    if(length<20||width<20||height<20){
                    }else{
                        throw new RuntimeException("the given value can't be greater that 20");
                    }

                }else{
                    throw new RuntimeException("the given number can't be zero");
                }
            }


        } catch (InputMismatchException e){
            System.out.println("The given can't be a character!!");



        }
        }

    }


