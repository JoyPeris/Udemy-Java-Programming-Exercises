public class TeenNumberChecker {
    public static boolean hasTeen(int x, int y, int z){
        if(isTeen(x)||isTeen(y)||isTeen(z)){
            return true;
        }else{
            return false;
        }
    };

    public static boolean isTeen(int age){
        if(age>=13 && age<=19){
            return true;
        }else{
            return false;
        }

    };

}