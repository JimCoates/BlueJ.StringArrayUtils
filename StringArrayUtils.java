 

/**
 * Created by leon on 1/29/18.
 */
 
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;
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
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
       boolean answer = false;    
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
               answer = true;}
        }
                return answer;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
      String[] answerArray = new String[array.length];
      int j = 0;
      for(int i = array.length - 1; i >=0; i--) { 
          answerArray[j] = array[i];
          j++;
        }
      return answerArray; 
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean answer = false; 
        if(Arrays.equals(array,StringArrayUtils.reverse(array))){
        answer = true;
        }
        return answer; 
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String sentance = Arrays.toString(array);
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String sentanceLower = sentance.toLowerCase();
        System.out.println(sentance);
        
        for(char letter : alphabet) {
        if(!sentanceLower.contains(String.valueOf(letter))){
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
        int answer = 0;
        
        for(int i = 0; i<array.length; i++) {
            if(array[i].equals(value)){
                answer += 1;
            }
        }
        
        return answer;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
       String[] answer = new String[array.length - 1];
       
        for(int i = 0, k =0; i < array.length; i++){
            if(array[i] != valueToRemove){
                answer[k++] = array[i];
                }
    }
    return answer;
}

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> answerList = new ArrayList<String>();
        
        for (int i = 1, j = 0; i < array.length; i++, j++) {
            if(array[j] != array[i]){
            answerList.add(array[j]);
            }
        }
        answerList.add(array[array.length - 1]);
        String[] myArray = answerList.toArray(new String[answerList.size()]);
        return myArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> newList = new ArrayList<String>(Arrays.asList(array));
        List<String> answerList = new ArrayList<String>();
        String temp = array[0];
        
        for(int i=1, j=0; i < array.length; i++, j++) {
            if(array[j].equals(array[i])){ 
               temp += array [i];     
            } else {
                answerList.add(temp);
                temp = array[i];
            }
            if(i == array.length - 1) {
            answerList.add(temp);
            }
        }
        System.out.println(Arrays.toString(answerList.toArray()));
        String [] answer = answerList.toArray(new String[answerList.size()]);
        return answer;
    }


}
