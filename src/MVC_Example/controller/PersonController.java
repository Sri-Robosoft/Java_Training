package MVC_Example.controller;

import MVC_Example.model.PersonModel;
import MVC_Example.view.PersonView;

public class PersonController {
    public PersonModel model;
    public PersonView view;

//     view.personDetails(model);

    public void displayDetails() {
        view.personDetails(model);
    }

}
