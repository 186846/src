import java.util.Scanner;

public class shuixianhuashu {
    public static void main(String[] args) {
        int count=0;
       for(int n=100;n<1000;n++){
           boolean a=true;
           int i=n/100;
           int c=(n-i*100)/10;
           int s=n%10;
           if(i*i*i+c*c*c+s*s*s!=n){
              a=false;
           }if(a){
               count++;
               System.out.println(n+"是水仙数");
           }
        }
       System.out.println("水仙数有"+count+"个");
    }
}
