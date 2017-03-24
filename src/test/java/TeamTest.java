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
  public void getId_TeamInstantiatesWithAnId_1() {
    Team.clear();
    Team myTeam = new Team("Epicoders");
    assertEquals(1, myTeam.getId());
  }
}
