Feature: Puma

  Scenario: Registro de compras shoes
    Given 'PHP travel' page is loaded
    And hover 'Check mens' button in 'mens' page
    And click 'Check futbol' button in 'shoes' page
    And click 'Check Shoe' button in 'shoes' page
    And click 'Check tam' button in 'shoes' page
    And click 'Check Size' button in 'shoes' page
    And click 'Check AddCar' button in 'shoes' page
    Then validate 'CantIsOne' is 'Car' top page
    And click 'Check viewCar' button in 'shoes' page
    And Verify "Calzado de Fútbol X 18.3 TF" title is displayed
    Then Verify "$1,329.00" should be displayed
    Then Verify "$1,428.00" price Total





