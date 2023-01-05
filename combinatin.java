package samplel;
import java.util.*;
public class combinatin {
    public static void rec(int ref,int k,int n,List<List<Integer>> ans,String temp,int val,int sum){
        if(k==0&&sum==n){
            List<Integer> temp1=new ArrayList<>();
            for(char ch:temp.toCharArray()){
                temp1.add(ch-'0');
            }
            if(temp1.size()==ref){
            ans.add(temp1);
            }
        }
        if(k<0){
            return;
        }
        if(sum>n){
            return;
        }
        rec(ref,k--,n,ans,temp+val,val+1,sum+val);
        rec(ref,k--,n,ans,temp,val+1,sum);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int k=input.nextInt();
        int n=input.nextInt();
        List<List<Integer>> ans=new ArrayList<>();
        String temp="";
        int sum=0;
        int val=1;
        rec(k,k,n,ans,temp,val,sum);
        System.out.println(ans);
    }
}
