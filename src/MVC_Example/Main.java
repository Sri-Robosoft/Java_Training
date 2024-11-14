package MVC_Example;

import MVC_Example.controller.PersonController;
import MVC_Example.model.PersonModel;
import MVC_Example.view.PersonView;

public class Main {
    public static void main(String[] args) {

        PersonModel personModel = new PersonModel(70,"Jeevan" ,"Jain",5.9f,50.443,true, new String[]{"Java", "JavaScript", "SQL"});

        PersonView personView = new PersonView();

        PersonController personController = new PersonController();
        personController.model = personModel;
        personController.view = personView;

        personController.displayDetails();


    }
}
