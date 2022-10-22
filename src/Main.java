
import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String [] args){

//        COPY - PAST


        ArrayList<String> cars = new ArrayList<String>();
        cars.add("volvo");
       cars.add("mers");
       cars.add("bmw");
       cars.add("mazda");
      System.out.println(cars);

        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));}

       for (String i : cars){
            System.out.println(i);
        }

        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(15);
        nums.add(20);
        nums.add(7);
        nums.add(93);

        for (int i : nums){
            System.out.println(i);}


        Collections.sort(cars);
        for (String i : cars){
            System.out.println(i);
       }

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
      myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);

        for (int i : myNumbers){
            System.out.println(i);
        }

        System.out.println(cars);

        String car = cars.get(0);
        System.out.println("get method " + car);

        cars.set(0, "Opel");
        System.out.println("set " + cars);

        cars.remove(0);
        System.out.println("remove " + cars);

        cars.clear();
        System.out.println("clear " + cars);

        int s = cars.size();
        System.out.println("list size: " + s);

//Task1
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("pink");
        System.out.println(colors);

//       Task2
        colors.add(0, "black");
        System.out.println("insert to first position " + colors);

//        Task3
        String color = colors.get(2);
        System.out.println("retrieve 1 element: " + color);

//        Task4
        colors.set(2, "black");
       System.out.println("update " + colors);

//        Task5
       colors.remove(2);
      System.out.println("remove 3 element " + colors);

//        Task6
        for (int i = 0; i < colors.size(); i++){
            if (colors.get(i).equals("blue")){
               System.out.println(i);
                break;
            }
        }

        int task6 = colors.indexOf("blue");
        System.out.println(task6);


//        Task 7
       ArrayList<String> colors2 = new ArrayList<String>(colors);
        System.out.println(colors2);

//        Task8

        Collections.shuffle(colors);
        for (String i : colors){
            System.out.println(i);
       }

//        Task9
        System.out.println("before reverse: " + colors);
        Collections.reverse(colors);
        System.out.println("after reverse: " + colors);}}


