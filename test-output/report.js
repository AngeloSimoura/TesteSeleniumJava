$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/preencherFormulario.feature");
formatter.feature({
  "name": "Formulario",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Preencher o formulario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "que o usuario acessa a aplicacao",
  "keyword": "Given "
});
formatter.step({
  "name": "clica em Forms",
  "keyword": "When "
});
formatter.step({
  "name": "clica Practice Form",
  "keyword": "And "
});
formatter.step({
  "name": "preenche os campos:",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "firstName",
        "\u003cfirstName\u003e"
      ]
    },
    {
      "cells": [
        "lastName",
        "\u003clastName\u003e"
      ]
    },
    {
      "cells": [
        "email",
        "\u003cemail\u003e"
      ]
    },
    {
      "cells": [
        "gender",
        "\u003cgender\u003e"
      ]
    },
    {
      "cells": [
        "mobile",
        "\u003cmobile\u003e"
      ]
    },
    {
      "cells": [
        "subject",
        "\u003csubject\u003e"
      ]
    },
    {
      "cells": [
        "hobbies",
        "\u003chobbies\u003e"
      ]
    },
    {
      "cells": [
        "currentAddress",
        "\u003ccurrentAddress\u003e"
      ]
    },
    {
      "cells": [
        "state",
        "\u003cstate\u003e"
      ]
    },
    {
      "cells": [
        "city",
        "\u003ccity\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "clica no botao Submit",
  "keyword": "And "
});
formatter.step({
  "name": "o sistema apresenta a mensagem de sucesso",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "email",
        "gender",
        "mobile",
        "dateBirth",
        "subject",
        "hobbies",
        "currentAddress",
        "state",
        "city"
      ]
    },
    {
      "cells": [
        "James",
        "Good",
        "james.good@email.com",
        "Male",
        "5599727217",
        "01011987",
        "Test",
        "Sports",
        "Rua Sei Lay, 965",
        "NCR",
        "Noida"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Preencher o formulario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario acessa a aplicacao",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.MenuInicialSteps.que_o_usuario_acessa_a_aplicacao()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "clica em Forms",
  "keyword": "When "
});
formatter.match({
  "location": "steps.MenuInicialSteps.clica_em_Forms()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "clica Practice Form",
  "keyword": "And "
});
formatter.match({
  "location": "steps.MenuFormSteps.clica_Practice_Form()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "preenche os campos:",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "steps.PracticeFormSteps.preenche_os_campos(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "clica no botao Submit",
  "keyword": "And "
});
formatter.match({
  "location": "steps.PracticeFormSteps.clica_no_botao_Submit()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", null);
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta a mensagem de sucesso",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.PracticeFormSteps.o_sistema_apresenta_a_mensagem_de_sucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png", null);
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});