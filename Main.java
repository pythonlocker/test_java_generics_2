public class Main {
    public static void main (String[] args) {
        A<C> a = new A<C>(new C());
        System.out.println(a.toString());
    }

    static class A<T> {
        private T mT;
        A(T t) {
            mT = t; 
        }

        T getT(){
            return mT;
        }

        public String toString() {
            return this.getClass().getSimpleName() + " with " +
                this.mT.getClass().getSimpleName();
        }
    }

    static class B {
        B() {
        }

        public String toString() {
            return this.getClass().getSimpleName();
        }
    }

    static class C extends Main.B {
        C() {
        }

        public String toString() {
            return this.getClass().getSimpleName();
        }
    }

}
