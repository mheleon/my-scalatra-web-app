
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/layouts/*2.9*/.html.default("Scalatra: a tiny, Sinatra-like web framework for Scala", "Welcome to Scalatra")/*2.103*/{_display_(Seq[Any](format.raw/*2.104*/("""
  """),format.raw/*3.3*/("""<p>Hello, Twirl!</p>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-08-29T10:58:23.564
                  SOURCE: /home/mako/workspace/scalatraTest/my-scalatra-web-app/src/main/twirl/views/hello.scala.html
                  HASH: 6a5309d0d842c7b54c83aa665c985afefdc12c70
                  MATRIX: 559->1|655->5|669->12|772->106|811->107|840->110
                  LINES: 14->1|19->2|19->2|19->2|19->2|20->3
                  -- GENERATED --
              */
          