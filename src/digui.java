import java.io.*;

public class digui {
    public static void main(String args[]) {
        File file = new File("F:\\lsw\\a");
        showfile(file);
    }
    public static void showfile(File file){
        if (file.isDirectory()){
            File[] files = file.listFiles();

            for (File f : files) {
                showfile(f);
            }}
        else
            System.out.println(file.getName());

    }
}