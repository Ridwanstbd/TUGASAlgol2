public class ArrayChar {
    public static void main(String []args) {
        char[] nilaiCharArray = new char[5];
        nilaiCharArray[0] = 'a';
        nilaiCharArray[1] = 'b';
        nilaiCharArray[2] = 'c';
        nilaiCharArray[3] = 'd';
        nilaiCharArray[4] = 'e';

        for(int i = 0 ; i < nilaiCharArray.length;i++){
            System.out.print(nilaiCharArray[i]+" ");
        }
        
    }
}