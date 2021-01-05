import java.util.*;
public class PigLatin{
  public static void main(String[] args){
    Scanner n = new Scanner(System.in);
    while(n.hasNextLine()){
      Scanner z = new Scanner(n.nextLine());
      while(z.hasNext()){
        System.out.print(pigLatinBest(z.next()));
        if(z.hasNext()){
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static String pigLatinSimple(String s){
    String word = s.toLowerCase();
    String[] letters = {"a", "e", "i", "o", "u"};
    for(String str : letters){
      if(word.substring(0,1).equals(str)){
        return word + "hay";
      }
    }
    if(word.length() < 2){
      return word + "ay";
    }
    else{
      return word.substring(1) + word.charAt(0) + "ay";
    }
  }

  public static String pigLatin(String s){
    String word = s.toLowerCase();
    String[] letters = {"a", "e", "i", "o", "u"};
    String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh",
                        "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk",
                        "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    for(String str : letters){
      if(word.substring(0,1).equals(str)){
        return word + "hay";
      }
    }
    if(word.length() < 2){
      return word + "ay";
    }
    for(String str : digraphs){
      if(word.substring(0,2).equals(str)){
        return word.substring(2) + word.substring(0,2) + "ay";
      }
    }
    return word.substring(1) + word.charAt(0) + "ay";
  }

  public static String pigLatinBest(String s){
    String word = s.toLowerCase();
    if(!Character.isLetter(word.charAt(0))){
      return word;
    }
    String hz = "";
    if(!Character.isLetter(word.charAt(word.length()-1))){
      hz = word.substring(word.length()-1);
      word = word.substring(0, word.length()-1);
    }

    String[] letters = {"a", "e", "i", "o", "u"};
    String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh",
                        "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk",
                        "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    for(String str : letters){
      if(word.substring(0,1).equals(str)){
        return word + "hay" + hz;
      }
    }
    if(word.length() < 2){
      return word + "ay" + hz;
    }
    for(String str : digraphs){
      if(word.substring(0,2).equals(str)){
        return word.substring(2) + word.substring(0,2) + "ay" + hz;
      }
    }
    return word.substring(1) + word.charAt(0) + "ay" + hz;
  }
}
