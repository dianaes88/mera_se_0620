package src.lesson5;

public class Main {

    public static void main(String[] args) {
        UI scene = new UI(Parameters.parameters.SCENE_LENGHT_X.getValue(), Parameters.parameters.SCENE_LENGHT_Y.getValue());
        AddElementOnClick addElementOnClick = new AddElementOnClick("'addElementOnClick'", 0, 0, 0, 0, scene);
        scene.addElement(addElementOnClick);

        for(int i = 0; i < 10; i++){
            addElementOnClick.onButtonClick();
        }

        for (Rectangle i : scene.getElementsOnScene()) {
            if (i instanceof AddElementOnClick){
                System.out.println(i + "\n");
            }
            if (i instanceof TextField){
                System.out.println(i);
                System.out.println("Text is " + "'" + ((TextField) i).getText() + "'\n");
            }
            if (i instanceof Button){
                System.out.println(i);
                ((Button) i).click();
            }
            if (i instanceof CheckBox){
                System.out.println(i);
                ((CheckBox) i).click();
            }
        }
    }
}