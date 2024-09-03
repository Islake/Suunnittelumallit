package abstract_factory;
abstract class UIElement {
    protected String text;

    public UIElement(String text) {
        this.text = text;
    }

    public abstract void display();

    public void setText(String text) {
        this.text = text;
    }
}

abstract class Button extends UIElement {
    public Button(String text) {
        super(text);
    }
}

abstract class TextField extends UIElement {
    public TextField(String text) {
        super(text);
    }
}

abstract class Checkbox extends UIElement {
    public Checkbox(String text) {
        super(text);
    }
}
