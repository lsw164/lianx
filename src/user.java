public class user {
    private int StuId;
    private String parsword;
    public int getStuId() {
        return StuId;
    }

    public user(int stuId) {
        this.StuId = stuId;
    }

    public String getParsword() {
        return parsword;
    }

    public user(String parsword) {
        this.parsword = parsword;
    }
}
