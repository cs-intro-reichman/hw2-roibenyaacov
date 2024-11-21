public class Cheers {
        public static void main(String[] args) {
            String word = args[0];
            String needAn = "AEFHILMNORSX";
            int N = Integer.parseInt(args[1]);
            int length = word.length();
            String upperWord = "";
    
            for (int t = 0; t < length; t++) {
                char c = word.charAt(t);
                if (c >= 97 && c <= 122) {
                    c = (char) (c - 32); 
                }
                upperWord = upperWord + c;
            }
    
            for (int t = 0; t < length; t++) {
                char c = upperWord.charAt(t);
                if (needAn.indexOf(c) != -1) {
                    System.out.println("Give me an " + c + ": " + c + "!");
                } else {
                    System.out.println("Give me a  " + c + ": " + c + "!");
                }
            }
    
            System.out.println("What does that spell?");
            for (int z = 0; z < N; z++) {
                System.out.println(upperWord + "!!!");
            }
        }
    }
    




