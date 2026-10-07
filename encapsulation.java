class human{
    private int age;
    private String name;
    public int getage(){
        return age;
    }
    public String getname(){
        return name;
    }
    public void setage(int a){
        age=a;
    }
    public void setname(String b){
        name=b;
    }
}
class Main{
    public static void main(String args[]){
        human obj=new human();
        obj.setage(45);
        obj.setname("robin");
        System.out.println(obj.getage() +" : "+ obj.getname());
    }
}