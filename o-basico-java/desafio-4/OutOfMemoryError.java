import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryError {

    public static void main(String[] args) {
        List<byte[]> leakList = new ArrayList<>();
        int i = 1;
        while (true) {
            byte[] b = new byte[1048576];
            leakList.add(b);
            Runtime rt = Runtime.getRuntime();
            System.out.printf("[%d] free memory: %s%n", i++, rt.freeMemory());
        }
    }
}
