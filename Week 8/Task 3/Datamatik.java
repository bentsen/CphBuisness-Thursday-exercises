class Datamatik
{

    public static void main(String[] args) 
    {
        Teacher obj = new Teacher("Doris",42,true);
        Student stu1 = new Student("Mikkel",22,false,"forår");
        Student stu2 = new Student("Christian",25,false,"forår");

        System.out.println(obj.name + " " + obj.age + " " + obj.isFemale);
        System.out.println(stu1.name + " " + stu1.age + " " + stu1.isFemale + " fra hold " + stu1.datamatikerteam);
        System.out.println(stu2.name + " " + stu2.age + " " + stu2.isFemale + " fra hold " + stu2.datamatikerteam);

    }
    
}