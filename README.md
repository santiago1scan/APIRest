# APIRest
Created <Esteban Santiago>

Descripción del contexto

La empresa lo ha contratado para desarrollar un sistema que permite gestionar las conferencias a ofrecer. El
administrador de la aplicación podrá registrar cada conferencia. Una conferencia tiene id, nombre y cantidad
máximade artículos a recibir.
Con el propósito de que el estudiante entienda cómo utilizar las tecnologías para desarrollar el servidor que
ofrece una API REST a los clientes, se ha planteado el desarrollo de un Sprint inicial en el cual se crearán un
conjunto de servicios REST que utilizan el lenguaje java, el framework Spring, la herramienta Spring boot y la
aplicación postman o thunder.

Requisitosfuncionales a implementar

Yo como administrador quiero registrar una conferencia para que expositores puedan presentar sus artículos.
Yo como administrador quiero listar las conferencias registradas para que expositores puedan ver en cuales
conferencias presentar sus artículos.
Yo como administrador quiero consultar si existe una conferencia para establecer si se pueden registrar
artículos
Yo como administrador quiero consultar la cantidad de artículos registrados en una conferencia para ver si
alcanzo su tope.

Servicios REST

Debe crear 3 servicios REST uno para cada funcionalidad.
 El primer servicio recibe una conferencia a registrar y retorna la conferencia registrada
 El segundo servicio permite listar las conferencias registradas
 El tercerservicio REST recibe el ID de una conferencia y retorna si existe o no existe
 El cuarto servicio REST recibe el ID de una conferencia y retorna la cantidad de artículos que tiene
registrados. Como aún no se han asociado artículos a conferencias por medio de una base de datos,
retorne un valor generado aleatoriamente.

Basic API Rest 
