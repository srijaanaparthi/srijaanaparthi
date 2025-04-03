class Patient {
int patientID;
String Name;
String Diagnosis;
     Patient(int patientID,String Name,String Diagnosis)  {
    this.patientID=patientID;
    this.Name=Name;
    this.Diagnosis=Diagnosis;
}
}
public  class PatientRecord{
    public static void searchpatient(Patient[] Records,int searchNumber)
    {
        int i=0;
        while(i<Records.length){
        if(Records[i].patientID==searchNumber)
        {
            System.out.println("patient record found");
            System.out.println("PatientID:"+Records[i].patientID);
            System.out.println("Name:"+Records[i].Name);
            System.out.println("Diagnosis"+Records[i].Diagnosis);
        }
        i++;
    }
        System.out.println("Patient not found");
    }
    public static void main(String[] args)
    {
        Patient[] Records={
            new Patient(101,"alice","fever"),
            new Patient(202,"Bob","fracture"),
            new Patient(303,"Charlie","virus")
        };
       System.out.println("search number:303");
        searchpatient(Records,303); 
}
}

