public class Petla_for_each {
    public static void main(String[] args) {
        int[] tablicaZosi = new int[10];
         for(int i = 0; i < 10; i++){ // jeśli nie wiemy jaka jest długość tablicy dodajemy zamiast liczby 10 tablicaZosi.length
         tablicaZosi[i]=i+1;
         }
         for (int zmienna:tablicaZosi){
             System.out.println(zmienna);
         }
    }
    }
