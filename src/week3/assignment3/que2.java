package week3.assignment3;

public class que2 {
    static class ExamHall {
        String hallName;
        int seatsFilled;
    }

    public static void main(String[] args) {
        ExamHall hallA = new ExamHall();
        hallA.hallName = "Block-3 Hall A";
        hallA.seatsFilled = 0;

        ExamHall hallB = new ExamHall();
        hallB.hallName = "Block-3 Hall B";
        hallB.seatsFilled = 0;

        hallA.seatsFilled++;
        hallA.seatsFilled++;
        hallA.seatsFilled++;
        hallA.seatsFilled++;

        System.out.println(hallA.hallName + " seatsFilled: " + hallA.seatsFilled);
        System.out.println(hallB.hallName + " seatsFilled: " + hallB.seatsFilled);
    }
}
