package functionalInterfaces;

import java.util.function.*;

/**
 * Created by Marwan on 9/2/2021 around 7:23 AM
 */
public class PrimitiveFunctionalInterfaces {

    public static void main(String[] args) {


        // java.util.function.IntPredicate - Always accepts int as input
        // boolean test(int value);
        IntPredicate intPredicate = a -> a % 2 == 1;
        System.out.println("intPredicate "+intPredicate.test(21));

        // java.util.function.DoublePredicate - Always accepts double as input
        //boolean test(double value);
        DoublePredicate doublePredicate = a-> (a/2.5)>1.5;
        System.out.println("doublePredicate "+doublePredicate.test(5.85));

        // java.util.function.LongPredicate - Always accepts long as input
        //boolean test(long value);
        LongPredicate longPredicate = p-> (p+25487456L)>32569874562L;
        System.out.println("longPredicate = " + longPredicate.test(3256478));

        //java.util.function.IntFunction <R> Always accepts int as input and return any type as output
        //R apply(int value);
        IntFunction<String> intFunction = a -> {
            if (a>=0 && a<=10) return "Tens";
            else if (a>10 && a<=100) return "Hundreds";
            else if (a>100 && a<=1000) return "Thousands";
            else return "out of specified limits";
        };
        System.out.println("intFunction = " + intFunction.apply(2000));

        IntFunction<Integer> intFunction1 = a ->{
            if (a>10) return 100;
            else return 25;
        };

        System.out.println("intFunction1.apply(20000) = " + intFunction1.apply(20000));

        // java.util.function.DoubleFunction <R> - Always accepts double as input and return any type as output
        //R apply(double value)

        DoubleFunction<Character> doubleFunction = a-> {
            if (a-10==4) return 'a';
            else return 'b';
        };

        System.out.println(doubleFunction.apply(14));

        /**
         // java.util.function.IntPredicate - Always accepts int as input
         // boolean test(int value);

         // java.util.function.DoublePredicate - Always accepts double as input
         //boolean test(double value);

         // java.util.function.LongPredicate - Always accepts long as input
         //boolean test(long value);

         //java.util.function.IntFunction <R> - Always accepts int as input and return any type as output
         //R apply(int value);

        // java.util.function.LongFunction <R> - Always accepts long as input and return any type as output
        //R apply(long value);

        // java.util.function.ToIntFunction <T> - Always return int value but accepts any type as input
        //int applyAsInt (T value);

        // java.util.function.ToDoubleFunction <T> - Always return double value but accepts any type as input
        //double applyAsDouble (T value);

        // java.util.function.ToLongFunction <T> - Always return long value but accepts any type as input
        //long applyAsLong (T value);

        // java.util.function.IntToLongFunction - Always takes int type as input and return long as return type
        //long applyAsLong (int value);

        // java.util.function.IntToDoubleFunction - Always takes int type as input and return double as return type
        //double applyAsDouble (int value);

        // java.util.function.LongToIntFunction - Always takes long type as input and return int as return type
        //int applyAsInt (long value);

        // java.util.function.LongToDoubleFunction - Always takes long type as input and return double as return type
        //double applyAsDouble (long value);

        // java.util.function.DoubleToIntFunction - Always takes double as input and return int as return type
        //int applyAsInt (double value);

        // java.util.function.DoubleToLongFunction - Always takes double type as input and return long as return type
        //long applyAsLong (double value);

        // java.util.function.ToIntBiFunction - Always takes 2 input parameters of any type and return int as return type
        //int applyAsInt (T t, U u);

        // java.util.function.ToLongBiFunction - Always takes 2 input parameters of any type and return long as return type
        //long applyAsLong (T t, U u);

        // java.util.function.ToDoubleBiFunction - Always takes 2 input parameters of any type and return double as return type
        //double applyAsDouble (T t, U u);

        // java.util.function.IntConsumer - Always accepts int value as input
        //void accept(int value);

        // java.util.function.LongConsumer - Always accepts long value as input
        //void accept(long value);

        // java.util.function.DoubleConsumer - Always accepts double value as input
        //void accept(double value);

        // java.util.function.ObjIntConsumer <T> - Always accepts 2 inputs of type int and any data type
        //void accept(T t, int value);

        // java.util.function.ObjLongConsumer <T> - Always accepts 2 inputs of type long and any data type
        //void accept(T t, long value);

        // java.util.function.ObjDoubleConsumer <T> - Always accepts 2 inputs of type double and any data type
        //void accept(T t, double value);

        // java.util.function.IntSupplier - Always return int value as output
        //int getAsInt();

        // java.util.function.LongSupplier - Always return long value as output
        //long getAsLong();

        // java.util.function.DoubleSupplier - Always return double value as output
        //double getAsDouble();

        // java.util.function.BooleanSupplier - Always return boolean value as output
        //boolean getAsBoolean();

        // java.util.function.IntUnaryOperator - Always accept and return int values
        //int applyAsInt (int operand);

        // java.util.function.LongUnaryOperator - Always accept and return long values
        //long applyAsLong (long operand);

        // java.util.function.DoubleUnaryOperator - Always accept and return double values
        //double applyAsDouble (double operand);

        // java util function IntBinaryOperator - Always accept 2 input parameters and return in int values
        //int applyAsInt (int left, int right);

        // java.util.function.LongBinaryOperator - Always accept 2 input parameters and return in long values
        //long applyAsLong (long left, long right);

        // java.util.function.DoubleBinaryOperator Always accept 2 input parameters and return in double values
        //double applyAsDouble (double left, double right);
         */
    }
}
