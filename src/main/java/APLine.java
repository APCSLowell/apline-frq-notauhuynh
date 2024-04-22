public class APLine
{
  private int aHold;
  private int bHold;
  private int cHold;

  public APLine(int a, int b, int c){
    aHold = a;
    bHold = b;
    cHold = c;
 }
  public double getSlope(){
    temp = aHold * -1;
    return temp/bHold;
  }
  public boolean isOnLine(int a, int b){
    int temp = (aHold*a) + (bHold*b) + cHold;
    if(temp == 0){
      return true;
    }
    return false;
  }
}
