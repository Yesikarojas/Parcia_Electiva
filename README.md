# Parcia_Electiva
Integrantes: Yesika Rojas - Juan Manuel López Pachón.
#
La aplicacion no pudo ser desplegada en Heroku.
Por lo tanto hay que usar el repositorio la API esta en la rama Master.
#
Ejemplo para consumir la api desde postman...
las routas serian:
  students: http://localhost:8080/students/
  matters: http://localhost:8080/matters/
  student_has_matters: http://localhost:8080/stumatt/
 
 el id del student se autogenera.
 el code de matters hay que ingresarlo.
 el id de student_matters se autogenera.
 
 
 ejemplo crear matter:
 {
	"code":"888",
	"description":"Calculo Iv",
	"cedits":"4"
}

ejemplo crear student:
{
	"lastName":"Rojas",
	"name":"Yesika",
	"birthday":"2001-08-12",
	"phone":"3125678909"
}

ejemplo crear student_has_matter:
{
	"student":{
		"id":#idgenerado
	},
	"matter":{
		"code":"el code"
	}
}
