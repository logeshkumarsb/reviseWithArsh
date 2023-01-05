/*bulls and cows*/
class Solution {
    public String getHint(String secret, String guess) {
        int bull=0;
        int cow=0;
        boolean[] vis=new boolean[secret.length()];
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bull++;
                vis[i]=true;
            }
        }
        String s1="";
        String s2="";
        int[] hash1=new int[256];
        int[] hash2=new int[256];
        for(int i=0;i<secret.length();i++){
            if(!vis[i]){
                s1=s1+secret.charAt(i);
                hash1[secret.charAt(i)]++;
                s2=s2+guess.charAt(i);
                hash2[guess.charAt(i)]++;
            }
         }
         for(int i=0;i<secret.length();i++){
            if(!vis[i]){
               if(hash1[secret.charAt(i)]>0&&hash2[secret.charAt(i)]>0){
                   cow++;
                   hash1[secret.charAt(i)]--;
                   hash2[secret.charAt(i)]--;
               }
            }
        }
        return bull+"A"+cow+"B";
    }
}
