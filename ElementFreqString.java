import java.util.HashMap;

class ElementFreqString{
    public static void main(String[] args) {

        String str = "hhello";
        char charArr[] = str.toCharArray();
        int sizeStr = charArr.length;

        HashMap <Character, Integer> freqHash = new HashMap<>();
        for(int i = 0; i < sizeStr; i++){
            Integer val = freqHash.get(charArr[i]);
            if(val == null){
                freqHash.put(charArr[i], 1);
            }else{
                freqHash.put(charArr[i], ++val);
            }
        }

        System.out.println(freqHash);

    }
}