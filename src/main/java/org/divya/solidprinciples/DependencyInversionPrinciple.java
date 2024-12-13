package org.divya.solidprinciples;

/*
Class should depend on interfaces rather than concrete class
 */
public class DependencyInversionPrinciple {
    //wrong
    class Macbook {
        private final WiredKeyBoard keyboard;
        private final WiredMouse mouse;

        Macbook(WiredKeyBoard keyboard, WiredMouse mouse) {
            this.keyboard = keyboard;
            this.mouse = mouse;
        }

//        public void MacBook() {
//            this.keyboard = new WiredKeyBoard();
//            this.mouse = new WiredMouse();
//        }
    }

    interface KeyBoard { }

    interface Mouse {}


    class WiredKeyBoard implements KeyBoard{
        WiredKeyBoard() {}
    }

    class WiredMouse implements Mouse{
        WiredMouse() {}
    }

    //correct
    class MacBook2 {
        private final KeyBoard keyboard;
        private final Mouse mouse;

        MacBook2(KeyBoard keyboard, Mouse mouse) {
            this.keyboard = keyboard;
            this.mouse = mouse;
        }
    }

}
