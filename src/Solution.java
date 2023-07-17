import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {

        Set<String> stringSet = new HashSet<>(Arrays.asList(words));
        String[] uniqueArray = stringSet.toArray(new String[0]);

        int result = 0;

        for(int i =0; i < uniqueArray.length-1; i++ ){
            for(int j = i +1; j < uniqueArray.length; j++){
                StringBuilder sb = new StringBuilder();
                sb.append(uniqueArray[j]);
                sb.reverse();

                if(uniqueArray[i].equals(sb.toString()))
                    result++;
            }
        }

        return result;
    }
}