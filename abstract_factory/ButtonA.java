package abstract_factory;

class ButtonA extends Button {
    public ButtonA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("+------------+");
        System.out.println("| " + text + " |");
        System.out.println("+------------+");
    }
}

class TextFieldA extends TextField {
    public TextFieldA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("------------");
        System.out.println("| " + text + " |");
        System.out.println("------------");
    }
}

class CheckboxA extends Checkbox {
    public CheckboxA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("[ ] " + text);
    }
}
