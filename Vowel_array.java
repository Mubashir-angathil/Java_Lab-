import java.io.*;

// Java Program to Delete Vowels from String
class Vowels{
    public static void main(String[] args){
        String line = "This website is aw3som3.";
        String newArray[] = new String[30];
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        line = line.toLowerCase();
        for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
            // check if character is any of a, e, i, o, u
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                 newArray[i]=ch;   
             
                }
              // check if character is a white space
                 else if (ch == ' ') {
                        ++spaces;
                      }
                    }
                
                System.out.println("White spaces: " + spaces);
                   
                }
            
                }    
          }

          
          
