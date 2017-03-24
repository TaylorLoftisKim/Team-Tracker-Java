import java.util.List;
import java.util.ArrayList;

public class Member {
  private String mMemberName;
  private static ArrayList<Member> instances = new ArrayList<Member>();
  private int mId;

  public Member(String memberName) {
    mMemberName = memberName;
    instances.add(this);
    mId = instances.size();
  }

  public String getName() {
    return mMemberName;
  }

  public static ArrayList<Member> all() {
    return instances;
  }
}
