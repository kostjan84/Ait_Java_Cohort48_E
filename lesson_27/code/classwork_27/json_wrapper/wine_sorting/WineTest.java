package classwork_27.json_wrapper.wine_sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class WineTest {

    Wine [] wines;


    @BeforeEach
    void setUp() {
       wines = new Wine[5];
       wines[0] = new Wine("type1","Title1",2021,6);
       wines[1] = new Wine("type2","Title2",2022,3);
       wines[2] = new Wine("type3","Title3",2023,5);
       wines[3] = new Wine("type1","Title4",2015,7);
       wines[4] = new Wine("type2","Title5",2020,20);


    }
    @Test
    void testSortWineByAge (){
        printArray(wines);

        Arrays.sort(wines);

        printArray(wines);

    }
    @Test
    void testSortWineByWinePrice(){

        printArray(wines);
        Comparator<Wine> comparatorByPrice = new Comparator<Wine>() {
            @Override
            public int compare(Wine wine1, Wine wine2) {
                return (int) (wine1.getPrice() - wine2.getPrice());
                //return Double.compare(wine1 .getprice(), wine2.getprice());
            }
        };

        Arrays.sort(wines,comparatorByPrice);
        printArray(wines);
    }
    public void printArray(Object [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
        }
        System.out.println("---------------------------");
    }
    @Test
    void testSortByTitle(){
        printArray(wines);

        Comparator<Wine> comparatorByTittle = new Comparator<Wine>() {
            @Override
            public int compare(Wine wine1, Wine wine2) {
                return wine1.getTitle().compareTo(wine2.getTitle());
            }
        };

        Arrays.sort(wines,comparatorByTittle);
        printArray(wines);
    }

}