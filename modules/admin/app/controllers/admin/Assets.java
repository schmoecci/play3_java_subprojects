package controllers.admin;

import javax.inject.Inject;

import play.api.mvc.*;

public class Assets {
    @Inject
    controllers.Assets assetsController;


    public Action<AnyContent> at(String path, String file) {
        return assetsController.at(path, file, false);
    }

    public Action<AnyContent> versioned(String path, controllers.Assets.Asset file) {
        return assetsController.versioned(path, file);
    }
}