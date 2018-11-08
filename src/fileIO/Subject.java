package fileIO;

public class Subject {
    private String name;
    private String code;
    private double grade;
    private int credit;
    private Subject[] pre;
    private String typeOfSubject;
    private boolean isAlreadyLearn;
    private String detail;
    private int level;



    public Subject(String name, String code, int credit, String typeOfSubject, int level) {
        this.name = name;
        this.code = code;
        this.grade = -1;
        this.credit = credit;
        this.pre = null;
        this.typeOfSubject = typeOfSubject;
        this.isAlreadyLearn = false;
        this.level = level;
    }

    public Subject(String name, String code, int credit, String typeOfSubject, int level, Subject[] pre) {
        this.name = name;
        this.code = code;
        this.grade = -1;
        this.credit = credit;
        this.pre = pre;
        this.typeOfSubject = typeOfSubject;
        this.isAlreadyLearn = false;
        this.level = level;
    }
    //----------------setter-----------------
    public void setGrade(String g)  {
        g = g.toUpperCase();
        switch (g){
            case "A" : this.grade = 4; break;
            case "B+" : this.grade = 3.5 ; break;
            case "B" : this.grade = 3; break;
            case "C+" : this.grade = 2.5; break;
            case "C" : this.grade = 2; break;
            case "D+" : this.grade = 1.5; break;
            case "D" : this.grade = 1; break;
            case "F" : this.grade = 0; break;
            default: this.grade = -1; break;
        }
        if(this.grade != 0 && this.grade != -1){
            this.isAlreadyLearn = true;
        }
        else if(this.grade == -1 || this.grade == 0){
            this.isAlreadyLearn = false;
        }

    }

    public void setDetail(String detail){
        this.detail = detail;
    }

//    @Override
//    public String toString() {
//        return "Subject{" +
//                "name='" + name + '\'' +
//                ", code='" + code + '\'' +
//                ", grade=" + grade +
//                ", credit=" + credit +
//                ", pre=" + Arrays.toString(pre) +
//                ", canLearn=" + canLearn() +
//                '}';
//    }

    /* ----------- GETTER ----------- */

    public String getDetail() {
        return detail;
    }

    public int getLevel() {
        return level;
    }

    public boolean isAlreadyLearn() {
        return isAlreadyLearn;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getGrade() {
        return grade;
    }

    public int getCredit() {
        return credit;
    }

    public Subject[] getPre() {
        return pre;
    }

    public String getTypeOfSubject() {
        return typeOfSubject;
    }

    //do more Exception
    public boolean canLearn() throws Exception {
        if (this.pre == null)
            return true;

        boolean result = true;
        for (Subject aPre : this.pre) {
            if (aPre.getGrade() == -1 || aPre.getGrade() == 0){
                result = false;
                throw new Exception("Please check your pre subject !!!");

            }
        }
        return result;
    }


}
