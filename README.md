## Statement Of The Work

Usta Donerci is a restaurant that sells fast-food, doner, meatball and drinks. When customer arrive at this restaurant, they can select their order and design order with custom product which is decorator. After create order, the waitress delivers these orders to the cook from the customer. The cook is responsible for cook eatable order and preparing the drink according to customer order. 

Customer can select Doners, Beverages, Meatballs and Kid Size menu as a menu. They can select doner type and doner size in the doner menu. In the beverage menu, they can select hot or cold beverage and if they want to cold, they can add ice. If they want hot beverage, they can add extra component to their beverages which differ beverages. In the meatball menu they can select which size of meatball and they can modifies  their meatball order with salad, appetizer , fries, sauce. In the kid size menu, they can select meat, meatball or chicken sandwich type and they can buy toy and sauce. 

## Proposed Pattern

Many design patterns are applied for solving existing problems in the project. These design patterns are Command Pattern, Simple Factory Pattern, Template Method Pattern and Decorator Pattern.

Firstly, customers create a doner (Doner Order), meatball (Meatball Order), KidMenu (KidMenu order) or hot/cold beverage (Hot/Cold Beverage Order) order and the waitress (Invoker) delivers these orders to the cook (Receiver). The cook works with Meatball Factory for meatball order , Doner Factory for doner order , Kid Menu Factory for kidmenu order, Hot Beverage Factory for hot beverage order and Cold Beverage Factory for cold beverage order. To do this, the cook uses factory methods differ to which type of order. (Simple Factory Pattern).

Kid Menu Factory create Kid Menu and to do this create KidMenu Abstract Class. There are three kinds of KidMenu such as Meat, Chicken and Meatball in Usta Donerci and these kid menu types implement KidMenu Abstract Class. The customers had chosen KidMenu sauce or toy according to the kid menu they had previously wanted. The KidMenu is decorated according to these toy or sauce decorators. (Decorator Pattern). 

There are 2 Decorator classes for KidMenu decoration such as Toy Decorator, Sauce Decorator. Cost of the KidMenu is calculated according to decoration. 

There are 1 Decorator classes for Doner decoration such as Size Decorator. Cost of the Doner is calculated according to decoration. 

There are 4 Decorator classes for KidMenu decoration such as Salad Decorator, Appetizer Decorator, Fries Decorator, Sauce Decorator. Cost of the Meatball is calculated according to decoration.


Finally, Beverage Factories is responsible for hot and cold beverages creation and creates Beverage interface. Hot Beverage and Cold Beverage abstract classes implement this interface. Subclasses such as tea, coffee, cola etc. extend these classes. The distinction between them is the difference in the preparation of hot and cold beverages (Template Method Pattern). Also, there are some differences in subclasses. Finally, hook() is used for each hot beverage and the customer is asked if some extra condiments are wanted. 

## UML Diagram
![general](https://i.hizliresim.com/lA3ccr.png)

