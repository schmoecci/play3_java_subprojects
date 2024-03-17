package controllers.website;

import controllers.AssetsMetadata;
import javax.inject.Inject;
import play.api.Environment;
import play.api.http.HttpErrorHandler;
import play.api.mvc.*;

public class Assets extends controllers.Assets {

    @Inject
    public Assets(HttpErrorHandler errorHandler, AssetsMetadata meta, Environment env) {
        super(errorHandler, meta, env);
    }

    public Action<AnyContent> at(String path, String file) {
        boolean aggressiveCaching = true;
        return super.at(path, file, aggressiveCaching);
    }
}