import java.util.Scanner;

public class LibraryProject {
    public static void main(String[] args) {
        char opt;
        do {
            System.out.println("************Library Management System************");
            System.out.println("Press 1 to Add book:");
            System.out.println("Press 2 to Issue book:");
            System.out.println("Press 3 to Return Book:");
            System.out.println("Press 4 to print complete issue information:");
            System.out.println("Press 5 to exit:");

            Scanner src = new Scanner(System.in);
            System.out.println("Enter any Number:");
            int number = src.nextInt();

            switch (number) {
                case 1:
                    Library addBook = new Library();
                    addBook.add();
                    break;

                case 2:
                    Library issueBook = new Library();
                    issueBook.issue();
                    break;

                case 3:
                    Library returnB = new Library();
                    returnB.returnBook();
                    break;

                case 4:
                    Library detailsOfBook = new Library();
                    detailsOfBook.details();
                    break;

                case 5:
                    Library exitSystem = new Library();
                    exitSystem.exit();
                    break;

                default:
                    System.out.println("Invalid Number");
            }
            System.out.println("Please Select the option Y/N");
            opt = src.next().charAt(0);
        } while (opt == 'y' || opt == 'Y');
        if (opt == 'n' || opt == 'N') {
            Library z = new Library();
            z.exit();
        }

    }
}

class Library {
    static String ibn, bid, brd;
    static int ibi, tbi;

    void add() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Book Name:-");
        String bn = scn.nextLine();
        System.out.println("Book Price:-");
        float bp = scn.nextInt();
        scn.nextLine();
        System.out.println("Book Id:-");
        int bi = scn.nextInt();
        scn.nextLine();

        System.out.println("Your Book Details is:" + (bn) + " " + (bp) + " " + (bi));
    }

    void issue() {
        Scanner scn1 = new Scanner(System.in);
        System.out.println("Issued Book Name:");
        ibn = scn1.nextLine();
        System.out.println("Issued Book Id:");
        ibi = scn1.nextInt();
        scn1.nextLine();
        System.out.println("Book Issued Date:");
        bid = scn1.nextLine();
        System.out.println("Total Number Of Books Issued:");
        tbi = scn1.nextInt();
        scn1.nextLine();
        System.out.println("Book Return Date:-");
        brd = scn1.nextLine();
    }

    int getid() {
        return ibi;
    }

    void returnBook() {
        System.out.println("Return Book Name:-");
        Scanner scn2 = new Scanner(System.in);
        String rbn = scn2.nextLine();
        System.out.println("Return Book Id:-");
        int rbi = scn2.nextInt();

        if (ibi == rbi) {
            System.out.println("Total Details of Book:-");
            System.out.println("Book Name:-" + Library.ibn);
            System.out.println("Book Id:-" + Library.ibi);
            System.out.println("Book Issued Date:-" + Library.bid);
            System.out.println("Book Return Date:-" + Library.brd);
            System.out.println("Total Number of Books Issued:-" + Library.tbi);
        } else {
            System.out.println("Wrong Book Id...Please Enter Valid Id.");

        }
    }

    void details() {
        System.out.println("Book Name:-" + Library.ibn);
        System.out.println("Book Id:-" + Library.ibi);
        System.out.println("Book Issued Date:-" + Library.bid);
        System.out.println("Book Return Date:-" + Library.brd);
        System.out.println("Total Number of Books Issued:-" + Library.tbi);
    }

    void exit() {
        System.exit(0);
    }
}