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
  public void clear_emptiesAllMembersFromArrayList_0() {
    Member myMember = new Member("Taylor");
    Member.clear();
    assertEquals(0, Member.all().size());
  }

  @Test
  public void getId_memberInstantiatesWithAnId_1() {
    Member.clear();
    Member myMember = new Member("Taylor");
    assertEquals(1, myMember.getId());
  }

  @Test
  public void find_returnsMemberWithSameId_myMember() {
    Member myMember1 = new Member("Taylor");
    Member myMember2 = new Member("Ya Boy");
    assertEquals(Member.find(myMember2.getId()), myMember2);
  }
}
