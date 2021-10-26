package duoxiancheng;
//守护线程
public class e {
    public static void main(String[] args) {
        threadbbb c=new threadbbb ();
        threadeee b=new threadeee ();
        c.setName ( "普通线程" );
        b.setName ( "辅助线程" );
        //把第二个设置为守护线程·
        // 当普通线程运行完后守护线程也没有继续运行下去了
        //但辅助线程还是会运行一下才结束·
        b.setDaemon ( true );
        c.start ();
        b.start ();
    }
}
