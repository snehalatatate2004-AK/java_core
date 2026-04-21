 public class PropertyTaxExample {
 
     double calculateTax(double propertyvalue){
        return propertyvalue * 0.5;
    }
    double calculateTax(double propertyvalue, double rate ){
        return propertyvalue * rate;
    }
    double calculateTax(double propertyvalue,double rate, double extraCharge){
        return(propertyvalue* rate) + extraCharge ;
    }
    public static void main(String[] args){
        PropertyTaxExample prop = new PropertyTaxExample();

        System.out.println();                                                                              

    }
 }