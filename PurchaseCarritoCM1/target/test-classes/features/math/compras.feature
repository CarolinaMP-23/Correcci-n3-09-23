Feature: Purchase products

  @happyPath
  Scenario Outline: Proceso de compra

  //Usuario agrega dos productos al carrito y visualizar el carrito
    Examples:
      |  |

  Scenario Outline: Usuario agrega dos productos al carrito y visualizar el carrito
    Given usuario está en la página de compra
    When selecciona dos productos
    Then Agrega productos al carrito de compras
    And Visualiza el carrito
    Examples:
  Scenario: Completa el formulario y finaliza la compra
    When Usuario ingresa datos <name> <Country> <City> <Credit Card> <Month> <Year>
    Then veo nuevo formulario


