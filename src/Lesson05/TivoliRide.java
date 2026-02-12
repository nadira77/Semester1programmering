package Lesson05;
public class TivoliRide {
 String name;
 int rideHeight;
 //constructor


public TivoliRide (String name,int rideHeight){
 this.name = name;
 this.rideHeight = rideHeight;
}
public String checkHeight(int personHeight) {
 if (personHeight > rideHeight) {
  return "Enjoy the ride";
 } else if (personHeight < rideHeight) {
  return "you are not tall enough";
 } else {
  return "invalid";
 }
}
}