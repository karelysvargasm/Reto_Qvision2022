#language: es
#kvargas@qvision.us

Característica: Yo como usuario logueado exitosamente en Swaglabs,
  deseo organizar los productos por precio,
  para validar que me muestre los de mayor valor.

  Antecedentes:
    Dado que Karelys esta en la pagina SAUCEDEMO

  @test2
  Escenario: Filtrado de productos
    Cuando ingreso mis credenciales validas usuario standard_user y contrasena secret_sauce
    Y realice el ordenamiento de productos por la opcion 'Price high to low'
    Entonces los productos son ordenados por precios de mayor a menor