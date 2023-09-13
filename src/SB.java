public class SB {
    public static void main(String[] args) {
//        StringBuilder builder = new StringBuilder();
//        builder = builder.append('a');
//        builder = builder.append('a');
//        System.out.println(builder);

//        for(int i = 0; i<26; i++){
//            char ch = (char)('a' + i);
//            builder.append(ch);
//        }
//        System.out.println(builder);
//        System.out.println(builder.toString());
//        System.out.println(builder.reverse());

//        String s = String.valueOf(builder.reverse());
//        if(String.valueOf(builder) == String.valueOf(s)){
//            System.out.println("yes");
//        }
//        else{
//            System.out.println("false");
//        }
        String a = "aaaaaaaaaabbcbbaaaaaaaaaa";
        System.out.println(palin(a));


    }
    static boolean palin(String s) {
    int i =0;
   int  j = s.length()-1;
    for(int m =0; m<s.length(); m++){
        if(s.charAt(i) == s.charAt(j) ){

          i++;
          j--;
        }
        else{
            return false;
        }
    }
    return true;
    }
}
