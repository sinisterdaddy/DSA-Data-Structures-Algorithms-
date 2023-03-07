import java.util.*;

public class hash{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Keys: ");
        int[] ar=new int[10];
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<String> hm=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        ArrayList<String> hm2=new ArrayList<>();
        for(int i=0;i<10;i++){
            ar[i]=sc.nextInt();
            int cnt=1;
            for(int j=0;j<10;j++){
                int pos=((2*ar[i]+3)+j)%10;
                if(al.contains(pos)){
                    al.add(pos);
                    cnt++;
                }
                else{
                    al.add(pos);
                    String s=ar[i]+" -> "+pos+" -> "+cnt;
                    hm.add(s);
                    break;
                }
            }
            int c=1;
            for(int j=0;j<10;j++){
                int pos=((2*ar[i]+3)+(j*j))%10;
                if(al2.contains(pos)){
                    al2.add(pos);
                    c++;
                }
                else{
                    al2.add(pos);
                    String s=ar[i]+" -> "+pos+" -> "+c;
                    hm2.add(s);
                    break;
                }
            }
        }
        System.out.println("");
        System.out.println("LINEAR PROBING: ");
        System.out.println("KEY -> LOCATION -> PROBE:");
        for(int i=0;i<hm.size();i++){
            System.out.println(hm.get(i));
        }
        System.out.println();
        System.out.println("QUADRATIC PROBING: ");
        System.out.println("KEY -> LOCATION -> PROBE:");
        for(int i=0;i<hm2.size();i++){
            System.out.println(hm2.get(i));
        }
        sc.close();
    }
}