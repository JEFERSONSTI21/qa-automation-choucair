# language: es

@Cucumber
Característica: Realizar el logueo y creación de una reunion en el portal https://serenity.is/demo/

  Yo Como: Equipo -  QA
  Quiero: Realizar el logueo y creación de una reunion en el portal https://serenity.is/demo/
  Para: para verificar la correcta funcionalidad del portal https://serenity.is/demo/

  Escenario: En portal https://serenity.is/demo/ se realiza el logueo y creación de una reunion en el portal

    Dado Que el Usuario entra al portal y ingresa usuario y clavw
    Cuando el usuario crea una Business Unit
    Entonces el usuario crea una Meetings


