package com.alabtaal.inventory;

import com.alabtaal.inventory.config.StageManager;
import com.alabtaal.inventory.enums.FxmlView;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class JavaFXApplication extends Application {

    protected ConfigurableApplicationContext springContext;
    protected StageManager stageManager;

    @Override
    public void init(){
        springContext=springBootApplicationContext();

    }

    public void start(Stage stage)  {
        stageManager=springContext.getBean(StageManager.class,stage);
        displayInitialScene();

    }

    protected void displayInitialScene()
    {
        stageManager.switchScene(FxmlView.Login);
    }
    @Override
    public void stop()
    {
        springContext.close();
    }


    private ConfigurableApplicationContext springBootApplicationContext()
    {
        final SpringApplicationBuilder builder=new SpringApplicationBuilder(InventoryApplication.class);
        builder.headless(false);
        final String[] args=getParameters().getRaw().toArray(new String[0]);
        return builder.run(args);
    }
}
