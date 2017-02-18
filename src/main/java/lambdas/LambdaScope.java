package lambdas;

import java.util.function.Consumer;

/**
 * Created by daro on 18/02/17.
 */


/**
 *
 Like local and anonymous classes, lambda expressions can capture variables; they have the same access to local
 variables of the enclosing scope. However, unlike local and anonymous classes, lambda expressions do not have
 any shadowing issues (see Shadowing for more information). Lambda expressions are lexically scoped. This means
 that they do not inherit any names from a supertype or introduce a new level of scoping. Declarations in a lambda
 expression are interpreted just as they are in the enclosing environment
 */
public class LambdaScope {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {

            // The following statement causes the compiler to generate
            // the error "local variables referenced from a lambda expression
            // must be final or effectively final" in statement A:
            //
            // x = 99;

            Consumer<Integer> myConsumer = (y) ->
            {
                System.out.println("x = " + x); // Statement A
                System.out.println("y = " + y);
                System.out.println("this.x = " + this.x);
                System.out.println("LambdaScopeTest.this.x = " +
                        LambdaScope.this.x);
            };

            myConsumer.accept(x);

        }
    }

    public static void main(String... args) {
        LambdaScope st = new LambdaScope();
        LambdaScope.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}