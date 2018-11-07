
class Pantry
{
  // Instance Variables
  private Jam  jar1 ;
  private Jam  jar2 ;
  private Jam  jar3 ;
  private Jam  selected ;

  // Constructors
  Pantry( Jam jar1, Jam jar2, Jam jar3 )
  {
    this . jar1 = jar1 ;
    this . jar2 = jar2 ;
    this . jar3 = jar3 ;
    selected = null ;
  }

  Pantry(Jam jar1) {
    this.jar1 = jar1;
    jar2 = null;
    jar3 = null;
    selected = null;
  }

  Pantry(Jam jar1, Jam jar2) {
    this.jar1 = jar1;
    this.jar2 = jar2;
    jar3 = null;
    selected = null;
  }

  // Methods
  public String toString()
  {
    String str = "";
    if (jar1 != null) {
      str += "1: " +  jar1.toString()  + "\n";
    }
    if (jar2 != null) {
      str += "2: " +  jar2.toString()  + "\n";
    }
    if (jar3 != null) {
      str += "3: " +  jar3.toString()  + "\n";     
    }
    return str;
  }

  // assume that the user entered a correct selection, 1, 2, or 3
  public boolean select( int jarNumber )
  {
    if ( jarNumber == 1 && jar1 != null) {
      selected =  jar1 ;
      return true;
    } else if ( jarNumber == 2 && jar2 != null) {
        selected = jar2 ;
        return true;
    } else if (jarNumber == 3 && jar3 != null) { 
        selected = jar3 ;
        return true ;
    } else {
      return false;
    }
  }

  // spread the selected jam
  public void spread( int oz )
  {
    selected . spread( oz ) ;
  }

  // replace jar of jam with the object j
  public Jam replace(Jam j, int slot) {
    if (slot == 1) {
      jar1 = j;
      return j;
    } else if (slot == 2) {
        jar2 = j;
        return j;
    } else {
        jar3 = j;
        return j;
    }
  }

  public void mixedFruit() {
    if (jar1.capacity <= 2 && jar2.capacity <= 2 && jar3.capacity <= 2) {
      Jam mixed = new Jam("Mixed Fruit", jar1.date, jar1.capacity + jar2.capacity + jar3.capacity);
      jar2 = null;
      jar3 = null;
      jar1 = mixed;
    }
  }
}