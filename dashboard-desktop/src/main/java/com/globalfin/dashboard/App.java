package com.globalfin.dashboard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Punto de entrada de la aplicación GlobalFin Dashboard.
 * 
 * Aplicación de escritorio para analistas bancarios con interfaz
 * optimizada para manejo masivo de datos y atajos de teclado.
 */
public class App extends Application {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    
    private static final String APP_TITLE = "GlobalFin Dashboard";
    private static final String MAIN_FXML = "/fxml/MainWindow.fxml";
    private static final int WINDOW_WIDTH = 1400;
    private static final int WINDOW_HEIGHT = 900;

    /**
     * Punto de entrada de JavaFX
     */
    @Override
    public void start(Stage primaryStage) {
        try {
            logger.info("Iniciando aplicación: {}", APP_TITLE);
            
            // Cargar FXML principal
            FXMLLoader loader = new FXMLLoader(getClass().getResource(MAIN_FXML));
            Parent root = loader.load();
            
            // Crear escena con CSS
            Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);
            applyTheme(scene);
            
            // Configurar ventana principal
            primaryStage.setTitle(APP_TITLE);
            primaryStage.setScene(scene);
            primaryStage.setMinWidth(1200);
            primaryStage.setMinHeight(800);
            
            // Mostrar ventana
            primaryStage.show();
            
            logger.info("Aplicación iniciada exitosamente");
            
        } catch (Exception e) {
            logger.error("Error al iniciar la aplicación", e);
            System.exit(1);
        }
    }

    /**
     * Aplicar tema (light/dark) y tokens CSS
     */
    private void applyTheme(Scene scene) {
        try {
            String tokensCSS = getClass().getResource("/css/tokens.css").toExternalForm();
            String themeCSS = getClass().getResource("/css/light-theme.css").toExternalForm();
            
            scene.getStylesheets().addAll(tokensCSS, themeCSS);
            logger.debug("Temas aplicados correctamente");
        } catch (Exception e) {
            logger.warn("No se pudieron cargar los temas CSS", e);
        }
    }

    /**
     * Punto de entrada del programa
     */
    public static void main(String[] args) {
        launch(args);
    }
}
