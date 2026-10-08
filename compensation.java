class Member {

    private int age;
    private String name;
    private String city;
    private int year;

    public int collegeFees() {
        return year * 500;
    }

    public int whichYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setYear(int year) {
        this.year = year;
    }
}


class Main {

    public static void main(String[] args) {

        Member obj = new Member();

        obj.setName("Robin");
        obj.setAge(23);
        obj.setCity("New York");
        obj.setYear(3);

        Member obj1 = new Member();

        obj1.setName("Russel");
        obj1.setAge(20);
        obj1.setCity("LA");
        obj1.setYear(2);

        Member[] members = {obj, obj1};

        Member highestFeeMember = members[0];

        for (int i = 0; i < members.length; i++) {

            if (members[i].collegeFees()
                    > highestFeeMember.collegeFees()) {

                highestFeeMember = members[i];
            }
        }

        System.out.println(
                highestFeeMember.getName()
                + " has the highest college fee: $"
                + highestFeeMember.collegeFees()
        );
    }
}