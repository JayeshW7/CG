class GrandFather {
    public void show() {
        System.out.println("I am grandfather.");
    }
}

class Father extends GrandFather {
    public void show() {
        System.out.println("I am father.");
    }
}

class Daughter extends Father {
    public void show() {
        System.out.println("I am a daughter.");
    }
}
public class Son extends Father {
    public void show() {
        System.out.println("I am son.");
    }


    public static void main(String args[]) {
        Son sonObj = new Son();
        sonObj.show();
        
        Daughter daughterObj = new Daughter();
        daughterObj.show();
    }
}
