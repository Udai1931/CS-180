import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int lsf = Integer.MAX_VALUE;
        int pist=0;
        int op=0;
        for(int i=0;i<n;i++){
            if(arr[i]<lsf){
                lsf=arr[i];
            }
            pist = arr[i]-lsf;
            if(pist>op){
                op=pist;
            }
        }
        System.out.println(op);
    }

}
