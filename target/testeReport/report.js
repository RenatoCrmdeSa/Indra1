$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CadastroCartao.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: gloureirog@indracompany.com"
    },
    {
      "line": 2,
      "value": "# encoding: iso-8859-1"
    }
  ],
  "line": 4,
  "name": "Registro de Tarjeta - Website Banco Ripley",
  "description": "\r\nYo como Analista de pruebas\r\nQuiero registrar una tarjeta",
  "id": "registro-de-tarjeta---website-banco-ripley",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@ProjetoBancoRipley"
    }
  ]
});
formatter.scenario({
  "line": 11,
  "name": "Registro de tarjeta",
  "description": "",
  "id": "registro-de-tarjeta---website-banco-ripley;registro-de-tarjeta",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@CT001"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "CT01 - Acceder la Página principal",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "CT01 - Ir a creditos",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "CT01 - Ir a creditos2",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "CT01 - Ir a creditos3",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "CT01 - Ir a creditos4",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "CT01 - Ir a creditos5",
  "keyword": "When "
});
formatter.match({
  "location": "CadastroCartaoTest.acessarPaginaCadastro()"
});
formatter.result({
  "duration": 9439198170,
  "status": "passed"
});
formatter.match({
  "location": "CadastroCartaoTest.irCredito1()"
});
formatter.result({
  "duration": 7060235082,
  "status": "passed"
});
formatter.match({
  "location": "CadastroCartaoTest.irCredito2()"
});
formatter.result({
  "duration": 4579189636,
  "status": "passed"
});
formatter.match({
  "location": "CadastroCartaoTest.irCredito3()"
});
formatter.result({
  "duration": 4559271873,
  "status": "passed"
});
formatter.match({
  "location": "CadastroCartaoTest.irCredito4()"
});
formatter.result({
  "duration": 4650106100,
  "status": "passed"
});
formatter.match({
  "location": "CadastroCartaoTest.irCredito5()"
});
formatter.result({
  "duration": 5596237408,
  "status": "passed"
});
formatter.after({
  "duration": 260086315,
  "status": "passed"
});
});