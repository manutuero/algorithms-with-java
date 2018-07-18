public class Cadenas {
    public boolean isCapicua(String s) {

        boolean isCapicua = true;
        int i = 0;
        int j = s.length() - 1;
        char inc, dec;

        while (i < j) {
            inc = s.charAt(i);
            dec = s.charAt(j);

            if(inc == ' ') {
                i++;
                continue;
            } else if(dec == ' ') {
                j--;
                continue;
            }

            if(s.charAt(i) != s.charAt(j)) {
                   isCapicua = false;
                   break;
            }

            i++; j--;
        }

        return isCapicua;
    }
}
