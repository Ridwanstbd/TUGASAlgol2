class fungsi1 {
    
    static double lingkaran(int r){
        double luas = 3.14 * r *r ;
        System.out.println("Luas lingkaran : "+luas);
        return luas; 
    }
    static int volkubus(int pjg,int lbr,int tgg){
        int volkubus = pjg*lbr*tgg;
        System.out.println("volume Kubus : "+volkubus);
        return volkubus;
    }
    public static void main(String [] args) {
        lingkaran(5);
        volkubus(6, 7, 8);
    }
}