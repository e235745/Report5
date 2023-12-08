package jp.ac.uryukyu.ie.e235745;

public class Main {
    public static void main(String[] args){
        try{
        String str = null;
        System.out.println(str.length());  
        }catch(NullPointerException x){
            System.out.println("NullPointerExceptionのエラーが発生しました");
            System.out.println(x.getMessage());
        }
    }
}
