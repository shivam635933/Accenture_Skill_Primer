public class DonorDetails 
{ 
    private String name, gender, bloodGroup; 
    private int age; 
    private long phoneNumber; 
    
    public DonorDetails (String name, int age, String gender, String bloodGroup, long phoneNumber) 
    { 
        this.name=name; 
        this.age=age; 
        this.gender=gender; 
        this.bloodGroup=bloodGroup; 
        this.phoneNumber=phoneNumber; 
    }

    public void setName (String name) 
    { 
        this.name=name; 
    } 
    public String getName() 
    { 
        return name; 
    } 

    public void setAge(int age) 
    { 
        this.age=age;
    } 
    public int getAge()
    {
        return age;
    }    
    
    public void setGender (String gender) 
    { 
        this.gender=gender; 
    } 
    public String getGender() 
    { 
        return gender; 
    } 

    public void setBloodGroup (String bloodGroup) 
    { 
        this.bloodGroup=bloodGroup; 
    } 
    public String getBloodGroup() 
    { 
        return bloodGroup; 
    }

    public void setPhoneNumber (long phoneNumber) 
    { 
        this.phoneNumber=phoneNumber; 
    } 
    public long getPhoneNumber() 
    { 
        return phoneNumber;
    } 
}