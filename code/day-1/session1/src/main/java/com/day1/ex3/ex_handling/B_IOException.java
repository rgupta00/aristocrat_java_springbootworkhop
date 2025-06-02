package com.day1.ex3.ex_handling;

import java.io.*;

public class B_IOException {
    public static void main(String[] args) {
        //read a file and print all the details
        //Design pattern: decorator dp
//        BufferedReader br=null;
//        //ARM: automatic resource management, special sy and resouces is closesd by jvm :)


         //ARM: automatic resource management, special sy and resouces is closesd by jvm :)
        try(BufferedReader br= new BufferedReader(new FileReader(new File("C:\\Users\\busyc\\OneDrive\\Desktop\\data\\demo.txt")))){
             String line=null;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();

        }
        catch (IOException e){
            e.printStackTrace();
        }















//      try{
//           br=
//                  new BufferedReader(new FileReader(new File("C:\\Users\\busyc\\OneDrive\\Desktop\\data\\demo.txt")));
//           String line=null;
//           while ((line=br.readLine())!=null){
//               System.out.println(line);
//           }
//
//      }catch (FileNotFoundException e){
//          e.printStackTrace();
//
//      }
//      catch (IOException e){
//          e.printStackTrace();
//      }
//      finally {
//          try {
//              br.close();
//          } catch (IOException e) {
//          }
//      }


//       try(BufferedReader br=new BufferedReader
//               (new FileReader(new File("C:\\Users\\busyc\\OneDrive\\Desktop\\story\\story.txt")))){

//       }catch (FileNotFoundException e){
//           e.printStackTrace();
//       }catch (IOException e){
//           e.printStackTrace();
//       }catch (Exception e){
//           e.printStackTrace();
//       }
    }
}
