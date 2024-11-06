public class b_inheritance_2 extends a_inheritance_1 {
    @Override
    public int sum(int ...args){
        return super.sum(args)+10;
    }
}
