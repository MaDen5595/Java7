package Z4;
public class MathFunc implements MathCalculable{
    public double dlinna_okr(double radius){
        return 2*pi*radius;
    }
    @Override
    public double step(double chislo, double s){
        return Math.pow(chislo, s);
    }

    @Override
    public double moduleKomplex(double real, double mnim){
        return Math.sqrt(Math.pow(real,2)+Math.pow(mnim,2));
    }
}
