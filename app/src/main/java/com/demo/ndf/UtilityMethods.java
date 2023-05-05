package com.demo.ndf;
import java.io.*;
public class UtilityMethods {
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    public static void writeSaveToFile(Save save,int numberOfSaves) {
        try {
            FileOutputStream fileOut = new FileOutputStream("app/SaveFile");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(save);
            objectOut.writeInt(numberOfSaves);
            objectOut.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public class Reading {
        public void main(String[] args) {
            try (FileInputStream FileIn = new
                    FileInputStream("app/SaveFile")) {
                ObjectInputStream objectIn = new ObjectInputStream(FileIn);
                Save save = (Save) objectIn.readObject();
                //result is the total of objects in the SaveFile
                int result = objectIn.readInt();
                Save[] saves = new Save[result]; // do some check on result!
                for (int i = 0; i < result; ++i) {
                    saves[i] = (Save) objectIn.readObject();
                }
                objectIn.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
