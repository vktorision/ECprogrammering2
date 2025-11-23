public class CountRowsAndChars {
    public int radAnt = 0;
    public int teckAnt = 0;
    public int ordAnt = 0;
    public boolean inteStop = true;

    public void count(String rad) {
        if (rad.equals("stop")){
            inteStop = false;
        }
        else {
            radAnt = radAnt + 1;
            teckAnt = teckAnt + rad.length();
            String[] ord = rad.trim().split("\\s+");
            ordAnt = ordAnt + ord.length;
        }
    }


}
