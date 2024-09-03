package abstract_factory;

class ButtonB extends Button {
    public ButtonB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("**************");
        System.out.println("* " + text + " *");
        System.out.println("**************");
    }
}

class TextFieldB extends TextField {
    public TextFieldB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("************");
        System.out.println("* " + text + " *");
        System.out.println("************");
    }
}

class CheckboxB extends Checkbox {
    public CheckboxB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("[X] " + text);
    }
}
