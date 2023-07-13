public class FlourPacker {
    // write your code here
    public static boolean canPack(int bigCount,int smallCount, int goal){
        if(bigCount<0||smallCount<0||goal<0){
            return false;
        }

        while(goal-5>=0 && bigCount>0){
            goal=goal-5;
            bigCount=bigCount-1;
        }
        if(smallCount>=goal && bigCount>=0){
            return true;
        }
        return false;

    }
}