package practiceAll.demo_override_overload;

public class MathProcessor extends Processor{
    //override dinh nghia lai cac phuonng thuc cua lop cha cung ten, tham so, kieu du lieu tra ve
    @Override
    public void process(String s) {
        super.process(s);
    }

    @Override
    public void process(int[] ints) {
        super.process(ints);
    }

    @Override
    public void process(int i, int j) {
        super.process(i, j);
    }
}
