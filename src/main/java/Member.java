public class Member {
    String name;
    int position;

    public Member(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        if(name.length()>5) {
            throw new IllegalArgumentException("이름은 5자이하여야 합니다.");
        }

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
