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

  @Test
  public void clear_emptiesAllMembersFromArrayList() {
    Member myMember = new Member("Taylor");
    Member.clear();
    assertEquals(0, Member.all().size());
  }

  @Test
  public void getId_MemberInstantiatesWithAnId_1() {
    Member.clear();
    Member myMember = new Member("Taylor");
    assertEquals(1, myMember.getId());
  }
}
