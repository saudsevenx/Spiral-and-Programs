import java.util.HashMap;


class ElementFreq{

    public static void main(String[] args){

        int arr[] = {1, 2, 8, 3, 2, 2, 2 ,5, 1};
        int sizeOfArr = arr.length;
        System.out.println(sizeOfArr);
        HashMap <Integer, Integer> freqHash = new HashMap<>();

        for(int i = 0; i < sizeOfArr; i++){
            
            Integer count = freqHash.get(arr[i]);
        
            if(freqHash.get(arr[i]) == null){
                freqHash.put(arr[i], 1);
            }else{
                freqHash.put(arr[i], ++count);
            }
        }

        System.out.println(freqHash);

    }

}