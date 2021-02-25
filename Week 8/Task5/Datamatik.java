class Datamatik
{
    public static Student[] stud = new Student[9];

    public static void main(String[] args) 
    {
        System.out.println(students(stud,8));
        System.out.println(Students2(stud,"Nicky"));

        stud[0] = new Student("Mikkel",22,false,"Spring");
        stud[1] = new Student("Louise",25,true,"Spring");
        stud[2] = new Student("Kim",30,false,"Spring");
        stud[3] = new Student("Sandra",20,true,"Spring");
        stud[4] = new Student("Mads",20,false,"Spring");
        stud[5] = new Student("Nikolai",21,false,"Spring");
        stud[6] = new Student("Tim",19,false,"Spring");
        stud[7] = new Student("Nicky",22,false,"Spring");
        stud[8] = new Student("Nicoline",18,true,"Spring");
        stud[9] = new Student("Sophie",26,true,"Spring");

    }

    public static String students(Student[] stud, int a)
    {
        return stud[a].name;
    }

    public static int Students2(Student[] stud, String a)
    {
        for(int i = 0; i < 9; i++)
        {
            if(stud[i].name == a)
            {
                return //ingen ide;
            }
            
        }
    }


    
}