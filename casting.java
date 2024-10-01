interface casting{
    int myInt=9;
    double myDouble= myInt;//implicit casting
}
class trial implements casting{
    //declare a variable
    int addto;
    //create a constructor
    trial(int addto){
        this.addto=addto;
    }
    //add an addition method
    int addition(){
        return (int)myDouble+addto;//explicit casting
    }
    //implement the main
    public static void main(String[] args){
        trial grey=new trial(80);
        System.out.println(grey.addition());
    }
}