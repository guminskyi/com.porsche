@porsche
Feature: Buy a Porsche
  Scenario: 1-6
    Given User opens the browser and goes to Porsche website
    When User selects model 718 and stores the price of 718 Cayman Model S and clicks on 718 Cayman S
    Then User verifies that Base price displayed on the page is same as the price from the previous step
  Scenario: 1-7
    Given User opens the browser and goes to Porsche website
    When User selects model 718 and stores the price of 718 Cayman Model S and clicks on 718 Cayman S
    Then User verifies that Price for Equipment is 0
  Scenario:  1-8
    Given User opens the browser and goes to Porsche website
    When User selects model 718 and stores the price of 718 Cayman Model S and clicks on 718 Cayman S
    Then User verifies that total price is the sum of base price plus Delivery Processing and Handling Fee
  Scenario: 1-10
    Given User opens the browser and goes to Porsche website
    When User selects model 718 and stores the price of 718 Cayman Model S and clicks on 718 Cayman S
    Then User selects color Miami Blue
    Then User verifies that Price for Equipment is Equal to Miami Blue price
  Scenario:  1-11
    Given User opens the browser and goes to Porsche website
    When User selects model 718 and stores the price of 718 Cayman Model S and clicks on 718 Cayman S
    Then User selects color Miami Blue
    Then User verifies that total price is the sum of base price plus Price for Equipment plus Delivery Processing and Handling Fee
  Scenario: 1-13
    Given User opens the browser and goes to Porsche website
    When User selects model 718 and stores the price of 718 Cayman Model S and clicks on 718 Cayman S
    Then User selects color Miami Blue
    Then User selects 20 Carrera Sport Wheels
    Then User verifies that Price for Equipment is the sum of Miami Blue price plus 20 Carrera Sport Wheels14
  Scenario: 1-14
    Given User opens the browser and goes to Porsche website
    When User selects model 718 and stores the price of 718 Cayman Model S and clicks on 718 Cayman S
    Then User selects color Miami Blue
    Then User selects 20 Carrera Sport Wheels
    Then User verifies that total price is the sum of base price plus Price for Equipment plus Delivery Processing and Handling Fee
  Scenario: 1-16
    Given User opens the browser and goes to Porsche website
    When User selects model 718 and stores the price of 718 Cayman Model S and clicks on 718 Cayman S
    Then User selects color Miami Blue
    Then User selects 20 Carrera Sport Wheels
    Then User selects seats Power Sport Seats 14 way with Memory Package
    Then User verifies that Price for Equipment is the sum of Miami Blue price plus 20 Carrera Sport Wheels plus Power Sport Seats 14 way with Memory Package
  Scenario: 1-17
    Given User opens the browser and goes to Porsche website
    When User selects model 718 and stores the price of 718 Cayman Model S and clicks on 718 Cayman S
    Then User selects color Miami Blue
    Then User selects 20 Carrera Sport Wheels
    Then User selects seats Power Sport Seats 14 way with Memory Package
    Then User verifies that total price is the sum of base price plus Price for Equipment plus Delivery Processing and Handling Fee
  Scenario: 1-20
    Given User opens the browser and goes to Porsche website
    When User selects model 718 and stores the price of 718 Cayman Model S and clicks on 718 Cayman S
    Then User selects color Miami Blue
    Then User selects 20 Carrera Sport Wheels
    Then User selects seats Power Sport Seats 14 way with Memory Package
    Then User clicks on Interior Carbon Fiber
    Then User selects Interior Trim in Carbon Fiber icw Standard Interior
    Then User verifies that Price for Equipment is the sum of Miami Blue price plus 20 Carrera Sport Wheels plus Power Sport Seats 14-way with Memory Package plus Interior Trim in Carbon Fiber icw Standard Interior
  Scenario: 1-21
    Given User opens the browser and goes to Porsche website
    When User selects model 718 and stores the price of 718 Cayman Model S and clicks on 718 Cayman S
    Then User selects color Miami Blue
    Then User selects 20 Carrera Sport Wheels
    Then User selects seats Power Sport Seats 14 way with Memory Package
    Then User clicks on Interior Carbon Fiber
    Then User selects Interior Trim in Carbon Fiber icw Standard Interior
    Then User verifies that total price is the sum of base price plus Price for Equipment plus Delivery Processing and Handling Fee
  Scenario: 1-25
    Given User opens the browser and goes to Porsche website
    When User selects model 718 and stores the price of 718 Cayman Model S and clicks on 718 Cayman S
    Then User selects color Miami Blue
    Then User selects 20 Carrera Sport Wheels
    Then User selects seats Power Sport Seats 14 way with Memory Package
    Then User clicks on Interior Carbon Fiber
    Then User selects Interior Trim in Carbon Fiber icw Standard Interior
    Then User clicks on Performance
    Then User selects 7-speed Porsche Doppelkupplung PDK
    Then User selects Porsche Ceramic Composite Brakes PCCB
    Then User verifies that Price for Equipment is the sum of Miami Blue price plus 20 Carrera Sport Wheels plus Power Sport Seats 14-way with Memory Package plus Interior Trim in Carbon Fiber icw Standard Interior plus 7 speed Porsche Doppelkupplung PDK plus Porsche Ceramic Composite Brakes PCCB
  Scenario: 1-26
    Given User opens the browser and goes to Porsche website
    When User selects model 718 and stores the price of 718 Cayman Model S and clicks on 718 Cayman S
    Then User selects color Miami Blue
    Then User selects 20 Carrera Sport Wheels
    Then User selects seats Power Sport Seats 14 way with Memory Package
    Then User clicks on Interior Carbon Fiber
    Then User selects Interior Trim in Carbon Fiber icw Standard Interior
    Then User clicks on Performance
    Then User selects 7-speed Porsche Doppelkupplung PDK
    Then User selects Porsche Ceramic Composite Brakes PCCB
    Then User verifies that total price is the sum of base price plus Price for Equipment plus Delivery Processing and Handling Fee





