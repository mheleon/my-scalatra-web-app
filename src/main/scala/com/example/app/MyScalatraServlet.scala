package com.example.app

import org.scalatra._
import org.scalatra.i18n.I18nSupport
import org.scalatra.forms._

// https://scalatra.org/guides/2.6/formats/forms.html
// Base in code source https://github.com/scalatra/scalatra-website-examples/tree/master/2.6/formats/scalatra-forms

case class ValidationForm(fname: String, lname: String)

class MyScalatraServlet extends ScalatraServlet with FormSupport with I18nSupport {

  val form = mapping(
    "fname" -> label("FisrtName", text(required, maxlength(100))),
    "lname" -> label("LastName", text(required, maxlength(100)))
  )(ValidationForm.apply)

  get("/") {
    "hello MHL"
  }

  get("/datainurl") {
    // how to use: http://localhost:8080/datainurl?user=maheleon&nickname=Mako
    val user = params.get("user")
    val nickname = params.get("nickname")
    <p>user:
      {user}
      nickname:
      {nickname}
    </p>
  }

  get("/form") {
    <form action="/res_form" method="POST">
      <label for="fname">First name:</label> <br></br>
      <input type="text" id="fname" name="fname" value="Maykol"/> <br></br>
      <label for="lname">Last name:</label> <br></br>
      <input type="text" id="lname" name="lname" value="HL"/> <br></br>
      <input type="submit" value="Submit"/>
    </form>
  }

  post("/res_form") {
    validate(form)(
      errors => errors,
      form => s"hello ${form.fname} ${form.lname}"
    )
  }

}
