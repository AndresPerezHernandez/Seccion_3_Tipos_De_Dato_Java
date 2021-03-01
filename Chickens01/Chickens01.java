
package chickens01;

public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        int eggsPerChicken=4;
        int chickensCount=8;
        int totalEggsMon;
        totalEggsMon=eggsPerChicken*chickensCount;
        chickensCount++;
        
        int totalEggsTue;
        totalEggsTue=eggsPerChicken*chickensCount+totalEggsMon;
       chickensCount=chickensCount/2;
        
        int totalEggsWed;
        totalEggsWed=chickensCount*eggsPerChicken+totalEggsTue;
        chickensCount++;
        
    int totalEggs;
    totalEggs=totalEggsWed;
    System.out.println(chickensCount);
    System.out.println(totalEggs);
    }   
}
