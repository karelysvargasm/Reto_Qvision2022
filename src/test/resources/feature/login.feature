#language: es
#kvargas@qvision.us

  Característica: Yo como usuario quiero loguearame en la página Swaglabs,
    deseo ingresar mis credenciales validas,
    para que me permita ingresar a la pagina  exitosamente.

    @test
  Escenario: Loguearme con credenciales validas en el sistema
    Dado que Karelys esta en la pagina SAUCEDEMO
    Cuando ingreso mis credenciales validas usuario standard_user y contrasena secret_sauce
    Entonces me permite ingresar al sistema de manera exitosa

      Dado que Karelys esta en la pagina SAUCEDEMO
      Cuando ingreso mis credenciales validas usuario standard_user y contrasena secret_sauce
      Entonces me permite ingresar al sistema de manera exitosa

