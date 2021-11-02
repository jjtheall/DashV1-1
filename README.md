# Omnipod Dash Version 1.1

## What is this project?

This is a program that emulates the functionality of the Personal Diabetes Management system called the Omnipod Dash created by Insulet. It (is a work in progress but eventually) will include a bolus calculator, a user programmable basal rate system, insulin delivery and blood glucose history, pod expiry, and other small features of the Dash.

## How to run this project?

I am using JavaFX and Java 12 to create the GUI. JavaFX will not work with Java versions later than 12, so in your project structure you must change the project SDK to Java 12. 

Additionally, I am using the JavaFX library in the JavaFX SDK version 17.0.0.1. In the modules section, you must add this library titled "lib" in this SDK folder. You can download this SDK at https://gluonhq.com/products/javafx/

Finally, if you get errors that there are modules missing, in the run configurations VM options, include this line: --module-path <lib folder destination> --add-modules=javafx.controls,javafx.fxml
  
## Documentation

change this when startupscene and boluscalc are working w FXML files
  
## Credits

**Jack Theall**: Programmed entire application and created all documentation
