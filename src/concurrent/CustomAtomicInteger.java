package concurrent;


public class CustomAtomicInteger extends Number {

    private volatile Integer value= new Integer(0);

    public CustomAtomicInteger(Integer value) {
        this.value = value;
    }


    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}


