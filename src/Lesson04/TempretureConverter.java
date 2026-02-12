package Lesson04;

public class TempretureConverter {

public static void main (String[] args){

    int temp = converter(70);
    System.out.println(temp);
}
static int converter(int fahrenheit) {
    return (fahrenheit-32)*5/9;

}

}
