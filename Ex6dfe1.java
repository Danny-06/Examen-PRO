import java.util.Scanner;

/**
 * 11/11/2020 - 8:40 AM
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class Ex6dfe1 { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("¿De que color quiere el polo? 1)Blanco y en 2)Color");
    int color = s.nextInt();
    System.out.println();
    
    System.out.println("¿Cuántos polos desea? (Mínimo '20' polos)");
    int numPolo = s.nextInt();
    System.out.println();
    
    System.out.println("¿Qué técnica quiere para el logotipo? 1)Serigrafía y 2)Bordado)");
    int logo = s.nextInt();
    System.out.println();
    System.out.println();
    
    // Precio de cada polo según cantidad
    double precioPolo;
    if(numPolo >= 20 && numPolo <= 39) {
      
      precioPolo = 4.90;
      
    } else if(numPolo >= 40 && numPolo <= 99) {
      
      precioPolo = 3.90;
      
    } else { // 100 o más polos
      
      precioPolo = 3.20;
      
    }
    
    if(color == 2) {
      
      precioPolo = precioPolo * 1.2; // Más 20% por ser en color
    
    }
    
    double precioLogotipo = 0;
    if(logo == 1 && numPolo < 50) {
      
      precioLogotipo = 2;
      //precioPolo = precioPolo + 2; // Más 20% por ser en color y menos de 50 unidades
    
    } else if(logo == 1 && numPolo >= 50) {
      
      precioLogotipo = 1.5;
      //precioPolo = precioPolo + 1.5; // Más 15% por ser en color y más de 50 unidades
    
    } else if(logo == 2 && numPolo < 50) {
      
      precioLogotipo = 3;
      //precioPolo = precioPolo + 3; // Más 20% por ser en color
    
    } else if(logo == 2 && numPolo >= 50) {
      
      precioLogotipo = 2.5;
      //precioPolo = precioPolo + 2.5; // Más 20% por ser en color
    
    }
    
    
    
    
    
    // TICKET
    
    
    System.out.printf("Polo unidades:       %4d\n", numPolo); // Unidades Polo
    
    if(color == 1) {
      
      System.out.printf("Precio color blanco:   %5.2f €\n", precioPolo); // Precio blanco
    
    } else if(color == 2) {
      
      System.out.printf("Precio en color:       %5.2f €\n", precioPolo); // Precio en color
      
    }
    
    double precioTextil = precioPolo * numPolo;
    System.out.printf("Total textil:         %5.2f €\n", precioTextil); // Precio textil
    
    if(logo == 1) {
      
      System.out.printf("Serigrafía             %5.2f €\n", precioLogotipo); // Precio serigrafia
      System.out.printf("Total serigrafía       %5.2f €\n", precioLogotipo * numPolo); // Precio total serigrafia
    
    } else if(logo == 2) {
      
      System.out.printf("Bordado                %5.2f €\n", precioLogotipo); // Precio bordado
      System.out.printf("Total bordado         %5.2f €\n", precioLogotipo * numPolo); // Precio total bordado
    
    }
    
    System.out.printf("Polo + Logotipo:      %5.2f €\n", precioTextil + precioLogotipo * numPolo); // Precio Polo + Logotipo
    
    double iva = (precioTextil + precioLogotipo * numPolo) * 0.21; // IVA
    System.out.printf("IVA:                   %5.2f €\n", iva);
    
    double precioTotal = (precioTextil + precioLogotipo * numPolo) * 1.21; // +21% IVA
    System.out.printf("TOTAL:                %5.2f €\n", precioTotal);
    
  }
}
