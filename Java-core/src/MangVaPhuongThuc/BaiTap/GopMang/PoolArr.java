package MangVaPhuongThuc.BaiTap.GopMang;

public class PoolArr {
    public static void main(String[] args) {
        String firstName[] = new String[3];
        firstName[0] = "V";
        firstName[1] = "O";
        firstName[2] = " ";

        String lastName[] = new String[4];
        lastName[0] = "L";
        lastName[1] = "O";
        lastName[2] = "N";
        lastName[3] = "G";

        int size = firstName.length + lastName.length;
        String fullName[] = new String[size];

        int count;
        for (count = 0; count < firstName.length; count++) {
            fullName[count] = firstName[count];
        }

        int countOfLastName = 0;
        for (count = firstName.length; count < size; count++) {
            fullName[count] = lastName[countOfLastName];
            countOfLastName++;
        }

        System.out.println("Array after pooled: ");
        for (count = 0; count < size; count++) {
            System.out.print(fullName[count]);
        }
    }

}
