import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void Member_instantiatesCorrectly_true() {
    Member myMember = new Member("");
    assertEquals(true, myMember instanceof Member);
  }

  @Test
  public void Member_instantiatesWithName_String() {
    Member myMember = new Member("Taylor");
    assertEquals("Taylor", myMember.getName());
  }

  @Test
  public void all_returnsAllInstancesOfMembers_true() {
    Member myMember1 = new Member("Taylor");
    Member myMember2 = new Member("Ya Boy");
    assertEquals(true, Member.all().contains(myMember1));
    assertEquals(true, Member.all().contains(myMember2));
  }
}
