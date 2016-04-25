import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {
  @Test
  public void TriangleTest_itShouldInstantiateATriangle_int() {
    Triangle testTriangle = new Triangle(2, 2, 2);
    assertEquals(2, testTriangle.getSide1());
  }
  @Test
  public void TriangleTest_itShouldTakeSide2_int() {
    Triangle testTriangle = new Triangle(2, 2, 2);
    assertEquals(2, testTriangle.getSide2());
  }
  @Test
  public void TriangleTest_itShouldTakeThirdSide_int() {
    Triangle testTriangle = new Triangle(2, 2, 2);
    assertEquals(2, testTriangle.getSide3());
  }

  @Test
  public void TriangleTest_isTriangle_true() {
    Triangle testTriangle = new Triangle(2, 3, 6);
    assertEquals(false, testTriangle.isTriangle());
  }

  @Test
  public void TriangleTest_isIsoscelesTriangle_string() {
    Triangle testTriangle = new Triangle(2, 2, 2);
    assertEquals("equilateral", testTriangle.checkType());
  }

  @Test
  public void TriangleTest_isEqilateralTriangle_string() {
    Triangle testTriangle = new Triangle(3, 3, 2);
    assertEquals("isosceles", testTriangle.checkType());
  }

  @Test
  public void TriangleTest_isScaleneTriangle_string() {
    Triangle testTriangle = new Triangle(2, 3, 4);
    assertEquals("scalene", testTriangle.checkType());
  }
}
