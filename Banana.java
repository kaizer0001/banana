public class Banana {
    static int maxNumberOfBANANAs(String text) {
        int B = 0, A = 0, N = 0;
        for (char aChar : text.toCharArray())
            switch (aChar) {
                case 'B' : B++;
                break;
                case 'A' : A++;
                break;
                case 'N' : N++;
                break;
            }
        return Math.min(B, Math.min((A/3),(N/2)));
    }
    
    public static void main(String args[]) {
      System.out.println(maxNumberOfBANANAs("NAABXXAN"));
      System.out.println(maxNumberOfBANANAs("NAANAAXNABABYNNBZ"));
      System.out.println(maxNumberOfBANANAs("QABAAAWOBL"));
    }
}
