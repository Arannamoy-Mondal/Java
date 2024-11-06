public class d_dry_inheritance extends baseClass{
    public static void main(String[] args) {
        multplicationAndSum(10,20,30,40);
    }

    public static void multplicationAndSum(int ...args){
        System.out.println(baseClass.sumFunction(args));// dry nature. sumFunction is inherited from baseClass
        int res=1;
        for(int it:args){
            res*=it;
        }
        System.out.println(res);
    }
}
