package app;

import com.yahoo.elide.standalone.config.ElideStandaloneSettings;

import java.io.IOException;
import java.util.Optional;
import java.util.Properties;

public class Settings implements ElideStandaloneSettings {
    @Override
    public Properties getDatabaseProperties() {
        Properties dbProps;
        try {
            dbProps = new Properties();
            dbProps.load(
                    Main.class.getClassLoader().getResourceAsStream("dbconfig.properties")
            );
            return dbProps;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
    @Override
    public int getPort() {
        return Optional.ofNullable(System.getenv("PORT"))
                .map(Integer::valueOf)
                .orElse(8080);
    }

    @Override
    public boolean enableApiDocs() {
        return true;
    }

    @Override
    public String getApiDocsPathSpec() {
        return "/doc/*";
    }

    @Override
    public String getJsonApiPathSpec() {
        return "/api/*";
    }

    @Override
    public String getGraphQLApiPathSpec() {
        return "/graphql/api/*";
    }

    @Override
    public String getModelPackageName() {
        return "models";
    }
}