public class sequencelist<T> {
      private T[] eles;    //存储元素的数组  泛型不确定的数组eles类型  eles是自定义的
      private int N;       //记录当前顺序表中的元素个数
      //构造方法
      public  sequencelist(int capacity){
          this.eles=(T[])new Object[capacity]; //初始化数组
          this.N=0;    //初始化长度
      }
      //将一个线性表置为空表
      public void clear(){
          this.N=0;
      }
      //判断当前线性表是否为空表
    public boolean isempty(){
          return N==0;
    }
      //获取线性表长度
      public int length(){
          return N;
      }
      //获取指定位置的元素
      public T get(int i){
          return  eles[i];
      }
      //向线性表中添加元素t
      public  void insert(T t){
          eles[N++]=t;
      }
      //在i元素处插入元素t
    public  void insert(int i,T t){
          //先把i索引处的元素及其后面的元素依次向后移一位
        for (int index=N-1;index>i;index--){
            eles[index]=eles[index-1];
        }
        //再把t元素放到i索引处即可
        eles[i]=t;
    }
    //删除指定位置i处的元素，并返回该元素
    public T remove(int i){
          //记录索引i处的值
          T current =eles[i];
          //索引i后面元素依次向前移动一位即可
          for (int index=i;index<N-1;index++){
              eles[index]=eles[index+1];
          }
          //元素个数-1
          N--;
          return current;
    }
    //查找t元素第一次出现的位置
    public int indexof(T t){
          for (int i=0;i<N;i++){
              if (eles[i].equals(t)){
                  return i;
              }
          }
        return-1;
    }

}
