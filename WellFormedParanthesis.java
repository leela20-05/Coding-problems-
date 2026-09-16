package VeevaSystems;
import java.util.*;
public class WellFormedParanthesis {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = generateParanthesis(n);
        System.out.print(list);
    }
    public  static List<String> generateParanthesis(int n){
        List<String> result = new ArrayList<>();
        generate("",0,0,n,result);
        return result;
    }
    public static void generate(String current , int open , int closed , int n , List<String> result){
        if(current.length() == 2*n){
            result.add(current);
            return;
        }
        if(open < n){
            generate(current+"(",open+1,closed,n,result);
        }
        if(closed<open){
            generate(current+")",open,closed+1,n,result);
        }
    }
}
