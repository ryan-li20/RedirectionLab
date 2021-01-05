import java.util.*;
public class MakeStars{
  public static void main(String[] args){
    Scanner n = new Scanner(System.in);
    while(n.hasNextLine()){
      Scanner z = new Scanner(n.nextLine());
      while(z.hasNext()){
        System.out.print(stars(z.next().length()));
        if(z.hasNext()){
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
  public static String stars(int i){
    String guy = "";
    for(int j = 0; j < i; j++){
      guy = guy + "*";
    }
    return guy;
  }
}
