/*cheak SEASON  by moth number
================================================*/
class SeasonNumber
{
  public static void main(String[]args)
  {
     int month;
     month=Integer.parseInt(args[0]);
     switch(month)
     {
       case 11: case 12: case 1: case 2:
       System.out.println("WINTER");
       break;
       case 3: case 4: case 5: case 6:
       System.out.println("SUMMER");
       break;
       case 7: case 8: case 9: case 10:
       System.out.println("RAINY");
       break;
       default:
       System.out.println("Wrong month number");
      }
   }
}       