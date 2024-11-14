package MVC_Example.view;

import MVC_Example.model.PersonModel;

public class PersonView {
    public void personDetails(PersonModel model) {
        System.out.println(model.getName());
        System.out.println(model.getFullName());
        System.out.println(model.getAgeInSeconds());
        System.out.println(model.getNumberOfSkills());
        System.out.println(model.getRoundedWeight());
    }
}
