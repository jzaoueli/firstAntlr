package auf3.battleship.game;

class Field {

/**
* created : 2016/05/24 21:34:00
*/
   private static String[][] field = new String[][]{
       {"w","w","w","s","s","s","s"},
       {"w","s","w","w","w","w","w"},
       {"w","s","w","w","w","w","w"},
       {"w","s","w","s","s","s","w"},
       {"w","s","w","w","w","w","w"},
       {"w","s","w","w","w","w","w"},
       {"w","w","s","s","w","w","w"}
   };

   static String[][] getField(){
     return field;
   }
}