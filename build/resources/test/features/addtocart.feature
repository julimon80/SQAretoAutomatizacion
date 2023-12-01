#language:en

  Feature: cart
    Scenario Outline: add 2 products in the cart
      Given that user has opened website
      When  he wants add products
         | namefirstproduct| numberoffirstproduct| namesecondproduct| numberofsecondproduct|
         | <namefirstproduct>| <numberoffirstproduct>|<namesecondproduct>|<numberofsecondproduct>|
      Then he should see products

      Examples:
      |namefirstproduct|numberoffirstproduct|namesecondproduct|numberofsecondproduct |
      | Riviera        |   2                |    Manarola     |        5             |

