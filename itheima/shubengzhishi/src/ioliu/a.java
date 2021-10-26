package ioliu;

import java.io.RandomAccessFile;

//书上9-9
public class a {

    public static void main(String[] args) {
        try{
            RandomAccessFile raf=new RandomAccessFile ( "raf.dat","rw" );
            
            for (int i=0; i <10 ; i++)
                raf.writeDouble( i*3.1415926 );
                raf.close();
                raf=new RandomAccessFile ( "raf.dat","rw" );
                raf.seek ( 5*8 );
                raf.writeDouble ( 99.000 );
                raf.close ();
                raf=new RandomAccessFile ( "raf.dat","r" );
                for (int j=0; j < 10; j++)
                    System.out.println ("Vale"+j+":"+raf.readDouble ());
                    raf.close ();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }


