import java.io.File;
import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
        // 2*. Написать метод который циклически просматривает
        // содержимое заданного каталога и выводит на печать
        // информацию о всех файлах и каталогах, находящихся
        // в нем и в его подкаталогах.

        File file = new File("D:\\");
        searchFiles(file);
    }

    public static void searchFiles(File rootFile) {
        if (rootFile.isDirectory()) {
            System.out.println(rootFile.getAbsolutePath());
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for (File item : directoryFiles) {
                    if (item.isDirectory()) {
                        searchFiles(item);
                    }
                }
            }
        }
    }
}
