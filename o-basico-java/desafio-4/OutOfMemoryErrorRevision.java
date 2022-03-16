import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorRevision {

    public static void main(String[] args) {
        List<byte[]> leakList = new ArrayList<>();
        int i = 1;

        /**
         * Para evitar esse tipo de erro é importante:
         * - Ficar atento a laços de repetição ou processos sem final
         * - Aumentar o tamanho da heap do Java (em casos extremos)
         *
         * De forma geral, é importante realizar um desenvolvimento seguro para
         * mitigar os riscos.
         */

        // Linha 22 com uma possível correção ao exemplo anterior
        while (i <= 10) {
            byte[] b = new byte[1048576];
            leakList.add(b);
            Runtime rt = Runtime.getRuntime();
            System.out.printf("[%d] free memory: %s%n", i++, rt.freeMemory());
        }
    }
}
