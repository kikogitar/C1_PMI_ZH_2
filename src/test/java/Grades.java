import java.util.ArrayList;

public class Grades {
    public class Tantargy {
        public Integer jegy;
        public String targy;
    }

    Tantargy t = new Tantargy();
    ArrayList<Tantargy> minden = new ArrayList<>();
    public void addSubject(String be){
        t.targy= be;
        t.jegy = 0;
        minden.add(t);
    }
    public void dropSubject(String lead){
        t.targy=lead;
        if (minden.contains(t.targy)){
            minden.remove(t);
        }
    }
    public String getGrades() {
        String ki= "";
        for (int i=0; i < minden.size(); i++) {
            t = minden.get(i);
            ki = t.targy + " -"  + t.jegy.toString() + "\n";

        }
        return ki;
    }

}
