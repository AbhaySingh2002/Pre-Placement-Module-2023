class Solution {
public String frequencySort(String s) {

    char[] str = s.toCharArray();
    HashMap<Character, Integer> hmap = new HashMap<>();
    for(char c:str){
        if(hmap.containsKey(c)){
            hmap.put(c,hmap.get(c)+1);
        }else{
            hmap.put(c,1);
        }
    }
    
    ArrayList<Character> al = new ArrayList<>(hmap.keySet());
    Collections.sort(al,(a,b)->hmap.get(b)-hmap.get(a));
    
    StringBuilder sb = new StringBuilder();
    
    for(Character c: al){
        for(int i=0;i<hmap.get(c);i++){
            sb.append(c);
        }
    }
    
    return sb.toString();
}
}