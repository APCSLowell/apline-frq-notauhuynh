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
    return (aHold * -1)/bHold;
  }
  public boolean isOnLine(int a, int b){
    
  }
}
