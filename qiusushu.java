public class qiusushu {
    public static void main(String[] args) {
        int count=0;
        for(int i=2;i<=200;i++){
            boolean sushu=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                   sushu=false;
                }
            }if(sushu){
                count++;
                System.out.println(i+"是素数");
            }
            }
        System.out.println("素数有"+count+"个");
    }
}
