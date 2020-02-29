package core;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.IntArrayData;

public class InstanceofTest {
    public static void main(String[] args) {
        InstanceofOne instance1 = new InstanceofOne();
        InstanceofTwo instance2 = new InstanceofTwo();
        InstanceofThree instance3 = new InstanceofThree();

        System.out.println(instance1 instanceof InstanceofOne);
        System.out.println(instance2 instanceof InstanceofOne);
        System.out.println(instance3 instanceof InstanceofOne);
        System.out.println(instance3 instanceof InstanceofTwo);
        System.out.println(instance2 instanceof InstanceofThree);
    }
}
