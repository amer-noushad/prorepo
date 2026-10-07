class computer{
    public String pen(int cost){
        return "Take your pen";
    }
    public void greetings(){
        System.out.println("Thanks for visiting");
    }
}
 class Demo{
    public static void main(String args[]){
        computer obj=new computer();
        String result=obj.pen(23);
        System.out.println(result);
        obj.greetings();
    }
 }



