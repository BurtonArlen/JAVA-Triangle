

public class Triangle {

  private int uiSide1;
  private int uiSide2;
  private int uiSide3;

  public Triangle(int side1, int side2, int side3) {
    uiSide1 = side1;
    uiSide2 = side2;
    uiSide3 = side3;
  }
  public int getSide1() {
    return uiSide1;
  }

  public int getSide2() {
    return uiSide2;
  }

  public int getSide3() {
    return uiSide3;
  }

  public boolean isTriangle() {
    boolean isTrue = true;
    if(uiSide1 > (uiSide2 + uiSide3) || uiSide2 > (uiSide3 + uiSide1) || uiSide3 > (uiSide2 + uiSide1)) {
      isTrue = false;
    }
    return isTrue;
  }

  public String checkType() {
    String tri = "";
    String equ = "equilateral";
    String iso = "isosceles";
    String sca = "scalene";
    if((uiSide1 == uiSide2) && (uiSide3 == uiSide2)) {
      tri = equ;
    }
    else if(((uiSide1 == uiSide2) && (uiSide3 != uiSide1)) || ((uiSide2 == uiSide3)&&(uiSide1 != uiSide2)) || ((uiSide3 == uiSide1) && (uiSide2 != uiSide3))){
      tri = iso;
    }
    else if((uiSide1 != uiSide2) && (uiSide3 != uiSide2)) {
      tri = sca;
    }
    return tri;
  }

}
