# language: es

Característica: Validar la creacion de un usuario en Advantage
  Yo como agente de Advantage
  deseo crear un usuario
  para verificar que la creacion es exitosa.

  @InicializarActor
  Escenario: Validar la creacion de un usuario en Advantage
    Cuando creo el usuario 'test' en Advantage
    Y consulto el usuario creado
    Entonces la fecha de actualizacion concuerda con la de creacion