Feature: Formulario
	Scenario Outline: Preencher o formulario
	Given que o usuario acessa a aplicacao
	When clica em Forms
	And clica Practice Form
	And preenche os campos:
		|firstName 			|<firstName> 			|
		|lastName 			|<lastName> 			|
		|email 					|<email> 					|
		|gender 				|<gender> 				|
		|mobile 				|<mobile> 				|
		|subject 				|<subject> 				|
		|hobbies 				|<hobbies> 				|
		|currentAddress |<currentAddress> |
		|state 					|<state> 					|
		|city 					|<city> 					|
		And clica no botao Submit
		Then o sistema apresenta a mensagem de sucesso
		
	Examples:
	| firstName | lastName | email 								| gender | mobile     | dateBirth | subject | hobbies | currentAddress   | state | city  |
	| James 	 | Good      | james.good@email.com | Male   | 5599727217 | 01011987  | Test    | Sports  | Rua Sei Lay, 965 | NCR   | Noida |
	