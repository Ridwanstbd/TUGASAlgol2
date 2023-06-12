class binatang{
    public String hidup;
    public String bernafas = "Paru-paru";
}
class ikan extends binatang {
    private String bernafas = "Insang";
    public void Ikan() {
        System.out.println("bernafas dengan "+bernafas+"\n");
    }
}
class buaya extends binatang {
    public void Buaya() {
        System.out.println("bernafas dengan "+bernafas+"\n");
    }
}
class kura extends binatang {
    public void kura2() {
        System.out.println("bernafas dengan "+bernafas+"\n");
    }
}

public class inheritence {
    public static void main(String[] args) {
        ikan ik = new ikan();
        ik.hidup = "ikan hidup di air";
        System.out.println(ik.hidup);
        ik.Ikan();

        kura ku = new kura();
        ku.hidup= "kura-kura bisa hidup di air dan di darat";
        System.out.println(ku.hidup);
        ku.kura2();

        buaya bu = new buaya();
        bu.hidup="buaya bisa hidup di air dan di darat";
        System.out.println(bu.hidup);
        ku.kura2();
    }
}