package controllers

import play.api.mvc.{ Action, Controller }

class Application() extends Controller {
  def index = Action { implicit reqest =>
    val jsFileName = "bundle.js"
    val jsLocation = routes.Assets.versioned(jsFileName).toString
    Ok(views.html.app("play-scala-react-boilerplate", jsLocation))
  }
}

