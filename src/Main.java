import com.example.car.Car;
import com.example.car.CarArray;
import com.example.car.FactoryCarArray;
import com.example.car.Search;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1, "BMW", "X5", 2016, "red", 5400000, 4000);
        Car car2 = new Car(2, "Range Rover", "Sport SVR", 2018, "blue", 7000000, 8888);
        Car car3 = new Car(3, "Nissan", "X-Trail", 2020, "black", 617610, 1313);

        CarArray array = FactoryCarArray.createCarArray(3);

        array.setElement(0, car1);
        array.setElement(1, car2);
        array.setElement(2, car3);

        System.out.println(array);

        Search.searchCarForModel(array.getArr(),"X5");
        Search.searchCarForModelWithExecution(array.getArr(),"Sport SVR", 1);
        Search.searchCarForYearAndCost(array.getArr(), 2020, 500000);
    }
}
