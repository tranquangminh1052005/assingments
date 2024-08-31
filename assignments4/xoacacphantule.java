
package assignments4;

import java.util.ArrayList;
import java.util.List;
public class xoacacphantule {
    public static void deleteOddNumber(float[] arrays) {
        List<Float> tempList = new ArrayList<>();
        
        for (float number : arrays) {
            if (number % 2 == 0) { 
                tempList.add(number);
            }
        }
        
        
        float[] newArray = new float[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            newArray[i] = tempList.get(i);
        }
        
       
        System.arraycopy(newArray, 0, arrays, 0, newArray.length);
        
        for (int i = newArray.length; i < arrays.length; i++) {
            arrays[i] = 0;
        }
    }
    
    public static void main(String[] args) {
        float[] arrays = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f};

        System.out.println("mang truoc khi xoa phan tu le:");
        for (float number : arrays) {
            System.out.print(number + " ");
        }
        System.out.println();

        deleteOddNumber(arrays);

        System.out.println("mang sau khi xoa phan tu le:");
        for (float number : arrays) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}


