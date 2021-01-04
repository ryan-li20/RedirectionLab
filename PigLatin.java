public class PigLatin{
  public static void main(String[] args){
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
      word = word.substring(1) + word.charAt(0) + "ay";
      return word;
    }
  }

}
