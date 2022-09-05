import scala.io.StdIn.readInt;
import scala.io.StdIn.readLine;

object CeasarCipher{

    val alphabet = "abcdefghijklmnopqrstuvwxyz" 

    def encryption(a: Int): Unit = { 
        
        print("Enter Shift Value : ")

        val shiftValue = (readInt()*a + alphabet.size) % alphabet.size  
         
        val input =readLine("Enter Secret Message: ").toLowerCase() 

        val output = input.map( (c: Char) => { 
 
            val x = alphabet.indexOf(c)

            if (x == -1){
                c
            }
            else{
                alphabet((x + shiftValue) % alphabet.size)
                } 
        });
 
        println("Message :"+ output);

    } 
    def main(args: Array[String]) :Unit={

        println("Enter relevant option : \n 1. Encryption \n 2. Decryption ")
        
        print("Enter option:")
        val x: Int = readInt();
        x match{
            case 1 => encryption(1);
            case 2 => encryption(-1); 
            case _ => println("Invalid entry")

        }
            
    }
}