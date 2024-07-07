public class Member {
    String name;


    public Member(String name) {
        this.name = name;
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

}
