package Java.Sample.src;

import java.time.*;
import java.util.Scanner;
import java.util.TimerTask;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);
        // String input = "";
        // ArrayList<String> list = new ArrayList<>();

        // while (true) {
        // System.out.print("Enter something: ");
        // input = scanner.nextLine();
        // if (input.equals("end"))
        // break;
        // else
        // list.add(input);
        // }

        // System.out.println(list);

        // try {
        // double aa = 1 / 0;
        // System.out.println(aa);
        // } catch (ArithmeticException e) {
        // System.out.println(e);
        // } catch (Exception e) {
        // System.out.println(e);
        // } finally {
        // scanner.close();
        // System.out.println("This always executes");
        // }

        // try (FileWriter writer = new FileWriter("something.txt")) {
        // writer.write("I like pizza");
        // System.out.println("somethinggg");
        // } catch (FileNotFoundException e) {
        // System.out.println(e);
        // } catch (IOException e) {
        // System.out.println(e);
        // }

        // LocalDate date = LocalDate.now();
        // System.out.println(date);
        // LocalTime time = LocalTime.now();
        // System.out.println(time);
        // LocalDateTime dateTime = LocalDateTime.now();
        // System.out.println(dateTime);
        // Instant instant = Instant.now();
        // System.out.println(instant);

        // DogTwo dog1 = new DogTwo();
        // DogTwo dog2 = new DogTwo() {
        // @Override
        // void speak() {
        // System.out.println("Hell yeahhh");
        // }
        // };

        // dog1.speak();
        // dog2.speak();

        // Timer timer = new Timer();
        // TimerTask task = new TimerTask() {

        // int count = 3;

        // @Override
        // public void run() {
        // System.out.println("Hellooo");
        // count--;
        // if (count == 0) {
        // System.out.println("task complete");
        // timer.cancel();
        // }
        // }
        // };
        // timer.schedule(task, 0, 1000);

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 10;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count < 0) {
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 0, 1000);
    }
}
