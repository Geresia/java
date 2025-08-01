package mymain.serial;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

import vo.PersonVo;

public class _04_MyMain_Serial4_Open {
    public static void main(String[] args) throws Exception {
        InputStream        is  = new FileInputStream("person_array.dat");
        ObjectInputStream ois = new ObjectInputStream(is);

        PersonVo[] p_array = (PersonVo[]) ois.readObject();

        for (PersonVo p : p_array) {
            System.out.println(p);
        }

        ois.close();
        is.close();
    }	
}
