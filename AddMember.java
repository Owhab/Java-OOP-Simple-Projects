
class Member{
    String Name, FName, MName, Address;
    int NID, Contact;

    Member(String name, String Father, String Mother, String address, int nid, int contact){

        Name = name;
        FName = Father;
        MName = Mother;
        Address = address;
        NID = nid;
        Contact = contact;
    }

    void Display()
    {
        System.out.println("Member Name: "+Name);
        System.out.println("Member's Father Name: "+FName);
        System.out.println("Member's Mother Name: "+MName);
        System.out.println("Member's Address: "+Address);
        System.out.println("Member's National ID: "+NID);
        System.out.println("Member's Contact No: "+Contact);
        System.out.println("\n\n\n");



    }
}

    public class AddMember{
        public static void main(String [] args)
        {
            Member member1 = new Member("Abdul Owhab", "Nurul Amin", "Nur Banu", "Boaliya, Hatiya, Noakhali", 2000797035, 1771176606);
            member1.Display();


            Member member2 = new Member("Atikur Rahman", "Babul AKhter", "Sharmin Akter", "Tommoroddi, Hatiya, Noakhali", 2001496461, 1781773188 );
            member2.Display();


    }


}