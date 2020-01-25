 

/**
 * Created by Yang on 1/23/20.
 */
import java.util.Arrays; 
import java.util.*; 
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(int i = 0; i<array.length;i++){
            if(array[i]==value)
                return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String [] arrNew = new String[array.length];
        int count =0;
        for(int i =array.length;i>0;i--){
            arrNew[count] = array[i-1];
            ++count;
        }
        return arrNew;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String [] original = reverse(array);
        if(Arrays.equals(array,original)){
            return true;
        }else{
            return false;
        }
     
        
    }
    

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
       int index = 0;
       String input;
       boolean[] visited = new boolean[26];
       for(int i =0;i<array.length;i++){
           input = array[i];
        for (int id = 0; id < input.length(); id++) {
            if ('a' <= input.charAt(id) && input.charAt(id) <= 'z') {
                index = input.charAt(id) - 'a';
            } else if ('A' <= input.charAt(id) && input.charAt(id) <= 'Z') {
                index = input.charAt(id) - 'A';
            }
            visited[index] = true;
        }
    }
 
        for (int id = 0; id < 26; id++) {
            if (!visited[id]) {
                return false;
            }
        }
        return true;
    }
    


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count =0;
         for(int i = 0; i<array.length;i++){
            if(array[i]==value)
                ++count;
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> al = new ArrayList<String>(Arrays.asList(array)); 
        al.remove(valueToRemove);
        Object [] finalAr = al.toArray();
        String[] finalArr = al.toArray(new String[al.size()]);
        
         
        return finalArr;
         
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
            List<String> newList = new ArrayList<String>(Arrays.asList(array)); 
            
            for(int i = 1; i < newList.size(); i++) {
                if(newList.get(i-1) != newList.get(i)) {
                    newList.add(newList.get(i));
            }
           }
            Object [] finalAr = newList.toArray();
            String[] finalArr = newList.toArray(new String[newList.size()]);
                return finalArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int count =1;
        
            List<String> newList = new ArrayList<String>();
            while(count<array.length){
                while(array[count-1].equals(array[count])){
                    newList.add(array[count-1]);
                    ++count;
                }
                newList.add(array[count]);
            }
        
             Object [] finalAr = newList.toArray();
            String[] finalArr = newList.toArray(new String[newList.size()]);
            return finalArr;
        
    }
     public static void main(String[] args){
         StringArrayUtils ut = new StringArrayUtils();
         String[] arr = new String[3];
         arr[0] = "word3";
         arr[1] = "word2";
         arr[2] = "word1";
        
         arr= ut.reverse(arr);
         for(int i =0;i<arr.length;i++){
         System.out.println(arr[i]);
        }
        }

}
