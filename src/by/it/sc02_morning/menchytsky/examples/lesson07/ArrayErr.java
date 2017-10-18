package by.it.sc02_morning.menchytsky.examples.lesson07;

// Demonstrate an array overrun.
class ArrayErr {  
  public static void main(String args[]) {  
    int sample[] = new int[10]; 
    int i;  
  
    // generate an array overrun 
    for(i = 0; i < 100; i = i+1)  
      sample[i] = i; 
  }  
}