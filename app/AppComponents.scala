import controllers._
import play.api.ApplicationLoader.Context
import play.api.{ BuiltInComponents, BuiltInComponentsFromContext }
import play.api.libs.ws.ahc.AhcWSComponents
import play.api.routing.Router
import router.Routes

trait ControllersComponent {
  self: BuiltInComponents =>
  def appController = new Application()
  val assets = new controllers.Assets(httpErrorHandler)
  val router: Router = new Routes(httpErrorHandler, appController, assets)
}

class AppComponents(context: Context)
  extends BuiltInComponentsFromContext(context)
  with AhcWSComponents
  with ControllersComponent
