class Solution {
  bool isAnagram(String s, String t) {
    String s1=(s.split("")..sort()).join();
    String t1=(t.split("")..sort()).join();
    if(s1==t1){
        return true;
    }
    else{
        return false;
    }
    
  }
}