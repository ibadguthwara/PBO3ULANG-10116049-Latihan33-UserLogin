/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Program ini berisi untuk menampilkan User Login
 */
public class PBO3ULANG10116049Latihan33UserLogin {
 private static String usName;
    private static String passWord;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Username\t: ");
        usName = scanner.nextLine();

        System.out.print("Masukan Password\t: ");
        passWord = scanner.nextLine();

        User user = new User();
        user.pengecekanLogin(usName, passWord);
    }

}
    
    
    

