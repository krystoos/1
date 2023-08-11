package Example.Car;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarFactory {
    public Car buildCar(){

        String colors[]={"black","red","white"};
        int randIndexx =(int)Math.floor(Math.random()*colors.length);
        String randColor = colors[randIndexx];

        String brands[]={"BMW","AUDI","MERCEDES",};
        int randIndex =(int)Math.floor(Math.random()*brands.length);
        String randBrands = brands[randIndex];



        if (randBrands.equals("BMW") ) {

            String modelsBMW[] = {"E90", "E91", "E92", "E93"};
            int randBMW = (int) Math.floor(Math.random() * modelsBMW.length);
            String randModelsBMW = modelsBMW[randBMW];

            String str1 = "E90";
            String str2 = "E91";
            String str3 = "E92";
            String str4 = "E93";

            ArrayList bmwModels = new ArrayList<>();
            bmwModels.add(str1);
            bmwModels.add(str2);
            bmwModels.add(str3);
            bmwModels.add(str4);

            return new Car(randBrands,randModelsBMW,randColor, buildCar().note, buildCar().year);

        } else if (randBrands.equals("AUDI")) {
            String modelsAUDI[] = {"A4", "A5", "A6"};
            int randAUDI = (int) Math.floor(Math.random() * modelsAUDI.length);
            String randModelsAUDI = modelsAUDI[randAUDI];

            return new Car(randBrands,randModelsAUDI,randColor, buildCar().note, buildCar().year);
        }else {
            String modelsMERCEDES[] = {"W201", "AMG", "W203"};
            int randMercedes = (int) Math.floor(Math.random() * modelsMERCEDES.length);
            String randModelsMERCEDES = modelsMERCEDES[randMercedes];

            return new Car(randBrands,randModelsMERCEDES,randColor, buildCar().note, buildCar().year);
        }
    }
}
