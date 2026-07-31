class Solution {
    public int countSubstrings(String s) {
     int count = 0;
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list1 = new ArrayList<>();
		for(int i = 0; i < s.length();i++){
		    for( int j = i ;j < s.length();j++){
		        list.add(s.substring(i,j+1));
		    }
		}
		
		for(int i = 0; i < s.length();i++){
		    for( int j = i ;j < s.length();j++){
		       String sub = s.substring(i,j+1);
		       String rev = new StringBuilder(sub).reverse().toString();
		       list1.add(rev);
		    }
		}
		for(int i =0;i < list.size();i++){
		    if(list.get(i).equals(list1.get(i))){
		        count++;
		    }
		}
        return count;
     
    }
}
