# language: es

Característica: Validar que la compra de un artículo sea exitosa.
  Yo como cliente de saucedemo
  deseo comprar un artículo
  para verificar que la compra sea exitosa.

  Escenario: Validar que la compra de un artículo sea exitosa.
    Dado que René ingresa a la pagina Saucedemo con el usuario estandar
    Cuando René compra el articulo "Sauce Labs Backpack"
    Entonces debería visualizar el siguiente mensaje: "THANK YOU FOR YOUR ORDER"