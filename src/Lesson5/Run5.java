package Lesson5;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Run5 {
     public  static ArrayList<FileOb> fileObsAL = new ArrayList<>();
     // путь к файлу
     public static final String filePath = "src/lesson5/lesson55.csv";
     public static final String title = "value1" + ";" + "value2" + ";" + "value3" + ";"
             + System.getProperty("line.separator");

     public static void main(String[] args) throws IOException {
          createFileOB();
          writer();
          Data data = readOB();

     }

     public static void createFileOB(){
          Random random = new Random();

          for (int i = 1 ; i < 500 ; i ++){
               fileObsAL.add(new FileOb(i, random.nextInt(500), random.nextInt(5000)));
          }
     }

     public static void  writer() throws IOException {
          try (FileWriter fileWriter = new FileWriter(filePath);)
          {fileWriter.write(title);
               for (FileOb fileOb : fileObsAL){
                    fileWriter.write(fileOb.getValue1() + ";"
                            + fileOb.getValue2() + ";"
                            + fileOb.getValue3() + ";"
                            + System.getProperty("line.separator"));
               }

          }
     }

     public static Data readOB() throws IOException {
          Data data = new Data();
          List<List<String>> records = new ArrayList<>();
          try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
               String line = br.readLine();
               data.setValue( line.split(";"));
               while ((line = br.readLine()) != null) {
                    String[] values = line.split(";");
                    records.add(Arrays.asList(values));
               }
     }
          int[][] resultData = new int[records.size()][3];
          for(int i=0;i<records.size();i++){
               for(int j=0;j<records.get(i).size();j++){
                    resultData[i][j] = Integer.valueOf(records.get(i).get(j));
               }
          }
          data.setRandom(resultData);
          return data;

     }




}
