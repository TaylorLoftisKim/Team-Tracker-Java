import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Test
  public void newTeam_instantiatesCorrectly() {
    Team testTeam = new Team("");
    Member testMember = new Member("");
    assertEquals(true, testTeam instanceof Team);
  }

  @Test
  public void Team_instantiatesWithName_String() {
    Team testTeam = new Team("Epicoders");
    assertEquals("Epicoders", testTeam.getTeamName());
  }

  @Test
  public void all_returnsAllInstancesOTeams_true() {
    Team testTeam1 = new Team("Epicoders");
    Team testTeam2 = new Team("C Sharpers");
    assertEquals(true, Team.all().contains(testTeam1));
    assertEquals(true, Team.all().contains(testTeam2));
  }

  @Test
  public void clear_emptiesAllTeamsFromArrayList() {
    Team testTeam = new Team("Epicoders");
    Team.clear();
    assertEquals(0, Team.all().size());
  }

  @Test
  public void getId_teamInstantiatesWithAnId_1() {
    Team.clear();
    Team myTeam = new Team("Epicoders");
    assertEquals(1, myTeam.getId());
  }

  @Test
  public void find_returnsTeamWithSameId_myTeam2() {
    Team myTeam1 = new Team("Epicoders");
    Team myTeam2 = new Team("C Sharpers");
    assertEquals(Team.find(myTeam2.getId()), myTeam2);
  }

  @Test
  public void getMembers_initiallyReturnsEmptyList_ArraryList() {
    Team.clear();
    Team testTeam = new Team("Epicoders");
    assertEquals(0, testTeam.getMembers().size());
  }
  @Test
  public void add_addsMemberToList_true() {
  Team testTeam = new Team("Epicoders");
  Member testMember = new Member("Taylor");
  testTeam.addMember(testMember);
  assertEquals(true, testTeam.getMembers().contains(testMember));
  }
}
