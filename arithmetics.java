class arithmetics{
   int sum;
   int x;
   int a;
    arithmetics(int a,int x){
        this.a = a;
        this.x=x;
    }
    int getSum(){
        sum=x+a;
        return sum;
    }
    public static void main(String[] args) {
        arithmetics add=new arithmetics(68, 32);
        System.out.println("The square root of the summation is "+Math.sqrt(add.getSum()));
    }
   
}
