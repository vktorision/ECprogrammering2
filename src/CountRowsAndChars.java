public class CountRowsAndChars {
    public int radAnt = 0;
    public int teckAnt = 0;
    public int ordAnt = 0;
    public boolean inteStop = true;
    public int longestCount = 0;
    public String longestWord = "";


    public void count(String rad) {
        if (rad.equals("stop")){
            inteStop = false;
        }
        else {
            radAnt = radAnt + 1;
            teckAnt = teckAnt + rad.length();
            String[] ord = rad.trim().split("\\s+");
            ordAnt = ordAnt + ord.length;
            for(String ordet: ord) {
                if (ordet.length() > longestCount) {
                    longestCount = ordet.length();
                    longestWord = ordet;
                }
            }
        }
    }


}
