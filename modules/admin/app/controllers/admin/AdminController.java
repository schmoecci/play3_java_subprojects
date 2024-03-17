package controllers.admin;

import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class AdminController extends Controller {

    public Result index() {
        return ok(views.html.index.render());
    }

}
