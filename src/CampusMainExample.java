/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import Campus.*;

/**
 *
 * @author kal bugrara
 */
public class CampusMainExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         * 0. Create Address object
         * 1. create campus object
         * 2. Create and add buildings
         * 3. Create and floors
         * 4. Create and add rooms
         * 5. Assign sprinkers.
         * 6. Write methods to determine is campus safe => are builinds safe etc.
         */

        Address newAddress = new Address(1, "Willow Street", "95131", "30,60");            
        Campus campus = new Campus(newAddress);

        Address newAddress2 = new Address(2, "SanJose", "95555", "10,20");
        Building building1 = new Building(1, newAddress2);

        Address newAddress3 = new Address(2,"newyork","10101","40,70");
        Building building2 = new Building(1,newAddress3);

        Floor floor1 = new Floor(1,building1);
        Floor floor2 = new Floor(2,building1);

        Floor floor1_2 = new Floor(1,building2);
        Floor floor2_2 = new Floor(2,building2);

        Classroom room1 = new Classroom(1, floor1);
        Classroom room2 = new Classroom(2, floor1);
        Classroom room3 = new Classroom(3, floor2);
        Classroom room4 = new Classroom(4, floor2);

        room1.setSprinkler("A_Brand", "001");
        room2.setSprinkler("A_Brand", "002");
        room3.setSprinkler("B_Brand", "003");
        
       if(campus.isCampusSafe()){
        System.out.println("Campus is safe");
       }else{
        System.out.println("Campus is not safe");
       }


        

    }



}
