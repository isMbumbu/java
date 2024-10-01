class Lion{
    //declaring variables
    String color;
    int size;
    String gender;
    //constructor
    public Lion(String color, int size, String gender){
        this.color=color;
        this.size=size;
        this.gender=gender;
    }
    //getColor
    public String getColor(){
        return color;
    }
    //setColor
    public void setColor(String color){
        this.color=color;
    }
    //getSize
    public int getSize(){
        return size;
    }
    //setSize
    public void setSize(int size){
        if (size>0) {
            this.size=size;
        }
    }
    //getGender
    public String getGender(){
        return gender;
    }
    //setGender
    public void setGender(String gender){
        if(gender.equals("male")||gender.equals("female")){
            this.gender=gender;
        }
    }

    public void sound(){
        System.out.println("Roars");
    }
}
class Main{
    public static void main(String[] args){
        Lion drey= new Lion("brown",45,"male");
        System.out.println("This new lion is color: "+drey.color+"and in kilograms is: "+drey.size+" kgs. It is also "+drey.gender);
    }
}