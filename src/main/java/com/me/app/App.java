package com.me.app;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.me.app.resources.AppResource;
import com.me.app.health.TemplateHealthCheck;

/**
 * Hello world!
 *
 */
public class App extends Application<AppConfiguration>
{
    public static void main( String[] args ) throws Exception
    {
        //System.out.println( "Hello World!" );
    	new App().run(args);
    }

    @Override
    public void initialize(Bootstrap<AppConfiguration> bootstrap) {
    	//stuff
    }

    public void run(AppConfiguration configuration, Environment environment) {
    	final AppResource resource = new AppResource(
        	configuration.getTemplate(),
        	configuration.getDefaultName()
    	);
    	environment.jersey().register(resource);

    	final TemplateHealthCheck healthCheck = new TemplateHealthCheck(
    		configuration.getTemplate());
    	environment.healthChecks().register("template", healthCheck);
    	environment.jersey().register(resource);
    }

}
