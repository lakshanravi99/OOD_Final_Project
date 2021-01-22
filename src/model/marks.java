package model;

public class marks implements SuperEntity{
    private String std_id;
    private String couse_id;
    private int mid_p;
    private int mid_t;
    private int Ass1;
    private int Ass2;
    private int quiz1;
    private int quiz2;
    private int quiz3;
    private int quiz4;
    private int end_exm_p;
    private int end_exm_t;

    public marks() {
    }

    public marks(String std_id, String couse_id, int mid_p, int mid_t, int ass1, int ass2, int quiz1, int quiz2, int quiz3, int quiz4, int end_exm_p, int end_exm_t) {
        this.std_id = std_id;
        this.couse_id = couse_id;
        this.mid_p = mid_p;
        this.mid_t = mid_t;
        this.Ass1 = Ass1;
        this.Ass2 = Ass2;
        this.quiz1 = quiz1;
        this.quiz2 = quiz2;
        this.quiz3 = quiz3;
        this.quiz4 = quiz4;
        this.end_exm_p = end_exm_p;
        this.end_exm_t = end_exm_t;
    }

    public String getStd_id() {
        return std_id;
    }

    public void setStd_id(String std_id) {
        this.std_id = std_id;
    }

    public String getCouse_id() {
        return couse_id;
    }

    public void setCouse_id(String couse_id) {
        this.couse_id = couse_id;
    }

    public int getMid_p() {
        return mid_p;
    }

    public void setMid_p(int mid_p) {
        this.mid_p = mid_p;
    }

    public int getMid_t() {
        return mid_t;
    }

    public void setMid_t(int mid_t) {
        this.mid_t = mid_t;
    }

    public int getAss1() {
        return Ass1;
    }

    public void setAss1(int ass1) {
        Ass1 = ass1;
    }

    public int getAss2() {
        return Ass2;
    }

    public void setAss2(int ass2) {
        Ass2 = ass2;
    }

    public int getQuiz1() {
        return quiz1;
    }

    public void setQuiz1(int quiz1) {
        this.quiz1 = quiz1;
    }

    public int getQuiz2() {
        return quiz2;
    }

    public void setQuiz2(int quiz2) {
        this.quiz2 = quiz2;
    }

    public int getQuiz3() {
        return quiz3;
    }

    public void setQuiz3(int quiz3) {
        this.quiz3 = quiz3;
    }

    public int getQuiz4() {
        return quiz4;
    }

    public void setQuiz4(int quiz4) {
        this.quiz4 = quiz4;
    }

    public int getEnd_exm_p() {
        return end_exm_p;
    }

    public void setEnd_exm_p(int end_exm_p) {
        this.end_exm_p = end_exm_p;
    }

    public int getEnd_exm_t() {
        return end_exm_t;
    }

    public void setEnd_exm_t(int end_exm_t) {
        this.end_exm_t = end_exm_t;
    }

    @Override
    public String toString() {
        return "marks{" +
                "std_id='" + std_id + '\'' +
                ", couse_id='" + couse_id + '\'' +
                ", mid_p=" + mid_p +
                ", mid_t=" + mid_t +
                ", Ass1=" + Ass1 +
                ", Ass2=" + Ass2 +
                ", quiz1=" + quiz1 +
                ", quiz2=" + quiz2 +
                ", quiz3=" + quiz3 +
                ", quiz4=" + quiz4 +
                ", end_exm_p=" + end_exm_p +
                ", end_exm_t=" + end_exm_t +
                '}';
    }
}
