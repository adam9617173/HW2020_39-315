import java.util.ArrayList;
import java.util.Scanner;

/**
 * Comic_class
 */
public class Comic {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList ary = new ArrayList<>();
        ArrayList obj = new ArrayList<>();

        Comic_class cos = new Comic_class();

        int oper, sum = 0;
        String tmp,tmp0;
        Boolean bln;

        ary.add("1: Add new obj");
        ary.add("2: Search obj");
        ary.add("3: Update obj");
        ary.add("4: Show obj list");

        while(true){
            System.out.println("menu");
            for(int i=0;i<4;i++)System.out.println(ary.get(i));
            System.out.println("operations:");
            oper = scn.nextInt();

            if(oper == 1){
                cos.addcos("", "", "", "", "");
                obj.add(cos.getcos());
            }
            else if (oper == 2){
                System.out.println("Choose one name to search data:");
                tmp = scn.next();
                bln = false;

                for(int i=0;i<obj.size();i++){
                    if(!bln){
                        tmp0 = obj.get(i).toString();
                        bln = tmp0.contains(tmp);
                    }
                    else{  
                        sum = i-1;
                        break;
                    }
                }
                if(bln){
                    
                    System.out.println(obj.get(sum));
                }
                else{
                    System.out.println("Don't have this cosply");
                }
            }
            else if (oper == 3){
                System.out.println("Choose one name to update data:");
                tmp = scn.next();
                
                bln = false;
                for(int i=0;i<obj.size();i++){
                    if(!bln){
                        tmp0 = obj.get(i).toString();
                        bln = tmp0.contains(tmp);
                    }
                    else  break;
                }
                if(bln){
                    cos.addcos("", "", "", "", "");
                    obj.set(obj.indexOf(tmp),cos.getcos());
                }
                else{
                    System.out.println("Don't have this cosply");
                }
            }
            else if (oper == 4){
                for(int i=0;i<obj.size();i++){
                    System.out.println(obj.get(i));
                }
            }
            else {
                System.out.println("plz input operation number!!");
            }
        }
        
    }
}