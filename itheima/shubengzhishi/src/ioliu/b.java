package ioliu;
import java.io.*;
//java书9-10
public class b {
    public static String read(String fileName)throws IOException{
        StringBuffer sb=new StringBuffer ();
        BufferedReader in =new BufferedReader ( new FileReader ( fileName ) );
        String s;
        while ((s=in.readLine ())!=null){
            sb.append ( s );
            sb.append ( "\n" ); }
        in.close ();
        return sb.toString (); }
      public  static void write(String fileName,String text)throws IOException{
          PrintWriter out=new PrintWriter  (new BufferedWriter( new FileWriter( fileName ) ));
          out.print ( text );
          out.close (); }
    public static void main(String[] args) {
        try {
            StringBuffer sb=new StringBuffer ();
            String[] content=read ( "fileUtils.java" ).split ( "n" );
            for (int i=0; i < content.length; i++) {
                sb.append (( i+1 )+":"+content[i]);
                sb.append ( "\n" ); }
            write ( "NewFile.txt",sb.toString () );
        }catch (Exception e){
            e.printStackTrace ();
        }
    }
}
