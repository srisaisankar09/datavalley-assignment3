class Organization implements Cloneable {
    private String organizationCode;
    private String organizationName;
    private String organizationAddress;

    public Organization(String organizationCode, String organizationName, String organizationAddress) {
        this.organizationCode = organizationCode;
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
    }

    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) {
        Organization org1 = new Organization("001", "Org1", "Address1");

        try {
            // Cloning org1 to org2
            Organization org2 = (Organization) org1.clone();

            // Printing details of both org1 and org2
            System.out.println("Details of org1:");
            org1.printDetails();
            System.out.println("\nDetails of org2 (cloned from org1):");
            org2.printDetails();

            // Modifying org2
            org2.organizationName = "Org2";
            org2.organizationAddress = "Address2";

            // Printing details of org1 and modified org2
            System.out.println("\nAfter modifying org2:");
            System.out.println("Details of org1:");
            org1.printDetails();
            System.out.println("\nDetails of org2:");
            org2.printDetails();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
