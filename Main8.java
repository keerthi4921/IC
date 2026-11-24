
class UniversityMember {
    int memberId;

    UniversityMember(int memberId) {
        this.memberId = memberId;
    }

    void checkIn() {
        System.out.println("Member checked in");
    }
}

class Staff extends UniversityMember {
    String department;

    Staff(int memberId, String department) {
        super(memberId);
        this.department = department;
    }

    void attendMeeting() {
        System.out.println("Staff attending meeting");
    }
}

class Professor extends Staff {
    String subject;

    Professor(int memberId, String department, String subject) {
        super(memberId, department);
        this.subject = subject;
    }

    void conductLecture() {
        System.out.println("Professor conducting " + subject + " lecture");
    }
}

class AdminOfficer extends Staff {
    String officeRoom;

    AdminOfficer(int memberId, String department, String officeRoom) {
        super(memberId, department);
        this.officeRoom = officeRoom;
    }

    void processFiles() {
        System.out.println("Admin Officer processing files");
    }
}

public class Main8 {
    public static void main(String[] args) {

        Professor p = new Professor(101, "CSE", "Java");

        AdminOfficer a = new AdminOfficer(102, "Administration", "Room 201");

        System.out.println("Professor Details:");
        System.out.println("Member ID: " + p.memberId);
        System.out.println("Department: " + p.department);
        p.checkIn();
        p.attendMeeting();
        p.conductLecture();

        System.out.println();

        System.out.println("Admin Officer Details:");
        System.out.println("Member ID: " + a.memberId);
        System.out.println("Department: " + a.department);
        System.out.println("Office Room: " + a.officeRoom);
        a.checkIn();
        a.attendMeeting();
        a.processFiles();
    }
}
