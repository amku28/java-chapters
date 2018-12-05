import java.util.Scanner;

public class Exercise1
{
  public static void main ( String[] args )
  {
    PhoneBook pb = new PhoneBook();  
    Scanner scan = new Scanner(System.in);
    System.out.print("Last Name? ");
    String lastName = scan.nextLine();

    while (!lastName.equals("quit")) {
        
        // search for "Violet Smith"
      if (!lastName.equals("quit")) {
        System.out.print("First Name? ");
        String firstName = scan.nextLine();

        PhoneEntry entry = pb.search( lastName ); 
            
        if ( entry != null && firstName.length() > 0) {
          System.out.println( "The number is: " + entry.getPhone() );
        } else {
          System.out.println("Name not found" );
        }
        System.out.print("Last Name? ");
        lastName = scan.nextLine();
      }
    }
    System.out.println("good-by");
    
  }
}

class PhoneEntry
{
  private String firstName;
  private String lastName;
  private String name = firstName + " " + lastName;
  private String phone;   // their phone number

  public PhoneEntry( String lN, String fN, String p )
  {
    lastName = lN; firstName = fN; phone = p;
  }
  
  public String getName()  {return lastName;}
  public String getFirstName() {return firstName;}
  public String getPhone() {return phone;}
  
}

class PhoneBook
{ 
  private PhoneEntry[] phoneBook; 

  public PhoneBook()    // constructor
  {
    phoneBook = new PhoneEntry[ 7 ] ;

    phoneBook[0] = new PhoneEntry( "Barclay", "James", "(418) 665-1223" );
    phoneBook[1] = new PhoneEntry( "Dunbar", "Grace", "(860) 399-3044" );
    phoneBook[2] = new PhoneEntry( "Kratides", "Paul", "(815) 439-9271" );
    phoneBook[3] = new PhoneEntry( "Smith", "Violet", "(312) 223-1937" );
    phoneBook[4] = new PhoneEntry( "Wood", "John", "(913) 883-2874" );
    phoneBook[5] = new PhoneEntry("Smith", "John", "(812) 339-4916");
    phoneBook[6] = new PhoneEntry("Smith", "Willoughby", "(312) 992-8761");

  }

  public PhoneEntry search( String targetName )  
  {
    for ( int j=0; j < phoneBook.length; j++ )
    {
      if ( phoneBook[ j] != null && phoneBook[ j ].getName().toUpperCase().equals( targetName.toUpperCase() ) )
        return phoneBook[ j ];
    }

    return null;
  }

  // public void findCell() {
  //   for (int i = 0; i < phoneBook.length; i++) {
  //     if (phoneBook[i] == null) {
  //       phoneBook[i] ;
  //     } 
  //   }
  // }

  // public void deleteEntry() {
  //   phoneBook[findCell()] = null;
  // }
}


