<a id="readme-inicio"></a>

<div align="center">

![java](https://img.shields.io/badge/Java-17.0.12-red)
![spring](https://img.shields.io/badge/Spring-3.3.5-red)
![hibernate](https://img.shields.io/badge/Hibernate-6.5.3-red)
![mysql](https://img.shields.io/badge/MySQL-8.0.40-red)
![flyway](https://img.shields.io/badge/Flyway-10.10.0-red)
![auth0jwt](https://img.shields.io/badge/Auth0JWT-4.4.0-red)
![lombok](https://img.shields.io/badge/Lombok-1.18.34-red)
![springdoc](https://img.shields.io/badge/SpringDoc-2.6.0-red)
![intellij](https://img.shields.io/badge/IntelliJ-CE%202024.2.2-red)
</div>

<div align="center">

![license](https://img.shields.io/badge/License-0BSD-brightgreen)
![update](https://img.shields.io/badge/Update-16%2FNov%2F2024-blue)
![version](https://img.shields.io/badge/Version-1.0.0-blue)
![stage](https://img.shields.io/badge/Stage-Release-blue)

</div>

<h1 align="center">ForoHub</h1>
<div align="center"><img alt="ForoHub" src="assets/logotipo.jpg" style="width:35%;height:35%;" /></div> 


<a id="readme-indice"></a>
## Índice de Contenidos:
---
- [Contexto](#contexto)
- [Guía de Usuario](#guía-de-usuario)
- [Guía de Instalación](#guía-de-instalación)
- [Autor](#autor)
- [Licencia](#licencia)
- [Agradecimientos](#agradecimientos)
- [Documentos Complementarios](#documentos-complementarios)


## Contexto
---

ForoHub es una aplicación desarrollada en Java con el entorno IntelliJ para el desafío del curso &quot;Practicando Spring Framework: Challenge Foro Hub&quot; de ONE + Alura Latam. Ha sido manufacturada por su autor (con asistencia de IA) en Noviembre de 2024.

<div align="right">&#8593; <a href="#readme-indice">Índice</a> &#8593; <a href="#readme-inicio">Inicio</a> &#8593;</div>

## Guía de Usuario
---
Esta aplicación es una API REST que implementa parcialmente la funcionalidad de un foro.

Se encuentran completos los CRUDs en relación a <code>topico</code> (desafío obligatorio) y <code>usuario</code> (desafío optativo).

Como provee una interfaz amigable gracias al uso de SpringDoc-Swagger (desafío optativo) es fácilmente accesible con un enlace similar al siguiente:

http://localhost:8080/swagger-ui/index.html

(De todos modos, se provee un conjunto de requests en un archivo importable desde Insomnia).

Vale destacar que el servicio de autenticación se basa en Auth0-JWT, y que las contraseñas de los usuarios son almacenadas previa encriptación con Bcrypt.

Respecto de la BBDD, es posible hacer el seguimiento de su desarrollo a través de las sucesivas migraciones de Flyway.
    
A continuación, unas muestras de las interfaces utilizando SpringDoc-Swagger e Insomnia:

<table align="center" style="border:0">
<tr>
<td align="left"><img src="assets/screenshot1.jpg" /></td>
<td align="left"><img src="assets/screenshot2.jpg" /></td>
</tr>
</table>

<div align="right">&#8593; <a href="#readme-indice">Índice</a> &#8593; <a href="#readme-inicio">Inicio</a> &#8593;</div>

## Guía de Instalación
---
Simplemente se requiere clonar este proyecto en el repositorio local, y luego ejecutarlo con un IDE acorde (como IntelliJ, Eclipse, etc) desde el método <code>main</code> de la clase <code>ForoHubApplication</code>.

Dado que la aplicación trabaja con una base de datos, se requiere un servidor MySQL 8.0.40 o superior previamente instalado. (Se proveen scripts SQL para pruebas).

Importante: No olvidar declarar las variables de entorno que se utilizan en <code>application.properties</code>.

<div align="right">&#8593; <a href="#readme-indice">Índice</a> &#8593; <a href="#readme-inicio">Inicio</a> &#8593;</div>

## Autor
---
César es alumno de Alura. Inició su formación en Junio de 2024 dentro del plan Oracle Next Education para Latinoamérica. Tiene 55 años y es nacido en Buenos Aires.

<div align="right">&#8593; <a href="#readme-indice">Índice</a> &#8593; <a href="#readme-inicio">Inicio</a> &#8593;</div>

## Licencia 
---
Licencia BSD Zero Clause (0BSD) detallada en <code>LICENSE.txt</code> en la raíz del repositorio. Más información en https://opensource.org/license/0bsd

<div align="right">&#8593; <a href="#readme-indice">Índice</a> &#8593; <a href="#readme-inicio">Inicio</a> &#8593;</div>

## Agradecimientos 
---
* Generador de logotipo : https://chatgpt.com
* Generador de favicon : https://favicon.io

<div align="right">&#8593; <a href="#readme-indice">Índice</a> &#8593; <a href="#readme-inicio">Inicio</a> &#8593;</div>

## Documentos Complementarios
---
* Clonar un repositorio de GitHub : https://docs.github.com/es/repositories/creating-and-managing-repositories/cloning-a-repository
* Scripts SQL para pruebas : https://github.com/cesargh/forohub/tree/master/sql
* Requests de Insomnia : https://github.com/cesargh/forohub/tree/master/insomnia

<div align="right">&#8593; <a href="#readme-indice">Índice</a> &#8593; <a href="#readme-inicio">Inicio</a> &#8593;</div>
