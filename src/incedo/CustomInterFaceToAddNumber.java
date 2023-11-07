package src.incedo;

public class CustomInterFaceToAddNumber {
    public static void main(String[] args) {

        CustomInterfAdd2Number add2Number = (o1,o2) -> o1+o2;

        int add = add2Number.add(10, 20);
        System.out.println(add);
    }
}
