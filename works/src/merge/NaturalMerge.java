package merge;

import java.io.*;

public class NaturalMerge {

    private String filePath;
    static final int N = 10;
    static final int TOP = 999;

    public static void main(String[] args) throws NumberFormatException {

        String path = "archivo.txt"; // <------- RUTA CON NOMBRE DEL ARCHIVO

        NaturalMerge pb = new NaturalMerge(path);
        pb.randomNumbers();
        System.out.println("---- Números en desorden -----");
        pb.seeFile();
        pb.naturalMerge(0, pb.getNumLines()-1);
        System.out.println("---- Números en Ordenados -----");
        pb.seeFile();
    }

    public NaturalMerge(String filePath) {
        this.filePath = filePath;
    }

    public void naturalMerge(int lo, int n) {
        int low = lo;
        int high = n;
        if (low >= high) {
            return;
        }

        int middle = (low + high) / 2;
        naturalMerge(low, middle);
        naturalMerge(middle + 1, high);
        int end_low = middle;
        int start_high = middle + 1;
        while ((lo <= end_low) && (start_high <= high)) {
            if (getValue(low) < getValue(start_high)) {
                low++;
            } else {
                int Temp = getValue(start_high);
                for (int k = start_high - 1; k >= low; k--) {
                    setValue(getValue(k), k+1);
                }
                setValue(Temp, low);
                low++;
                end_low++;
                start_high++;
            }
        }
    }

    public int getValue(int line) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.filePath));
            String number = "";
            for(int i=0; i<line+1; i++) {
                number = br.readLine();
            }
            int value = Integer.parseInt(number);
            br.close();
            return value;
        } catch (IOException ie) {
            System.out.print(ie.getMessage());
        }
        return 0;
    }

    public void setValue(int value, int line) {
        try {

            BufferedReader file = new BufferedReader(new FileReader(this.filePath));
            String content;
            String input = "";
            int count=0;
            while((content = file.readLine()) != null)
            {
                if(count == line) {
                    input += value + "\r\n";
                } else
                    input += content + "\r\n";
                count++;
            }
            file.close();
            FileWriter file2;
            PrintWriter pw;
            file2 = new FileWriter(this.filePath);
            pw = new PrintWriter(file2);
            pw.print(input);
            file2.close();
        } catch (Exception ie) {
            System.out.print(ie.getMessage());
        }
    }

    public int getNumLines() {
        int line = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.filePath));
            line = (int)br.lines().count();
            br.close();
        } catch (IOException ie) {
            System.out.print(ie.getMessage());
        }
        return line;
    }

    public void seeFile() {
        try {
            BufferedReader file = new BufferedReader(new FileReader(this.filePath));
            String content;
            while((content = file.readLine()) != null)
            {
                System.out.println(content);
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void randomNumbers() {
        PrintWriter pw;
        try {
            pw = new PrintWriter(new FileWriter(this.filePath));
            for(int j = 1; j <= N; j++)
                pw.write((int)(1 + TOP * Math.random())+ "\r\n");
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}