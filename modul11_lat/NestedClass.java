/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul11_lat;

/**
 *
 * @author HP
 */
public class NestedClass {
        String nama="Narendra Rangga Wibowo"; //lengkapi dengan nama saudara
        String nim="L200224192"; //lengkapi dengan nim saudara
 
        public void printNama(){
            System.out.println(nama+" : "+nim);
        }
 
        static class StaticNestedClass {
            static String jurusan = "informatika";
        }
 
        class InnerClass{
            public void print(){
                System.out.println("Jurusan"+ StaticNestedClass.jurusan);
            }
        }
    
    public static void main(String[] args) {
        NestedClass nc = new NestedClass();
        nc.printNama();
        
        InnerClass inn = nc.new InnerClass();
        inn.print();
    }
}

