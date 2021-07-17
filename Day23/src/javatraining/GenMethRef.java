package javatraining;

interface Data<T> {

    void myData(T[] tarray);

}
class MyClass {

    static <T> void showData(T[] tarray) {
 
        for (T v : tarray) {
 
            System.out.print("["+v+"] ");
    }
    System.out.println();
   }
}

public class GenMethRef {

     static <T> void callShowData(Data<T> daobj, T[] tarray) {
 
        daobj.myData(tarray);
     }

     public static void main(String[] args) {

        Integer[] ivals = {1,2,3,4,5,6,7,8,9};
        String[] svals = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
 
        callShowData(MyClass::<Integer>showData, ivals);
        callShowData(MyClass::showData, ivals);
 
        callShowData(MyClass::<String>showData, svals);
        callShowData(MyClass::showData, svals);
     }
}
