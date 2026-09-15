class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        ransomNote = ransomNote.toLowerCase();
        magazine = magazine.toLowerCase();

        ransomNote = ransomNote.replace("" , "");
        magazine = magazine.replace("" , "");

        int[] counts = new int[26];

        for(int i = 0; i < magazine.length(); i++){
            counts[magazine.charAt(i) - 'a']++;
        }

        for(int i = 0; i < ransomNote.length(); i++){
            counts[ransomNote.charAt(i) - 'a']--;
        
        if(counts[ransomNote.charAt(i) - 'a'] < 0){
            return false;
        }
        }
        return true;
        
    }
}