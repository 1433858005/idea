public class studentlist {
    private  student2[] student2s;
    private int maxlength;
    private int length;
    public  studentlist(int maxlength){
        initiate(maxlength);
    }
    private  void initiate(int maxlength){
        student2s =new student2[maxlength];
        this.maxlength=maxlength;
    }
    public int length(){
        return length;
    }
    public int Maxlength(){
        return maxlength;
    }
}
